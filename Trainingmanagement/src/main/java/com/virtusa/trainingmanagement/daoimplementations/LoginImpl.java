package com.virtusa.trainingmanagement.daoimplementations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.virtusa.trainingmanagement.daointerfaces.LoginDao;
import com.virtusa.trainingmanagement.helper.OracleHelper;
import com.virtusa.trainingmanagement.models.Login;


public class LoginImpl implements LoginDao
{
		private Connection conn;
		private CallableStatement callable;
		private int result;
		private boolean status;
		private ResourceBundle rb;
		
	/*
	 * private ResourceBundle rb; private Statement statment; private ResultSet
	 * resultSet;
	 */
		
		//instance block
		{
			rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
		}
		
	 	@Override
		public boolean addDetails(Login login) throws SQLException
		{
			// TODO Auto-generated method stub
			
			try
			{
				conn=OracleHelper.getConnection();
				conn.setAutoCommit(false);
				callable=conn.prepareCall("{call adddetails(?,?,?)}");
				callable.setString(1, login.getEmailId());
				callable.setString(2, login.getPassword());
				callable.setString(3, login.getRole());
				result = callable.executeUpdate();
				if(result>0)
				{
		
					status=true;
				}
				
				conn.commit();
			}
			catch(SQLException e){
				conn.rollback();
			}
			finally{
				conn.close();
			}
			return status;
		}

		@Override
		public Login getByUser(String emailId) 
		{
			
			String sqlQuery = "select * from login where emailId =? ";
			Login login = null;
			try (Connection con = OracleHelper.getConnection();
					PreparedStatement pre_stmt = con.prepareStatement(sqlQuery))
			{

				pre_stmt.setString(1, emailId);
				pre_stmt.executeQuery();
				ResultSet rs = pre_stmt.executeQuery(sqlQuery);
				
				if (rs.next()) 
				{
					String emailID = rs.getString(1);
					String password = rs.getString(2);
					String role=rs.getString(3);
					login= new Login(emailID, password,role);
				}
			
				
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
				System.out.println("in login dao");
				System.out.println(e);
			}
			
		
			return login;
		}

		
	 	
	}


