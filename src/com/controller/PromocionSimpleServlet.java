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
 * Servlet implementation class PromocionSimpleServlet
 */
@WebServlet("/PromocionSimpleServlet")
public class PromocionSimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		HibernateUtil hb = new HibernateUtil();
		
		String nombre = request.getParameter("nombre1");
		String material = request.getParameter("materialS");
		String valor = request.getParameter("simple");
		String fechaFinal = request.getParameter("fecha1");
		String bono = request.getParameter("bonoS");
		
		boolean resultado = hb.crearPromocionSimple(nombre, material, valor, fechaFinal,bono);
		
		ArrayList<Contenedor> materiales = hb.encontrarMateriales();
		
		request.setAttribute("materiales", materiales);
		
		/*PrintWriter out = 
				response.getWriter();
		out.println(fechaFinal);*/
		
		if(resultado){
			
			request.setAttribute("titulo", "Agregar material de reciclaje!");
			request.setAttribute("mensaje","Se agrego el material exitosamente.");
			request.getRequestDispatcher("/PaginaPromocionesExito.jsp").include(request, response);
			
		}else{
			
			request.setAttribute("titulo", "Agregar material de reciclaje!");
			request.setAttribute("mensaje","Error al agregar el material. Favor intente de nuevo.");
			request.getRequestDispatcher("/PaginaPromocionesFallo.jsp").include(request, response);
			
		}
		
	}

}
