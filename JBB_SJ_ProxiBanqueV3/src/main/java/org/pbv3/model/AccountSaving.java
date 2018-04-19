package org.pbv3.model;

import javax.persistence.Entity;

/**
 * Classe représentant les comptes épargnes des Clients. 
 * 
 * @author  Jean-Baptiste & Sébastien
 *
 */
@Entity
public class AccountSaving extends Account{

	public static final double RATIO = 0.02;
}
