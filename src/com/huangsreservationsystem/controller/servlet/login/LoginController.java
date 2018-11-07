package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangsreservationsystem.model.domain.Customer;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 8095282046652575492L;


	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Customer customer = extractLoginInfo(request);
	
	    if (customer != null) 
	    {
	        response.sendRedirect("welcome.html");    	
	    }
	    else // we didn't get email/password from form
	    {
	    	/**
	    	 * If we didnt get anything from the customer object,
	    	 * do nothing for now.
	    	 */
	    }
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	 /**
	   * Extract login parameters from the request header and assign them to
	   * Customer domain class 
	   * @param request
	   */
	  private Customer extractLoginInfo(HttpServletRequest request) 
	  {
		 Customer customer = new Customer(); 
		 
		 /*
		  * NOTE: "email" and "password" below have to map precisely to 
		  *       name value set in Login.html for the corresponding fields:
		  *      
		  *       <input type="text" name="email" value="jayhuang@hotmail.com">
		  *       <input type="password" name="password" value="123456">								
	                    
		  */
		 
		 String emailAddress = request.getParameter("email");
		 String password = request.getParameter("password");
		 	 
		 if ((emailAddress != null) && (password != null))
		 {	 
		  customer.setEmailAddress(emailAddress);
	  	  customer.setPassword(password);
		 }
		 else {
		   customer = null;
		 }
		 return customer;
	  }

}
