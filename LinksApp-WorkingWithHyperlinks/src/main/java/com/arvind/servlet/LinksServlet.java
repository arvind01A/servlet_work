//LinksServlet.java
package com.arvind.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LinksServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter stream
		PrintWriter pw = res.getWriter();
		//set response content type
		res.setContentType("text/html");
		
		//read additional req param value
		String p1Val = req.getParameter("p1");
		Locale locales[] = Locale.getAvailableLocales();
		
		if(p1Val.equalsIgnoreCase("link1")) {
			Set<String> langSet = new HashSet();
			for(Locale l : locales) {
				langSet.add(l.getDisplayLanguage());
			}
			pw.println("<h1 style='color:green;text-align:center'>All language are </h1>");
			langSet.forEach(lang -> pw.println("<h2 style='font-size:20px;'>"+lang + "</h2><br>"));
		} else if(p1Val.equalsIgnoreCase("link2")) {
			Set<String> countriesSet = new HashSet();
			for(Locale l : locales) {
				countriesSet.add(l.getDisplayCountry());
			}
			pw.println("<h1 style='color:yellow;text-align:center'>All countries are </h1>");
			countriesSet.forEach(country -> pw.println("<h2 style='font-size:20px;'>" + country + "</h2><br>"));
		} else {
			//get System date and time
			LocalDateTime ldt = LocalDateTime.now();
			
			//get current method
			int month = ldt.getMonthValue();
			if(month>=3 && month<=6) 
				pw.println("<h1 style='color:blue;text-align:center'>Summer season</h1>");
			 else if(month>=7 && month<=10) 
				pw.println("<h1 style='color:blue;text-align:center'>Rainy season</h1>");
			 else 
				pw.println("<h1 style='color:blue;text-align:center'>Winter season</h1>");
			
		} //if-else if - else
		//add home hyperlink
		pw.println("<h1 style='color:green;text-align:center'><a href='links.html'>Home</a></h1>");
		
		//close stream
		pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost(-,-)
	
}//LinksServlet
