package com.virtusa.trainingmanagement.daointerfaces;

import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.util.Collection;
>>>>>>> branch 'master' of https://github.com/rakshi98/kaviproject.git

import com.virtusa.trainingmanagement.models.Login;

public interface LoginDao 
{
	public boolean addDetails(Login login) throws SQLException; //insert
	public Login getByUser(String emailId);
}
