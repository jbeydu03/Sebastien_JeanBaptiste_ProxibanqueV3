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
	
	// **** Pour les tests MOKITO ***
	public void setDao(ClientDao dao) {
		this.dao = dao;
	}
	
	@Override
	public ArrayList<Client> selectAll() {

		ArrayList<Client> lClientAll = dao.selectAll();
		
		if (lClientAll.size() != 0) {
			sb.append("Liste de clients récupérée ");
			String textLog = sb.toString();
			LOGGER.trace(textLog);

		} else {
			sb.append("Liste de clients non récupérée ");
			String textLog = sb.toString();
			LOGGER.trace(textLog);
		}

			return lClientAll;
			
	}

	@Override
	public Client select(String clientId) {
		Long idLong = Long.valueOf(clientId);
		Client client = dao.select(idLong);
		if (client != null) {
			sb.append("Client : ").append(client.toString());
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
			sb.append("Client créé ");
			String textLog = sb.toString();
			LOGGER.trace(textLog);

		} else {
			response = Response.notModified().build();
			sb.append("Client non créé ");
			String textLog = sb.toString();
			LOGGER.trace(textLog);
		}

		return response;
	}


	@Override
	public Response update(Client client) {
		Response response = null;
		Boolean bo = dao.update(client);

		if (bo == true) {
			response = Response.ok().build();
			sb.append("Client modifié");
			String textLog = sb.toString();
			LOGGER.trace(textLog);

		} else {
			response = Response.notModified().build();
			sb.append("Client non  modifié ");
			String textLog = sb.toString();
			LOGGER.trace(textLog);
		}

		return response;
	}

	@Override
	public Response delete(String clientId) {
		Response response = null;
		Long idLong = Long.valueOf(clientId);

		Boolean bo = dao.delete(idLong);

		// OPERATION DAO

		if (bo == true) {
			response = Response.ok().build();
			sb.append("Client supprimé");
			String textLog = sb.toString();
			LOGGER.trace(textLog);

		} else {
			response = Response.notModified().build();
			sb.append("Client non supprimé ");
			String textLog = sb.toString();
			LOGGER.trace(textLog);
		}

		return response;
	}

}
