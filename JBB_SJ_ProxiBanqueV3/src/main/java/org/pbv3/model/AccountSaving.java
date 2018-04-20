package org.pbv3.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * Classe repr�sentant les comptes �pargnes des Clients. 
 * 
 * @author  Jean-Baptiste & S�bastien
 *
 */
@Entity
public class AccountSaving extends Account{

	public static final double RATIO = 0.02;
	
	public AccountSaving() {
		
	}
	
	
	
}
