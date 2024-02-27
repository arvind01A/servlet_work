//LcTestServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

//@WebServlet(urlPatterns = "/lcurl",loadOnStartup = 1)
//@WebServlet(urlPatterns = "/lcurl")
public class LcTestServlet extends HttpServlet {
   static {
	   System.out.println("LcTestServlet::static block()");
   }
   public LcTestServlet() {
	   System.out.println("LcTestServlet:: 0-param constructor");
   }
   
   @Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LcTestServlet.init(ServletConfig cg)");
	}
   
   @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("LcTestServlet.service(-,-)");
	   //get PrintWriter object
	   PrintWriter pw=res.getWriter();
	   //set response content type
	   res.setContentType("text/html");
	   //write output to response obj
	   Date d=new Date();
	   pw.println("<h1 style='color:green;text-align:center'>Date and time is::"+d+"</h1>");
	   
	   //close stream
	   pw.println();
	}
   
   @Override
	public void destroy() {
		System.out.println("LcTestServlet.destroy()");
	}
}
