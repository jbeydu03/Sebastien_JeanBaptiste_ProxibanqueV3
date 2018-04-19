package org.pbv3.model;

/**
 * Classe rep�sentant les clients de Proxibanque
 * 
 * @author Jean-Baptiste & S�bastien
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
