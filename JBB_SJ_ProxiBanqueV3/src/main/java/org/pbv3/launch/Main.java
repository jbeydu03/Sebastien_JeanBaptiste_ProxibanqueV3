package org.pbv3.launch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.pbv3.dao.AbstractDao;
import org.pbv3.dao.ClientDao;
import org.pbv3.dao.ClientDaoImpl;
import org.pbv3.model.AccountCurrent;
import org.pbv3.model.AccountSaving;
import org.pbv3.model.Advisor;
import org.pbv3.model.Client;
import org.pbv3.presentation.TraitementLogin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		
		// testJPA();
//		testCoucheDao();
		
		AbstractDao.generateClient();
	}

	public static void testCoucheDao() {

		ClientDao dao = new ClientDaoImpl();

		// CREATE
		LOGGER.error("RETOUR DAO CREATION : " + dao.create(new Client("New client 1")));
		Client client = new Client("New client 2");
		LOGGER.error("RETOUR DAO CREATION : " + dao.create(client));

		// READ
		LOGGER.error("RETOUR DAO READ :" + dao.select(1L));

		// DELETE
		LOGGER.error("RETOUR DAO DELETE :" + dao.delete(1L));

		// UPDATE
		client.setAddress("NEW ADRESS");
		LOGGER.error("RETOUR DAO UPDATE :" + dao.update(client));

		// GET ALL
		LOGGER.error("RETOUR DAO get all :" + dao.selectAll());

	}

	public static void testJPA() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			// Début transaction
			txn.begin();

			// Test persistance
			Advisor advisor_1 = new Advisor("advisor 1");
			em.persist(advisor_1);

			AccountCurrent accountCurrent_1 = new AccountCurrent();
			AccountSaving accountSaving_1 = new AccountSaving();
			AccountSaving accountSaving_2 = new AccountSaving();

			Client client_1 = new Client("Client 1");
			Client client_2 = new Client("Client 2");
			client_1.setCurrentAccount(accountCurrent_1);
			client_1.setSavingAccount(accountSaving_1);
			client_2.setSavingAccount(accountSaving_2);
			em.persist(client_1);
			em.persist(client_2);

			// Fin transaction
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}

	}

}
