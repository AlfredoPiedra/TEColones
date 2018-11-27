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
 * Servlet implementation class TasaCambioServlet
 */
@WebServlet("/TasaCambioServlet")
public class TasaCambioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HibernateUtil hb = new HibernateUtil();
		
		boolean resultado = hb.asignarTipoCambio(Double.parseDouble(request.getParameter("tasa")));
		
		ArrayList<Contenedor> funcionarios = hb.encontrarFuncionarios();
		ArrayList<Contenedor> promociones = hb.encontrarPromociones();
		ArrayList<Contenedor> materiales = hb.encontrarMateriales();
		
		
		request.setAttribute("funcionarios", funcionarios);
		request.setAttribute("promociones", promociones);
		request.setAttribute("materiales", materiales);
		
		if(resultado){
			
			request.setAttribute("titulo", "Modificar tasa de cambio!");
			request.setAttribute("mensaje","Se modifico la tasa de cambio exitosamente.");
			request.getRequestDispatcher("/PaginaAdministrarExito.jsp").include(request, response);
			
		}else{
			
			request.setAttribute("titulo", "Modificar tasa de cambio!");
			request.setAttribute("mensaje","Error al modificar la tasa de cambio. Favor intente de nuevo.");
			request.getRequestDispatcher("/PaginaAdministrarFallo.jsp").include(request, response);
			
		}
		
		
	}

}
