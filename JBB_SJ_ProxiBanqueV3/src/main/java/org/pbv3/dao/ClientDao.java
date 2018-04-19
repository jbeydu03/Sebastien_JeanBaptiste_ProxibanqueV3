package org.pbv3.dao;

import java.util.ArrayList;

import org.pbv3.model.Client;

/**
 * Interface qui impose les m�thodes de persistance des clients dans la base de
 * donn�es.
 * 
 * @author Jean-Baptiste & S�bastien
 *
 */
public interface ClientDao {

	public ArrayList<Client> selectAll();

	public Client select();

	public boolean create(Client client);

	public boolean update(Client client);

	public boolean delete(String id);

}
