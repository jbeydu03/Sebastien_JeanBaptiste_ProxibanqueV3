package org.pbv3.dao;

import java.util.ArrayList;

import org.pbv3.model.Client;

/**
 * Impl�mentation des m�thodes de persistance impos�es par l'interface li�e.
 * 
 * @author Jean-Baptiste & S�bastien
 *
 */
public class ClientDaoImpl extends AbstractDao implements ClientDao{

	@Override
	public ArrayList<Client> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Client client) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
