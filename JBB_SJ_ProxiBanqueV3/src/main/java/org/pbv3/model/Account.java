package org.pbv3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Classe Abstraite dont hérite les comptes courants et épargnes.
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double balance;

	@OneToOne
	@JoinColumn(name = "client_id")
	private Client client;

	// *** Constructors ***
	public Account() {
	}

	// *** Getters & Setters ***
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// *** Methods ***
	@Override
	public String toString() {
		return "(" + balance + ")";
	}

}
