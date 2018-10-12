//import java.sql.*;
//import java.util.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CourseManagementSystem_main 
{
	//=========================================================================
	// Define the clear_console_screen() method
	/*
	*   clear_console_screen()
	*   this is a kuldge as there is no way to refresh/clear the eclipse console
	*   and so I shall insert 200 new lines to clear the eclipse console
	*/	
	static void clear_console_screen()
	{
		for (int lines=0; lines<200; lines++)
		{
			System.out.println("                                                           ");
		}// end for (int lines=0; lines<200; lines++)
		
	}// end clear_console_screen()
	
     ////////////////////////////////////////////////////////////////////////////////
	/*--------------------------------------------------------------------------
	 * This is a project of Team Invicibles, 
	 * This team consisting of the following members:
	 * 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Project Team Lead
	 * Mob: +61 476 136 482
	 * 
	 * Bingnan (Kent) Li: s3699455@student.rmit.edu.au 
	 * Project Team member
	 * 
	 * Yixuan (Eli) Wang:s3642823@student.rmit.edu.au 
	 * Project Team member
	 * 
	 * 
	 * -------------------------------------------------------------------------
	 * About the operation of this class and main method:
	 * a.  This corresponds to SUC00: Operate CMS: This is the behaviour of the main method
	 * b.  
	 * c. 
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 * CHANGE HISTORY:
     * 20181001: First version created by Mike Little
	 * 
	 * 
	 */
     ////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) throws Exception 
	{
		///////////////////////////////////////////////////////////////////////////
		//Define Class Attributes[Variables] Here
		
		// Here are the class variables for the:
		// 1. The Query string passed to the entity class 'query';
		// 2. The ResultSet 'result' that the query is returned.
		
		String access_result;
		 // this is the variable that stores the result of the access
		 // If access_result=="show_welcome", it will present the welcome screen
		 // If access_result=="logged_in", it will create a new session for the user.
		 // Once logged in, there is need for a loop that checks 
		 // If access_result=="logged_out", it will close  the open session for the user
		 
		
		String query;
		// this variable holds the query that shall be passed to the entity class
		ResultSet result;
		// this variable holds the results returned from executing the query
		// on the entity class.
		
		// call the control for the welcome screen Control001AccessManWecome
		// This control then calls the Bound001AccessManWecome class
		// that retrieves the value. 
		// If the user chooses to register then control will remain with
		// Control001AccessManWecome.
		// If the user chooses to login, then control will return 
		// back to this main method.
		
		String role;
		// this stores the value of the role being returned back from 
		// the query of the session table.
		
		String usName;
		// this stores the user name of the user who has logged in.
		
		Control001AccessManWecome WecomeControl = new Control001AccessManWecome();
		
		// create an instance of the EntityMySQLInteraction class
		// to make a database connection.		
		EntityMySQLInteraction dbConnect= new EntityMySQLInteraction();
		

		query="SET SQL_SAFE_UPDATES = 0";
		// this prevents the mysql error message Error Code: 1175, so you can use any other key apart from the primary key
		
		dbConnect.setQuery(query);
		try {
			dbConnect.setInsertData();
		} //end the try block
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end the catch block
		
		query="delete from session  where login_status="+ "\'logged_in\'";
		// this removes all previous database entries that had a Logged in status… in the session table.
		// This would mean that there should be no entries

		
		dbConnect.setQuery(query);
		try {
			dbConnect.setInsertData();
		} //end the try block
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end the catch block
		
		

		
		// may need a loop here..
		access_result="";
		do 
		{
			// call the control class for the welcome
			// return the access_result to determine the result
			WecomeControl.getAccessManWecome();
			access_result=WecomeControl.access_outcome();
			clear_console_screen();


		} while (access_result!="logged_in");

		//complete the log in process
		
		/*
		 * retrieve from the session table the role of the logged in user
		 * select the role from the session table where the login_status= logged_in
		 *  This is stored on the local variable 'role'
		 */
		query="select role from session where login_status="+ "\'logged_in\'";
		role="";
		// set initial state to NUL value.
		dbConnect.setQuery(query);
		try 
		{
			result=dbConnect.getResults();
			while(result.next())
			{
				role=result.getString("Role");				
				//store the value of the role
			}//close while statement
		}//end the try 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end the catch
		
		
		/*
		 * Here we will have a do while loop
		 * do
		 * {
		 *  .. code
		 * } while (access_result!="logged_out");
		 * This will loop around until 
		 * it via an accessor method calling the 
		 * relevant administrator_, coordinator_, lecturer_, student_ control/boundary 
		 * class  changes access_result=="logged_out"
		 * 
		 * "student","lecturer", "coordinator", "administrator"
		 * 
		 */
		do
		{
			//insert a switch
			
			if (role.equals("administrator"))
			{	
				// hand off to the administrator control and boundary class
				// check the access_result from the administrator control
				// if this has not changed from "logged_in" to "logged_out"
				
				Control020AdminCMS AdminCMSControl=new Control020AdminCMS();
				AdminCMSControl.CMSApplicationAdministrationManagementControl();
				access_result= AdminCMSControl.getLogout_choice();
				
				//break;
			}// end if (role.equals("administrator"))
			else if (role.equals("coordinator"))
			{	
				// hand off to the coordinator control and boundary class
				// check the access_result from the coordinator control
				// if this has not changed from "logged_in" to "logged_out"
				
				//insert app code for "coordinator"
				
				//diagnotic
				//System.out.println("hand off to the coordinator control class");
				
				//break;
			}// end if (role.equals("coordinator"))	
			
			else if (role.equals("lecturer"))
			{	
				// hand off to the lecturer control and boundary class
				// check the access_result from the lecturer control
				// if this has not changed from "logged_in" to "logged_out"
				
				//insert app code for "lecturer"
				
				//diagnotic
				System.out.println("hand off to the lecturer control class");
				
				//break;
			}// end if (role.equals("lecturer"))	
			
			else if (role.equals("student"))
			{	
				// hand off to the student control and boundary class
				// check the access_result from the student control
				// if this has not changed from "logged_in" to "logged_out"
				
				//insert app code for "student"
				
				//diagnotic
				//System.out.println("hand off to the student control class");
				
				//break;
			}// end if (role.equals("student"))
			
			
		}while (access_result!="logged_out");
		
		// commence the logout process from here...
		/*
		 * change the  login_status in the session table from logged_in to logged_out
		 * Update the End_Date_time with the date-time stamp of the session end
		 * represent the welcome screen
		 * 
		 */
		usName="";
		query="select UserName from session where login_status="+ "\'logged_in\'";
		dbConnect.setQuery(query);
		try 
		{
			result=dbConnect.getResults();
			while(result.next())
			{
				usName=result.getString("UserName");				
				//store the value of the role
			}//close while statement
		}//end the try 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end the catch
							
		// now lets enter the data-time for the session 
		// end time
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		
		
		query="update session SET End_Date_time="+"\'"+ currentTime +"\'" 
		+ "where login_status="+ "\'logged_in\'"
		+ "and username       ="+"\'"+usName+"\'";
			
		
		dbConnect.setQuery(query);
		try {
			dbConnect.setInsertData();
		} //end the try block
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end the catch block
		
		//now change the status of the user from "logged in" to logged out"
		
		
		query="update session SET login_status=" + "\'logged_out\'"    
				+ "where login_status="+ "\'logged_in\'"
				+ "and username       ="+"\'"+usName+"\'";	
		
		dbConnect.setQuery(query);
		try {
			dbConnect.setInsertData();
		} //end the try block
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end the catch block
		

	
		
		
	}// close the main method

}// close class CourseManagementSystem_main
