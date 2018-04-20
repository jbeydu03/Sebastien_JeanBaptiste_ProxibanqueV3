package org.pbv3.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pbv3.service.ClientService;
import org.pbv3.service.ClientServiceImpl;

/**
 * Servlet qui demande à un service les données d'un client en BDD.
 * Revoie à modifierClient.jsp 
 * 
 * @author Jean-Baptiste & Sébastien
 */

@WebServlet("/AffichageClient")
public class AffichageClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AffichageClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ClientService cService = new ClientServiceImpl();
		String idClient = request.getParameter("idclient");
		request.setAttribute("client", cService.select(idClient));
		RequestDispatcher dispatcher = request.getRequestDispatcher("modifierClient.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
