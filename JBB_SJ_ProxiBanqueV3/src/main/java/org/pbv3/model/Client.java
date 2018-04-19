package org.pbv3.model;

/**
 * Classe repésentant les clients de Proxibanque
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
public class Client {

	private long id;
	private String name;
	private String familyName;
	private String email;
	private String address;
	private AccountCurrent currentAccount;
	private AccountSaving savingAccount;
}
