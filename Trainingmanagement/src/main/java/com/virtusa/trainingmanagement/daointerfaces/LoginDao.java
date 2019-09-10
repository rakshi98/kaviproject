package com.virtusa.trainingmanagement.daointerfaces;

import java.sql.SQLException;
import java.util.Collection;

import com.virtusa.trainingmanagement.models.Login;

public interface LoginDao 
{
	public boolean addDetails(Login login) throws SQLException; //insert
	public Login getByUser(String emailId);
}
