//WishMessageServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter object
		PrintWriter pw = res.getWriter();
		//set content type
		res.setContentType("text/html");
		
		//get system date and time (java8)
		LocalDateTime ldt = LocalDateTime.now();
		
		//get current hour of the day
		int hour = ldt.getHour();
		
		if(hour<12)
			pw.print("<h1 style='color:orange; text-align:center;'>Good Morging</h1>");
		else if(hour<14)
			pw.print("<h1 style='color:red; text-align:center;'>Good Afteroon</h1>");
		else if(hour<20)
			pw.print("<h1 style='color:pink; text-align:center;'>Good Evening</h1>");
		else
			pw.print("<h1 style='color:blue; text-align:center;'>Good Night</h1>");
		
		pw.close();		//stream close
		
	}//service(-,-)
	
}//class
