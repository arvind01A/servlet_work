//HtmlServlet.java
package com.nt.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Date;

public class HtmlServlet extends HttpServlet
{
	/*
	//2nd service(-,-) method
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		//get PrintWriter object
		PrintWriter pw=res.getWriter();
		//set reponse content type
		res.setContentType("text/html");
		//place output the response object
		pw.println("<table border='1' align='center' bgcolor='cyan'>");
		pw.println("<tr><th>Player</th><th>Sport</th></tr>");
		pw.println("<tr><td>Virat Kohli</td><td>Cricket</td></tr>");
		pw.println("<tr><td>Ms-Dhoni</td><td>Cricket</td></tr>");
		pw.println("<tr><td>PV Sindhu</td><td>Badminton</td></tr>");
		pw.println("<tr><td>Saniya Mirza</td><td>Tennis</td></tr>");
		pw.println("<tr><td>Sunil Chetri</td><td>FootBal</td></tr>");
		pw.println("</table>");

		//enable auto refresh on the generated web page
		//res.setHeader("refresh","1");
		res.setIntHeader("refresh", 10);
		
		pw.println("<h1>req obj class name ::" +req.getClass()+"</h1>");
		pw.println("<h1>res obj class name ::"+res.getClass()+"</h1>");

		pw.println("<br>");
		pw.println("<h1 style='color:red;text-align:center'> Date and time is:"+new java.util.Date()+"</h1>");
		//close stream
		pw.close();
	}
	*/
	static {
		   System.out.println("HtmlServlet::static block()");
	   }
	   public HtmlServlet() {
		   System.out.println("HtmlServlet:: 0-param constructor");
	   }
	   
	   @Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("HtmlServlet.init(ServletConfig cg)");
		}
	   
	   @Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			System.out.println("HtmlServlet.service(-,-)");
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
			System.out.println("HtmlServlet.destroy()");
		}	
}
