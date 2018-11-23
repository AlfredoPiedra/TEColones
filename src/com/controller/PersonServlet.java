package com.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Person;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private String name;  // The user's name 
    private String dateOfBirth; // The user's date of birth 
    private String personID = "personBean";  // The ID of the Person object
	
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException  
       { 
           // Retrieve the user input values from the Welcome Page 
           name = request.getParameter("name"); 
           dateOfBirth = request.getParameter("dateOfBirth"); 
        
           // Initialise a new Person object 
           Person person = new Person(); 
       
           // Update the default values in the Person object with the user supplied values 
           person.setName(name); 
           person.setDateOfBirth(dateOfBirth); 
       
           // Set the person object and its identifier as attributes of the request 
           request.setAttribute(personID, person); 
        
           // Load the userAgeResponse Page 
           RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/userAgeResponse.jsp"); 
           dispatcher.forward(request, response); 
       }
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
