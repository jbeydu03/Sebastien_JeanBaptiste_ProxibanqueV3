package org.pbv3.model;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe repésentant les clients de Proxibanque
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */


@XmlRootElement
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String familyName;
	private String email;
	private String address;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "currentAccount_id")
	private AccountCurrent currentAccount;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "savingAccount_id")
	private AccountSaving savingAccount;

	// *** Constructors ***
	public Client() {
	}

	public Client(String name) {
		this.name = name;
	}

	// *** Getters & Setters ***
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AccountCurrent getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(AccountCurrent currentAccount) {
		this.currentAccount = currentAccount;
	}

	public AccountSaving getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(AccountSaving savingAccount) {
		this.savingAccount = savingAccount;
	}

	// *** Methods ***
	@Override
	public String toString() {
		return name;
	}

}
