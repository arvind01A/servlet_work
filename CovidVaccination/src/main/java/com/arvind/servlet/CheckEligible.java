package com.arvind.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckEligible extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter stream res obj
		PrintWriter pw = res.getWriter();
		//set response content type
		res.setContentType("text/html");
		String name = req.getParameter("pname");
		String addrs = req.getParameter("paddrs");
		String tage = req.getParameter("page");
		int age = Integer.parseInt(tage);
		
		if(age >= 12)
			pw.println("<h1 style='color:green;text-align:center'> Mr. /Miss/Mrs. " + name + " of " + addrs + " u r eligible for vaccine </h1>");
		else
			pw.println("<h1 style='color:red;text-align:center'> Mr. /Miss/Mrs. " + name + " of " + addrs + " u r not eligible for vaccine </h1>");
		
		pw.println("<h1 style='text-align:center'><a href='input.html'>Home</a></h1>");
		
		//close stream
		pw.close();
	}//doGet(-,-)
	
}//class
