package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class Home2  extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		
		String email=req.getParameter("adminemail");
		String password=req.getParameter("password");
		
		
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body><h1></h1>"+"welcome"+name+"</body></html>");
		System.out.println(name);
		

	}

}
