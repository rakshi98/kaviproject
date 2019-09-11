package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.trainingmanagement.daoimplementations.LoginImpl;
import com.virtusa.trainingmanagement.daointerfaces.LoginDao;
import com.virtusa.trainingmanagement.models.Login;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")  
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		String role=request.getParameter("role");
		
		
		//read values from ajax call
		
		//model
		Login login=new Login(emailId,password,role);
		login.setEmailId(request.getParameter("emailId"));
		login.setPassword(request.getParameter("password"));
		login.setRole(request.getParameter("role"));
		
	
		//call dao
		LoginDao loginDao=new LoginImpl();
		boolean status=false;
		String errorMessage = null;
		try
		{
			status=loginDao.addDetails(login);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			errorMessage=e.getMessage();
		}
		if(status) 
		{
			Login uss = loginDao.getByUser(emailId);
			
			if(uss==null)
			{
				out.println("<div class=\"prompt\"><h6>Username does not exist...Try Again</h6></div>");
				
				dispatcher = request.getRequestDispatcher("/views/login.html");
				dispatcher.include(request, response);
			}
			else if(emailId.equals(uss.getEmailId())&&password.equals(uss.getPassword()))
			{
				/*
				 * HttpSession session = request.getSession(); session.setAttribute("name",
				 * user);
				 */
				dispatcher = request.getRequestDispatcher("/views/emphome.jsp");
				
				dispatcher.forward(request, response);
			}
			else
			{
				out.println("<div class=\"prompt\"><h5>Access Denied...Try Again</h5></div>");
				
				dispatcher = request.getRequestDispatcher("/views/login.html");
				dispatcher.include(request, response);
				
			}
			out.close();
		

				out.println("Login Successfull");
			
		}
			
		else
			out.println("Error occurred,"+errorMessage);

	
	}

}
