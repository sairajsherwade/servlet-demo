package com.jsp.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Save  extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String save = req.getParameter("save");
		String update=req.getParameter("update");
		String input=req.getParameter("text");
		String  getall= req.getParameter("getall");
		
		if(save!=null) {
			
			RequestDispatcher rd= req.getRequestDispatcher("save.jsp");
			rd.forward(req, res);
			
		}
		else if(update!=null) {
			RequestDispatcher rd= req.getRequestDispatcher("save.jsp");
			rd.forward(req, res);
		}
		else if(getall!=null){

			RequestDispatcher rd= req.getRequestDispatcher("save.jsp");
			rd.forward(req, res);
			

			
			
		}
	
		
	}

}
