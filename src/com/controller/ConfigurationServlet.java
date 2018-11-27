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
@WebServlet("/ConfigurationServlet")
public class ConfigurationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * Recibe el llamado para desplegar la información en la página de administrador
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HibernateUtil hb = new HibernateUtil();
		
		ArrayList<Contenedor> funcionarios = hb.encontrarFuncionarios();
		ArrayList<Contenedor> promociones = hb.encontrarPromociones();
		ArrayList<Contenedor> materiales = hb.encontrarMateriales();
		
		
		request.setAttribute("funcionarios", funcionarios);
		request.setAttribute("promociones", promociones);
		request.setAttribute("materiales", materiales);
		
		request.getRequestDispatcher("/PaginaAdministrar.jsp").forward(request, response);
		
		
	}

	
	
}
