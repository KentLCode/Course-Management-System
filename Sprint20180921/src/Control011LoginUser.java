//import java.sql.*;
//import java.util.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Control011LoginUser 
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
* a.  
* b.  
* c. 
* 
/*--------------------------------------------------------------------------
* 
*/
	
	/*--------------------------------------------------------------------------
	 * 
	 * CHANGE HISTORY:
     * 20181001: First version created by Mike Little
	 * 
	 * 
	 */

	////////////////////////////////////////////////////////////////////////////////

	//Define Class Attributes[Variables] Here

	// Here are the class variables for the:
	// 1. This ...
	// 2. This coresponds to SUC....
	// 3. This ...
	// 4. This ...
	private String login_result;
	// this stores the results of the login process.
	// this could be that the user provides all the login details
	// then login_result="logged_in"
	// if the user decides not to login 
	// then login_result="not_to_login"
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  Control011LoginUser()
		*/		 
		public Control011LoginUser()  
		{
			// This is the constructor for Control011LoginUser()
			// Allows access to the class methods.

		}// close Control011LoginUser() 	
	

		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		
		public String LoginUser()
		{
			BoundC011LoginUser userLogin = new BoundC011LoginUser();
			//diagnostic..
			//System.out.println("This is the Control011LoginUser() class");
			// call the boundary class for getting the user details for login.
			login_result=userLogin.getUserDetailsLogin();
			
			// this stores the results of the login process.
			// this could be that the user provides all the login details
			// then login_result="logged_in"
			// if the user decides not to login 
			// then login_result="not_to_login"
			
			
			
			// if login_result="logged_in"
			
			
			
			
			// if login_result="not_to_login"
			
			return login_result;
			
		}// end LoginUser()
////////////////////////////////////////////////////////////////////////////////
	
	
	
}
