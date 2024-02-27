//TestServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/testurl",initParams = {@WebInitParam(name = "p1", value="val1"), @WebInitParam(name = "p2", value = "val2")})
public class TestServlet extends HttpServlet {
	
		public TestServlet() {
			System.out.println("TestServlet.TestServlet(): 0-param constructor");
		}
		
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			System.out.println("TestServlet.doGet()");
			//get PrintWriter
			PrintWriter pw=res.getWriter();
			//set response content type
			res.setContentType("text/html");
			//write b.logic
			Date date=new Date();
			pw.println("<h1 style='color:red;text-align:center'>Date and time ::"+date+"</h1>");
			//get access the ServletConfig object
			ServletConfig cg=getServletConfig();
			pw.println("<h1> p1 init param value ::"+cg.getInitParameter("p1")+"</h1>");
			pw.println("<h1> p2 init param value ::"+cg.getInitParameter("p2")+"</h1>");
			
			//close the stream
			pw.close();
		} //doGet(-,-)
		
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			doGet(req,res);
		}
}
