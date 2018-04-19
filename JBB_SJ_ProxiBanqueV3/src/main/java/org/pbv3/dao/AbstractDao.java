package org.pbv3.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe abstraite permettant d'ouvrir une seule entity manager factory
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
public abstract class AbstractDao {
	
	private static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("my-pu");

	public static EntityManagerFactory getEmf() {
		return EMF;
	}
}
