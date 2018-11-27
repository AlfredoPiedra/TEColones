package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Servlet utilizado para el registro
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String TipoUsuario = 
				request.getParameter("TipoUsuario");
		
		String Nombre = 
				request.getParameter("Nombre");
		
		String Apellidos = 
				request.getParameter("Apellidos");
		
		String Universidad = 
				request.getParameter("Universidad");
		
		String Contrasena = 
				request.getParameter("Contrasena");
		
		String Correo = 
				request.getParameter("Correo");
		
		String Telefono = 
				request.getParameter("Telefono");
		
		String Carnet = 
				request.getParameter("Carnet");
		
		String Carrera = 
				request.getParameter("Carrera");
		
		String Habilidades = 
				request.getParameter("Habilidades");
		
		String Descripcion = 
				request.getParameter("Descripcion");
		
		String contadorCorreos = 
				request.getParameter("contadorCorreo");
		
		String contadorTelefonos = 
				request.getParameter("contadorTelefono");
		
		ArrayList<String> correos = 
				new ArrayList<String>();
		
		ArrayList<String> telefonos = 
				new ArrayList<String>();
		
		if(contadorCorreos != ""){
			
			int totalCorreos = 
					Integer.parseInt(contadorCorreos);
			
			for(int i = 0; i < totalCorreos; ++i){
				
				correos.add(request.getParameter( "Correo"+String.valueOf(i) ));
				
			}
			
		}
		
		if(contadorTelefonos != ""){
			
			int totalTelefonos = 
					Integer.parseInt(contadorTelefonos);
			
			
			for(int i = 0; i < totalTelefonos; ++i){
				
				telefonos.add(request.getParameter( "Telefono"+String.valueOf(i) ));
				
			}
			
		}
		
		HibernateUtil hb = new HibernateUtil();
		hb.registrarUsuario(TipoUsuario, 
										Nombre, 
										Apellidos, 
										Universidad, 
										Contrasena, 
										Correo, 
										Telefono, 
										Carnet, 
										Carrera, 
										Habilidades, 
										Descripcion, 
										correos, 
										telefonos);
	    
	    request.getRequestDispatcher("/PaginaInicioCorreo.jsp").include(request, response);
		
	}

}


/*PrintWriter out = 
response.getWriter();
out.println(TipoUsuario);*/
