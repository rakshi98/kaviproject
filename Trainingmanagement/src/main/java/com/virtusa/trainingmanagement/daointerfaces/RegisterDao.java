package com.virtusa.trainingmanagement.daointerfaces;

import java.sql.SQLException;

import com.virtusa.trainingmanagement.models.Register;


public interface RegisterDao 
{
	public boolean addDetails(Register register) throws SQLException; //insert
}
