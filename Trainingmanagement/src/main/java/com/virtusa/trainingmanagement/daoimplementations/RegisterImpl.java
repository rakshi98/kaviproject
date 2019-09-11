package com.virtusa.trainingmanagement.daoimplementations;
import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.virtusa.trainingmanagement.daointerfaces.RegisterDao;

import com.virtusa.trainingmanagement.helper.OracleHelper;
import com.virtusa.trainingmanagement.models.Register;
public class RegisterImpl implements RegisterDao
{
		private Connection conn;
		private CallableStatement callable;
		private int result;
		private boolean status;
		
		private ResourceBundle rb;
		private Statement statment;
		private ResultSet resultSet;
		
		//instance block
		{
			rb=ResourceBundle.getBundle("com/virtusa/trainingmanagement/resources/db");
		}
		
	 	@Override
		public boolean addDetails(Register register) throws SQLException
		{
			// TODO Auto-generated method stub
			
			try{
				conn=OracleHelper.getConnection();
				conn.setAutoCommit(false);
				System.out.println("kavitha");
				callable=conn.prepareCall("{call addRegister(?,?,?,?,?)}");
				callable.setString(1, register.getEmpId());
				callable.setString(2, register.getName());
				callable.setString(3, register.getEmaiId());
				callable.setString(4, register.getPassword());
			   callable.setString(5, register.getPhoneNo());
				result = callable.executeUpdate();
				if(result>0)
					status=true;
				
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
	}


