package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Contenedor;

/**
 * Servlet implementation class PromocionDobleServlet
 */
@WebServlet("/PromocionDobleServlet")
public class PromocionDobleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HibernateUtil hb = new HibernateUtil();
		
		String nombre = request.getParameter("nombre2");
		
		String materialA = request.getParameter("materialD1");
		String materialB = request.getParameter("materialD2");
		
		String valorA = request.getParameter("doble1");
		String valorB = request.getParameter("doble2");
		
		String fechaFinalB = request.getParameter("fecha3");
		String bono = request.getParameter("bonoD");
		
		boolean resultado = hb.crearPromocionDoble(nombre, materialA, materialB, valorA, valorB, fechaFinalB,bono);
		
		
		ArrayList<Contenedor> materiales = hb.encontrarMateriales();
		
		request.setAttribute("materiales", materiales);
		
		
		if(resultado){
			
			request.setAttribute("titulo", "Agregar material de reciclaje!");
			request.setAttribute("mensaje","Se agrego el material exitosamente.");
			request.getRequestDispatcher("/PaginaPromociones.jsp").include(request, response);
			
		}else{
			
			request.setAttribute("titulo", "Agregar material de reciclaje!");
			request.setAttribute("mensaje","Error al agregar el material. Favor intente de nuevo.");
			request.getRequestDispatcher("/PaginaPromociones.jsp").include(request, response);
			
		}
		
	}

}
