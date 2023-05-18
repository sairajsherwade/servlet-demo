package com.jsp.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("adminemail");
		String password=req.getParameter("password");
		
		
		System.out.println(email);
		System.out.println(password);
		
		if(email.equals("admin@email.com")&& password.equals("1234")) {
	RequestDispatcher  rd	=req.getRequestDispatcher("home.jsp");
	
					rd.forward(req, res);
					
		}
		else {
		RequestDispatcher rd	=req.getRequestDispatcher("login.jsp");
		rd.include(req, res);
			
		}
		
	}

}
