package org.pbv3.service;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*; // Attention pas auto !!
import org.pbv3.dao.ClientDao;
import org.pbv3.dao.ClientDaoImpl;
import org.pbv3.model.Client;

//
//import java.sql.SQLException;
//
//import static org.junit.Assert.*;
//
public class ClientServiceImplTest {

	// Mockito ne sait pas mocker : “final classes, final methods, enums, static
	// methods, private methods, the hashCode() and equals()
	// methods, anonymous classes and primitive types”

	@Mock
	ClientDao dao;
	private ClientServiceImpl service;

	@Before
	public void initialisation() {
		MockitoAnnotations.initMocks(this);
		service = new ClientServiceImpl();
		service.setDao(dao);
	}

	@Test
	public void create_should_create_client() {

		Client client = new Client();

		when(dao.create(client)).thenReturn(true);

		int responseOk = 200;

		assertTrue(service.create(client).getStatus() == responseOk);

		verify(dao).create(client);
	}

	@Test
	public void select_should_return_a_client() {

		Client client = new Client();

		when(dao.select(anyLong())).thenReturn(client);

		assertEquals(service.select("1"), client);

		verify(dao).select(anyLong());
	}

}
