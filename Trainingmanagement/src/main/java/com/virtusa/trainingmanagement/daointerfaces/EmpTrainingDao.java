package com.virtusa.trainingmanagement.daointerfaces;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.trainingmanagement.models.Admin_Scheduletraining;



public interface EmpTrainingDao 
{
	List<Admin_Scheduletraining> getAllTraining() throws SQLException; //select all

}
