import java.util.Scanner;
public class BoundC011LoginUser 
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
	
	////////////////////////////////////////////////////////////////////////////////

	//Define Class Attributes[Variables] Here

	// Here are the class variables for the:
	// 1. This ...
	// 2. This corresponds to SUC....
	// 3. This ...
	// 4. This ...
	private String userName;
	private String userPassword;
	
	private String login_choice;
	// this stores the results of the login process
	// if successfully gets all the details for userName
	// userPassword,and passes the validation [not null!]
	// then login_choice="login"
	// if the user decides not to login 
	// then login_choice="not_to_login"
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  BoundC011LoginUser()
		*/		 
		public BoundC011LoginUser()  
		{
			// This is the constructor for BoundC011LoginUser()
			// Allows access to the class methods.

		}// close BoundC011LoginUser() 	

		public String getUserDetailsLogin() 
		{
			// this method presents a form to get the user details for
			// username and password
			
			// insert code from here...
			//diagnostic..
			//System.out.println("This is the BoundC011LoginUser() class");
			// call the boundary class for getting the user details for login.
			
			// this stores the results of the login process
			// if successfully gets all the details for userName
			// userPassword,and passes the validation [not null!]
			// then login_choice="login"
			// if the user decides not to login 
			// then login_choice="not_to_login"
			return login_choice;
			
			
		}// end getUserDetailsLogin() 
		
		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String getuserName() 
		{
			// insert code from here...
			return userName;
		}// end getuserName()

		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String getuserPassword() 
		{
			// insert code from here...
			return userPassword;
		}// end getuserPassword()
		
		
		
////////////////////////////////////////////////////////////////////////////////
}// BoundC011LoginUser class 
