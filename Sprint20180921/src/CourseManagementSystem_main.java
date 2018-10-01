//import java.sql.*;
//import java.util.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CourseManagementSystem_main 
{
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
		String query;
		ResultSet result;
		
		// call the control for the welcome screen Control001AccessManWecome
		// This control then calls the Bound001AccessManWecome class
		// that retrieves the value. 
		// If the user chooses to register then control will remain with
		// Control001AccessManWecome.
		// If the user chooses to login, then control will return 
		// back to this main method.
		
		Control001AccessManWecome WecomeControl = new Control001AccessManWecome();
		// call the control class for the welcome
		WecomeControl.getAccessManWecome();
		
		

		
		
		
	}// close the main method

}// close class CourseManagementSystem_main
