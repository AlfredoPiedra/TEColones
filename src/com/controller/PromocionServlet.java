package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PromocionServlet
 */
@WebServlet("/PromocionServlet")
public class PromocionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Servlet usado para crear promociones
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		 request.getRequestDispatcher("/PaginaAdministrar.jsp").include(request, response);
		
	}

}
