//WordServlet.java
package com.nt.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.Date;

public class WordServlet extends HttpServlet
{
	/*
	//2nd service(-,-) method
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		//get PrintWriter object
		PrintWriter pw=res.getWriter();
		//set reponse content type
		res.setContentType("text/msword");
		//place output the response object
		pw.println("<table border='1' align='center' bgcolor='cyan'>");
		pw.println("<tr><th>Player</th><th>Sport</th></tr>");
		pw.println("<tr><td>Virat Kohli</td><td>Cricket</td></tr>");
		pw.println("<tr><td>Ms-Dhoni</td><td>Cricket</td></tr>");
		pw.println("<tr><td>PV Sindhu</td><td>Badminton</td></tr>");
		pw.println("<tr><td>Saniya Mirza</td><td>Tennis</td></tr>");
		pw.println("<tr><td>Sunil Chetri</td><td>FootBal</td></tr>");
		pw.println("</table>");
		//close stream
		pw.close();
	}
	*/
	static {
		   System.out.println("WordServlet::static block()");
	   }
	   public WordServlet() {
		   System.out.println("WordServlet:: 0-param constructor");
	   }
	   
	   @Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("WordServlet.init(ServletConfig cg)");
		}
	   
	   @Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			System.out.println("WordServlet.service(-,-)");
		   //get PrintWriter object
		   PrintWriter pw=res.getWriter();
		   //set response content type
		   res.setContentType("text/msword");
		   //write output to response obj
		   Date d=new Date();
		   pw.println("<h1 style='color:green;text-align:center'>Date and time is::"+d+"</h1>");
		   
		   //close stream
		   pw.println();
		}
	   
	   @Override
		public void destroy() {
			System.out.println("WordServlet.destroy()");
		}
}
