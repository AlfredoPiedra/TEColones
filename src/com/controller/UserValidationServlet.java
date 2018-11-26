package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Usuario;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/UserValidationServlet" })
public class UserValidationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HibernateUtil hibutil = 
				new HibernateUtil();
		
		Usuario usuario = hibutil.encontrarUsuario("'"+request.getParameter("miuser")+"'", "'"+request.getParameter("mipass")+"'");
		
		
		if(usuario == null){
			
			request.getRequestDispatcher("/PaginaInicioFallo.html").include(request, response);
			
		}else{
			
			request.setAttribute("nombrecompleto", usuario.getNombre()+" "+usuario.getApellidos());
			request.setAttribute("universidad", usuario.getUniversidad());
			request.setAttribute("telefono",usuario.getTelefonos().get(0).getTelefono());
			request.setAttribute("correo", usuario.getCorreos().get(0).getCorreo());
			request.setAttribute("fecha", usuario.getFechaRegistro());
			request.setAttribute("carnet", usuario.getId());
			request.setAttribute("carrera", usuario.getCarrera());
			request.setAttribute("habilidades", usuario.getHabilidades());
			request.setAttribute("descripcion", usuario.getDescripcion());
			
			if(usuario.getTipoUsuario() == 1){
			
				
				request.getRequestDispatcher("/PaginaPerfil.jsp").forward(request, response);
				
				
			}else if(usuario.getTipoUsuario() == 2){
				
				request.getRequestDispatcher("/PaginaPerfilFuncionario.jsp").forward(request, response);
				
			}else{
				
				request.getRequestDispatcher("/PaginaPerfilEncargado.html").forward(request, response);
				
			}
			
		}
		
	}

}
