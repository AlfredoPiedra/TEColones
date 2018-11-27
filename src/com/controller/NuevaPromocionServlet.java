package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Contenedor;

/**
 * Servlet implementation class NuevaPromocionServlet
 */
@WebServlet("/NuevaPromocionServlet")
public class NuevaPromocionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HibernateUtil hb = new HibernateUtil();
		
		ArrayList<Contenedor> materiales = hb.encontrarMateriales();
		
		request.setAttribute("materiales", materiales);
		
		request.getRequestDispatcher("/PaginaPromociones.jsp").forward(request, response);
		
	}

}
