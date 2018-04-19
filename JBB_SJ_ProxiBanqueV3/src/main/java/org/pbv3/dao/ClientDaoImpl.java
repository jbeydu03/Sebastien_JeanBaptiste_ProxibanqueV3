package org.pbv3.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.pbv3.model.AccountCurrent;
import org.pbv3.model.AccountSaving;
import org.pbv3.model.Client;

/**
 * Implémentation des méthodes de persistance imposées par l'interface liée.
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
public class ClientDaoImpl extends AbstractDao implements ClientDao {

	

	@Override
	public ArrayList<Client> selectAll() {

		EntityManagerFactory emf = getEmf();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		ArrayList<Client> clientList = new ArrayList<>();

		try {
			txn.begin();

			Query jQuery = em.createQuery("Select client From Client client");
			clientList = (ArrayList<Client>) jQuery.getResultList();

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

		}

		return clientList;

	}

	@Override
	public Client select(long id) {

		EntityManagerFactory emf = getEmf();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		Client client = null;

		try {
			// Début transaction
			txn.begin();

			// FIND
			client = em.find(Client.class, id);

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
		}

		return client;
	}

	@Override
	public boolean create(Client client) {

		EntityManagerFactory emf = getEmf();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			// Début transaction
			txn.begin();

			// PERSIST
			em.persist(client);

			// Fin transaction
			txn.commit();
		} catch (Exception e) {

			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return true;
	}

	@Override
	public boolean update(Client client) {

		EntityManagerFactory emf = getEmf();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			// Début transaction
			txn.begin();

			// MERGE
			em.merge(client);

			// Fin transaction
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return true;
	}

	@Override
	public boolean delete(long id) {
		EntityManagerFactory emf = getEmf();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			// Début transaction
			txn.begin();

			// REMOVE
			Client client = em.find(Client.class, id);
			em.remove(client);

			// Fin transaction
			txn.commit();
		} catch (Exception e) {

			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return true;
	}

}
