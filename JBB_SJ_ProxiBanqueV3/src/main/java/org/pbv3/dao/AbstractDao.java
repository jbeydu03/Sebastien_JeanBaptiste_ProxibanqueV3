package org.pbv3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.pbv3.model.AccountCurrent;
import org.pbv3.model.AccountSaving;
import org.pbv3.model.Client;

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
	
	public static void generateClient() {
		
		ClientDao dao = new ClientDaoImpl();
		
		

		
		Client client_1 = new Client();
		client_1.setName("Name_1");
		client_1.setFamilyName("FamilyName_1");
		client_1.setEmail("mail@mail.com_1");
		client_1.setAddress("Adress_1");
		client_1.setSavingAccount(new AccountSaving());
		client_1.setCurrentAccount(new AccountCurrent());
		dao.create(client_1);
		
		
		
		Client client_2 = new Client();
		client_2.setName("Name_2");
		client_2.setFamilyName("FamilyName_2");
		client_2.setEmail("mail@mail.com_2");
		client_2.setAddress("Adress_2");
		client_2.setSavingAccount(new AccountSaving());
		client_2.setCurrentAccount(new AccountCurrent());
		dao.create(client_2);
		
		
		Client client_3 = new Client();
		client_3.setName("Name_3");
		client_3.setFamilyName("FamilyName_3");
		client_3.setEmail("mail@mail.com_3");
		client_3.setAddress("Adress_3");
		client_3.setSavingAccount(new AccountSaving());
		client_3.setCurrentAccount(new AccountCurrent());
		dao.create(client_3);
	}
	
	
	
	
}
