package com.virtusa.trainingmanagement.daoimplementations;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.virtusa.trainingmanagement.daointerfaces.Admin_ScheduletrainingDAO;
import com.virtusa.trainingmanagement.helper.OracleHelper;
import com.virtusa.trainingmanagement.models.Admin_Scheduletraining;

public class AdminscheduletrainingImpl implements Admin_ScheduletrainingDAO {
	
	public String trainingschedule(Admin_Scheduletraining mobj )
	{
		
		String trainingId=mobj.getTrainingid();
		String trainingTitle=mobj.getTrainingtitle();
		String domain=mobj.getDomain();
		Date  startDate=mobj.getStartdate();
		Date  endDate=mobj.getEnddate();
		String venue=mobj.getVenue();
		Connection con = null;
		try
		{
			con =OracleHelper.getConnection();
<<<<<<< HEAD
			PreparedStatement pt=con.prepareStatement("{call adminpost(?,?,?,?,?,?)}");
=======
			PreparedStatement pt=con.prepareStatement("insert into postadmin(trainingid,trainingtitle,domain,startdate,enddate,venue)values(?,?,?,?)");
>>>>>>> branch 'master' of https://github.com/rakshi98/kaviproject.git
			pt.setString(1,trainingId);
			pt.setString(2,trainingTitle);
			pt.setString(3,domain);
			pt.setDate(4,startDate);
			pt.setDate(5,endDate);
			pt.setString(6,venue);
			
			int i1=pt.executeUpdate();
			if(i1>0)
			{
				return "success";
			}
			else 
			{
				return "unsuccessfull";
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "invalid";
		
	}

}
