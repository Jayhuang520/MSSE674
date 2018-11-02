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
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //response.setContentType("text/html");
	    Customer customer = extractLoginInfo(request);
	    /*
	     * Note: In subsequent weeks we will be doing true authentication by invoking
	     * the business and service layers to authenticate the user against database values.
	     * 
	     * For this week (Week2), we will assume a successful login and return a hardcoded
	     * response!
	     */
	    if (customer != null) 
	    {
	        response.sendRedirect("welcome.html");    	
	    }
	    else // we didn't get email/password from form
	    {
	    	// In subsequent implementation we will be alerting user to enter info!
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
		  *       <input type="text" name="email" value="homer@nukliare.com">
		  *       <input type="password" name="password" value="duff">								
	                    
		  */
		 
		 String emailAddress = request.getParameter("email");
		 String password = request.getParameter("password");
	
		 /*
		  * Why are we checking for null?
		  * 
		  *  Ideally, client side javascript should catch null/empty values. Check
		  *  for null at the server side is more of defensive coding!  
		  */
		 	 
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
