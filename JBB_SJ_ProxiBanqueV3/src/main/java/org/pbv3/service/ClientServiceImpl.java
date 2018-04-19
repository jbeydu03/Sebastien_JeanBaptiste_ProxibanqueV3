package org.pbv3.service;

import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.pbv3.dao.ClientDao;
import org.pbv3.dao.ClientDaoImpl;
import org.pbv3.launch.Main;
import org.pbv3.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implémentation des méthodes imposées par l'interface liée.
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
public class ClientServiceImpl implements ClientService {

	ClientDao dao = new ClientDaoImpl();
	private static Logger LOGGER = LoggerFactory.getLogger(ClientServiceImpl.class);
	StringBuilder sb = new StringBuilder();
	
	@Override
	public ArrayList<Client> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
	@Override
	public Client select(String clientId) {
		Long idLong = Long.valueOf(clientId);
		Client client = dao.select(idLong);
		if (client != null) {
			sb.append("Client : " ).append(client.toString());
			String texteLog = sb.toString();
			LOGGER.trace(texteLog);

		} else {
			sb.append("Client non créé");
			String texteLog = sb.toString();
			LOGGER.trace(texteLog);
		}
		return client;
	}

	@Override
	public Response create(Client client) {
		Response response = null;
		
		Boolean bo = dao.create(client);
		
		if (bo == true) {
			response = Response.ok().build();
			sb.append("Client créé " );
			String textLog = sb.toString();
			LOGGER.trace(textLog);
			
		} else {
			response = Response.notModified().build();
			sb.append("Client non créé " );
			String textLog = sb.toString();
			LOGGER.trace(textLog);
		}

		return response;
	}

	@Override
	public Response update(Client client) {
		Response response = null;
		
		// OPERATION DAO
		
		if (client != null) {
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

	
	
//	@Override
//	public Response deleteExpense(String id) {

//		Expense expense = dao.getExpenseJPA(idLong);
//
//		if (expense != null) {
//
//			dao.deleteExpenseJPA(expense);
//			response = Response.ok(true).build();
//
//		} else {
//			response = Response.notModified().build();
//		}
//
//		System.out.println("---> deleteExpense() <---");
//		return response;
//	}
	
	
	

	
	@Override
	public Response delete(String clientId) {
		Response response = null;
		Long idLong = Long.valueOf(clientId);
		
		Boolean bo = dao.delete(idLong);
		

		// OPERATION DAO
		
		if (bo == true) {
			response = Response.ok().build();
			sb.append("Client supprimé" );
			String textLog = sb.toString();
			LOGGER.trace(textLog);
			
		} else {
			response = Response.notModified().build();
			sb.append("Client non supprimé " );
			String textLog = sb.toString();
			LOGGER.trace(textLog);
		}
		
		return response;
	}

}
