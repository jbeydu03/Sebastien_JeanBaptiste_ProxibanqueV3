package org.pbv3.model;

import javax.persistence.Entity;

/**
 * Classe repr�sentant les comptes courants des clients.
 * 
 * @author Jean-Baptiste & S�bastien
 *
 */
@Entity
public class AccountCurrent extends Account{

	public static final double OVERDRAFT = -500.01;
}
