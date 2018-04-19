package org.pbv3.service;

import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.pbv3.model.Client;

/**
 * Implémentation des méthodes imposées par l'interface liée.
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
public class ClientServiceImpl implements ClientService {

	@Override
	public ArrayList<Client> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client select(String clientId) {
		Client cl = new Client("jb");
		
		// OPERATION DAO
		
		return cl;
	}

	@Override
	public Response create(Client client) {
		Response response = null;
		
		// OPERATION DAO
		
		if (client != null) {
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
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

	@Override
	public Response delete(String clientId) {
		Response response = null;
		Client client = new Client();
		// OPERATION DAO
		
		if (client != null) {
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		
		return response;
	}

}
