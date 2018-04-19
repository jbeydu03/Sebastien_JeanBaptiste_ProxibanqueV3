package org.pbv3.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Client représentant les conseillers de proxibanque
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
@Entity
public class Advisor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String login;
	private String password;
	private ArrayList<Client> clientList;

	// *** Constructors ***
	public Advisor() {
	}

	public Advisor(String login) {
		this.login = login;
	}
	// *** Getters & Setters ***
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Client> getClientList() {
		return clientList;
	}

	public void setClientList(ArrayList<Client> clientList) {
		this.clientList = clientList;
	}

	// *** Methods ***
	@Override
	public String toString() {
		return login;
	}
}
