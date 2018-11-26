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
 * Servlet implementation class PrivilegeServlet
 */
@WebServlet("/PrivilegeServlet")
public class PrivilegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HibernateUtil hb = new HibernateUtil();
	
		String funcionario = request.getParameter("funcionarioElegido");
		String id = funcionario.split("-")[1];
		
		boolean exito =
				
				hb.darPermisos(id);
		
		ArrayList<Contenedor> funcionarios = hb.encontrarFuncionarios();
		ArrayList<Contenedor> promociones = hb.encontrarPromociones();
		ArrayList<Contenedor> materiales = hb.encontrarMateriales();
		
		
		request.setAttribute("funcionarios", funcionarios);
		request.setAttribute("promociones", promociones);
		request.setAttribute("materiales", materiales);
		
		if(exito){
			
			request.getRequestDispatcher("/PaginaAdministrarExito.jsp").include(request, response);
			
		}else{
			
			request.getRequestDispatcher("/PaginaAdministrarFallo.jsp").include(request, response);
			
		}
		
		
		
		
		
		
	}

}
