package com.wellsfargo.counselor.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

	@Id
	@GeneratedValue
	private long portfolioId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clientId", referencedColumnName = "clientId")
	private Client client;

	@OneToOne(mappedBy = "portfolio")
	private Security security;

	@Column(nullable = false)
	private String creationDate;

	public long getId() {
		return portfolioId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

}
