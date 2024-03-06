//ArithmeticServlet.java
package com.arvind.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/arithmeticurl")
public class ArithmeticServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter steam
		PrintWriter pw = res.getWriter();
		//set content type
		res.setContentType("text/html");
		
		//read additional request parameter value
		String s1Val = req.getParameter("s1");
		
		//read text box values
		int val1 = 0, val2 = 0;
		val1 = Integer.parseInt(req.getParameter("t1"));
		val2 = Integer.parseInt(req.getParameter("t2"));
		
		//differentiate the logic for multiple submit buttons and hyperlink
		if(s1Val.equalsIgnoreCase("add"))
			pw.println("<h1 style='color:green;text-align:center'>Addition :: " + (val1 + val2) + "<h1>");
		else if(s1Val.equalsIgnoreCase("sub"))
			pw.println("<h1 style='color:green;text-align:center'>Subtration :: " + (val1 - val2) + "</h1>");
		else if(s1Val.equalsIgnoreCase("mul"))
			pw.println("<h1 style='color:green;text-align:center'>Multiplication :: " + (val1 * val2) + "</h1>");
		else {
			if(val1<val2 || val2==0) { 
				pw.println("<h1 style='color:red;text-align:center'>second value choose lesser and not choose 0</h1>");
			    pw.println("<h1 style='color:green;text-align:center'>Division :: " +(val1/val2) + "</h1>");
			} else
				pw.println("<h1 style='color:green;text-align:center'>Division :: " +(val1/val2) + "</h1>");
		}
		
		pw.println("<h1 style='text-align:center'><a href='input.html'>Home</a></h1>");
		//close stream
		pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
