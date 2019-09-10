package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.trainingmanagement.daoimplementations.EmpposttrainingImpl;
import com.virtusa.trainingmanagement.models.Emp_posttraining;

/**
 * Servlet implementation class Emp_posttraining
 */
@WebServlet("/EmpPosttrainingServlet")
public class EmpPosttrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * String fullName=request.getParameter("fullName"); String
		 * email=request.getParameter("emailAddress"); String
		 * eid=request.getParameter("empid"); int
		 * phone=Integer.parseInt(request.getParameter("phoneNumber")); String
		 * courname=request.getParameter("trainingName");
		 */
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		Emp_posttraining posttraining = new Emp_posttraining();
		posttraining.setEmpeid(request.getParameter("empid"));
		posttraining.setEmpemail(request.getParameter("emailAddress"));
		posttraining.setEmpfullname(request.getParameter("fullName"));
		posttraining.setEmpphonenumber(Integer.parseInt(request.getParameter("phoneNumber")));
		posttraining.setTrainingname(request.getParameter("trainingName"));
	
		EmpposttrainingImpl posttrainingDao = new EmpposttrainingImpl();
		
		String result = posttrainingDao.post(posttraining);
		if(result.equals("success")) 
		 {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Posted Sucessfully');");
			out.println("location='Emp_Home.jsp';");
			out.println("</script>");
	/*
	 * request.getRequestDispatcher("/Emp_Home.jsp");//RequestDispatcher is used to
	 * send the control to the invoked page.
	 */		}
		 else
		 {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('UnSucessfull');");
			out.println("location='Emp_error.jsp';");
			out.println("</script>");
		 }		
		
		
	
		
	}

}
