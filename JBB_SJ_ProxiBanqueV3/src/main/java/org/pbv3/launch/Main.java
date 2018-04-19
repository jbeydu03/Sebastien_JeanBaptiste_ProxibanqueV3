package org.pbv3.launch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.pbv3.model.Account;
import org.pbv3.model.AccountCurrent;
import org.pbv3.model.AccountSaving;
import org.pbv3.model.Advisor;
import org.pbv3.model.Client;

public class Main {

	public static void main(String[] args) {

		// testJPA();
		testCoucheDao();
	}

	public static void testCoucheDao() {

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
			client_1.addCurrentAccount(accountCurrent_1);
			client_1.addSavingAccount(accountSaving_1);
			client_2.addSavingAccount(accountSaving_2);
			em.persist(client_1);
			em.persist(client_2);

			// em.persist(expenditureSheet_1);
			//
			// em.persist(consumer_1);
			// em.persist(consumer_2);
			// em.persist(consumer_3);
			//
			// em.persist(expense_1);
			// em.persist(expense_2);
			// em.persist(expense_3);
			//
			// // Find comment_good vargood
			// System.out.println(((Comment_Good) (em.find(Expense.class,
			// 1L).getComment())).getVarGood());
			//
			// // Remove
			// em.remove(expense_1);

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
