package com.virtusa.trainingmanagement.daoimplementations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.virtusa.trainingmanagement.daointerfaces.EmpTrainingDao;
import com.virtusa.trainingmanagement.helper.OracleHelper;
import com.virtusa.trainingmanagement.models.Admin_Scheduletraining;

public class EmpViewTraining implements EmpTrainingDao
{
	
	private Connection conn;
	private ResourceBundle rb;
	private Statement statment;
	private ResultSet resultSet;
	
	//instance block
	{
		rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
	}

	@Override
	public List<Admin_Scheduletraining> getAllTraining() throws SQLException {
		// TODO Auto-generated method stub
		List<Admin_Scheduletraining> trainingList=new ArrayList<Admin_Scheduletraining>();
		Admin_Scheduletraining adminScheduledTraining=null;
		conn=OracleHelper.getConnection();
		String query=rb.getString("getallTraining");
		try
		{
			statment=conn.createStatement();
			resultSet=statment.executeQuery(query);
			while(resultSet.next())
			{
				adminScheduledTraining=new Admin_Scheduletraining();
				adminScheduledTraining.setTrainingid(resultSet.getString(1));
				adminScheduledTraining.setTrainingtitle(resultSet.getString(2));
				adminScheduledTraining.setDomain(resultSet.getString(3));
				adminScheduledTraining.setStartdate(resultSet.getDate(4));
				adminScheduledTraining.setEnddate(resultSet.getDate(5));
				adminScheduledTraining.setVenue(resultSet.getString(6));
				System.out.println("kavvitha");
			
				trainingList.add(adminScheduledTraining);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			conn.close();
		}
		
		return trainingList;
	}

}
