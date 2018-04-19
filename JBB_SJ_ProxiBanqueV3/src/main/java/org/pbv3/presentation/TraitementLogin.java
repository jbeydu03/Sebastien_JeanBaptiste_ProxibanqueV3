package org.pbv3.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class TraitementLogin
 */
@WebServlet("/TraitementLogin")
public class TraitementLogin extends HttpServlet {
	private static Logger LOGGER = LoggerFactory.getLogger(TraitementLogin.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraitementLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		String ppesudo = request.getParameter("pseudo");
		String plogin = request.getParameter("login");
		sb.append("Tentative de connexion du user : ").append(ppesudo);;
		String texteLog = sb.toString();
		
		LOGGER.trace(texteLog);
		RequestDispatcher dispatcher = request.getRequestDispatcher("accueil.html");
		dispatcher.forward(request, response);
	}

}
