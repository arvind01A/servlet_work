//GetCapitalservlet.java
package com.arvind.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCapitalServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter stream
		PrintWriter pw = res.getWriter();
		//set context type
		res.setContentType("text/html");
		//read form data
		int countryindex = Integer.parseInt(req.getParameter("country"));
		//write b.logic
		String country[] = new String[] {"Paris", "New Delhi","Islamabad","Bejing","London","Washington, D.C."};
		pw.println("<h1 style='text-align:center'>The capital city name is ::  <span style='color:blue'> "+ country[countryindex] + "<span></h1>");
		pw.println("<h1 style='text-align:center'><a href='input.html'>Home</a></h1>");
		//close stream
		pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost(-,-)
	
}//class
