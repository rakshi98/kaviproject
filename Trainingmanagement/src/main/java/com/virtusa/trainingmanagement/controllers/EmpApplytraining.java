package com.virtusa.trainingmanagement.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.gson.Gson;
import com.virtusa.trainingmanagement.daoimplementations.EmpViewTraining;
import com.virtusa.trainingmanagement.daoimplementations.LoginImpl;
import com.virtusa.trainingmanagement.daointerfaces.EmpTrainingDao;
import com.virtusa.trainingmanagement.daointerfaces.LoginDao;
import com.virtusa.trainingmanagement.models.Admin_Scheduletraining;

/**
 * Servlet implementation class EmpApplytraining
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/EmpApplytraining" })
public class EmpApplytraining extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpApplytraining() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		EmpTrainingDao trainingDao=new EmpViewTraining();
		try
		{
			List<Admin_Scheduletraining> trainingList=trainingDao.getAllTraining();
			//converting java object to java script object(json)
			response.getWriter().write(new Gson().toJson(trainingList));
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
