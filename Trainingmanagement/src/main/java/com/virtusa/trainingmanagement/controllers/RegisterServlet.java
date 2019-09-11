package com.virtusa.trainingmanagement.controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.trainingmanagement.daoimplementations.RegisterImpl;
import com.virtusa.trainingmanagement.daointerfaces.RegisterDao;
import com.virtusa.trainingmanagement.models.Register;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/RegisterServlet")  
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		//read values from ajax call
		
		//model
		Register register=new Register();
		register.setEmpId(request.getParameter("empId"));
		register.setName(request.getParameter("name"));
		register.setEmailId(request.getParameter("emailId"));
		register.setPassword(request.getParameter("password"));
		register.setPhoneNo(request.getParameter("phoneNo"));
		
		//call dao
		RegisterDao registerDao=new RegisterImpl();
		boolean status=false;
		String errorMessage = null;
		try
		{
			status=registerDao.addDetails(register);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		if(status)
			out.println("Login Successfull");
		else
			out.println("Error occurred,"+errorMessage);
		
	
	}
}
		