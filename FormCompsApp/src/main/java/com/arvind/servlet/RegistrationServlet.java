//RegistrationServlet.java
package com.arvind.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registrationurl")
public class RegistrationServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter stream
		PrintWriter pw = res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read form data
		String name = req.getParameter("sname");
		String addrs = req.getParameter("sadd");
		String gender = req.getParameter("gender");
		String ms = req.getParameter("ms");
		if(ms == "")
			ms = "single";
		String qlfy = req.getParameter("qlfy");
		if(qlfy == "")
			qlfy = "Not select";
		long mobileNo = Long.parseLong(req.getParameter("contactNo"));
		String email = req.getParameter("email");
		String hobbies[] = req.getParameterValues("hb");
		if(hobbies == null)
			hobbies = new String[] {"No hobbie"};
		String favColor[] = req.getParameterValues("favColors");
		if(favColor == null)
			favColor = new String[] {"No favorite color"};
		String petName = req.getParameter("pet");
		String dob = req.getParameter("dob");
		String tob = req.getParameter("tob");
		String monthInfo = req.getParameter("mob");
		String weekInfo = req.getParameter("wob");
		String fburl = req.getParameter("fburl");
		String scolor = req.getParameter("scolor");
		String ss = req.getParameter("ss");
		int favNo = Integer.parseInt(req.getParameter("favNo"));
		long  expSal = Long.parseLong(req.getParameter("sal"));
		
		//display the form data
		pw.println("<b>Name:: " + name + "</b><br>");
		pw.println("<b>Addrs:: " + addrs + "</b><br>");
		pw.println("<b>Gender:: " + gender + "</b><br>");
		pw.println("<b>Marital Status:: " + ms + "</b><br>");
		pw.println("<b>Qualification:: " + qlfy + "</b><br>");
		pw.println("<b>Contact No:: " + mobileNo + "</b><br>");
		pw.println("<b>Email:: " + email + "</b><br>");
		pw.println("<b>Hobbies:: " + Arrays.toString(hobbies) + "</b><br>");
		pw.println("<br>Favorite color:: " + Arrays.toString(favColor) + "</b><br>");
		pw.println("<br>Pet Name:: " + petName + "</b><br>");
		pw.println("<b>DOB:: " + dob + "</b><br>");
		pw.println("<b>TOB:: " + tob + "</b><br>");
		pw.println("<b>Month Info:: " + monthInfo + "</b><br>" );
		pw.println("<b>Week Info:: " + weekInfo + "</b><br>");
		pw.println("<b>FB url:: " + fburl + "</b><br>");
		pw.println("<b>Sentiment color:: " + scolor + "</b><br>");
		pw.println("<b>Search String:: " + ss + "</b><br>");
		pw.println("<b>Favorite Number:: " + favNo + "</b><br>");
		pw.println("<b>Expected Salary:: " + expSal + "</b><br>");
		
		//add home hyperlink
		pw.println("<br><h3 style='text-align:center'><a href='student_register.html'>Home</a></h3>");
		
		//close stream
		pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doGet(-,-)
	
}//RegistationServlet
