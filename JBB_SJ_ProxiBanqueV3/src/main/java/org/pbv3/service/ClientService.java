package org.pbv3.service;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.pbv3.model.Client;

/**
 * Interface qui impose les méthodes à implémenter pour intéragir avec la dao. 
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */

@Produces({ "application/xml", "application/json" })
public interface ClientService {

	@GET
	@Path("/clients/")
	public ArrayList<Client> selectAll();
	
	@GET
	@Path("/clients/{id}")
	public Client select(@PathParam("id") String clientId);
	
	@POST
	@Path("/clients/")
	public Response create(Client client);
	
	@PUT
	@Path("/clients/")
	public Response update(Client client);
	
	@DELETE
	@Path("/clients/{id}")
	public Response delete(@PathParam("id") String clientId);
}
