package org.pbv3.service;

import java.util.ArrayList;

import javax.xml.ws.Response;

import org.pbv3.model.Client;

/**
 * Interface qui impose les méthodes à implémenter pour intéragir avec la dao. 
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
public interface ClientService {

	@GET
	public ArrayList<Client> selectAll();
	
	@GET
	public Client select(String clientId);
	
	@POST
	public Response create(Client client);
	
}
