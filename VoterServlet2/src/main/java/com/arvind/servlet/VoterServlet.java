//VoterServlet2.java
package com.arvind.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("VoterServlet2.doPost(-,-)");
		//get PrintWriter stream from res obj
		PrintWriter pw = res.getWriter();
		//set context type
		res.setContentType("text/html");
		//read form data
		String name = req.getParameter("pname");
		String addrs = req.getParameter("paddrs");
		String tage = req.getParameter("page");
		int age = Integer.parseInt(tage);
		
		if(age >= 18)
			pw.println("<h1 style='color:green;text-align:center'>Mr./Miss/Mrs.  "+name + " of " + addrs  + " u r eligible for voting </h1>");
		else
			pw.println("<h1 style='color:red;text-align:center'>Mr./Miss/Mrs.  "+name + " of " + addrs  + " u r not eligible for voting </h1>");
		
		pw.println("<h1 style='text-align:center'><a href='input.html'><img src='images/home2.jpg' height='60px' width='40px'></a></h1>");
		
		//close stream
		pw.close();
	}//doPost(-,-);
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("VoterServlet2.doGet(-,-)");
		//get PrintWriter stream
		PrintWriter pw = res.getWriter();
		//set content type
		res.setContentType("text/html");
		
		pw.println("<h1 style='text-align:center'>Date and Time is :: <span style='color:blue'>" + new java.util.Date() +"</span></h1>");
		
		pw.println("<center><a href='input.html'><img src='images/home1.jpg' height='60px' width='40px'></a></center>");
		
		//close stream
		pw.close();
	}//doGet(-,-);
	
}//class
