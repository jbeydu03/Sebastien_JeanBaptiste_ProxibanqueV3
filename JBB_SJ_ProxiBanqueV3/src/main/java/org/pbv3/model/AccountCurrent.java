package org.pbv3.model;

import javax.persistence.Entity;

/**
 * Classe représentant les comptes courants des clients.
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
@Entity
public class AccountCurrent extends Account{

	public static final double OVERDRAFT = -500.01;
}
