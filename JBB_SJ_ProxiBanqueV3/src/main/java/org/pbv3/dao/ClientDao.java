package org.pbv3.dao;

import java.util.ArrayList;

import org.pbv3.model.Client;

/**
 * Interface qui impose les méthodes de persistance des clients dans la base de
 * données.
 * 
 * @author Jean-Baptiste & Sébastien
 *
 */
public interface ClientDao {

	public ArrayList<Client> selectAll();

	public Client select();

	public boolean create(Client client);

	public boolean update(Client client);

	public boolean delete(String id);

}
