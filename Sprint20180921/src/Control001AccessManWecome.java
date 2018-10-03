public class Control001AccessManWecome 
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
* a.  A very simple constructor is used to configure this class.
* b.  getAccessManWecome() calls the Bound001AccessManWecome class.
* c.  This class will either call the Register Student control class, 
*     or the login user control class.
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

	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Attributes[Variables] Here
	
	// Here are the class variables for the:
	// 1. This stores the user choice from the Boundary Class.
	// 2. This coresponds to SUC00.1-Access CMS
	// 3. If user chooses to register, it will call the control class for registration
	// 4. if user chooses to login, it will call the control class for logging in.
	
	 private int userChoice;
	 // This is a local class variable that stores the choice made
	 private String access_response;
	 // this is a local class variable that operation response from either
	 // register new student, or login user.
	 // This will either be "register" "not_to_registered" or "logged_in"
	 // If access_response is "registered"or "not_to_registered"

	 private String access_outcome;
	 /*this is the variable that stores the result of the access
	  * 	If access_response is either be "register" or "not_to_registered"
	  * 	then access_outcome=="show_welcome", it will present the welcome screen
	  * 
	  * 	If access_response is "logged_in"
	  * 	then access_outcome=="logged_in"
	  * 
	  */	

	 
	 
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  EntityMySQLInteraction()
		*/		 
		public Control001AccessManWecome()  
		{
			// This is the constructor for Control001AccessManWecome
			// Allows access to the class methods.

		}// close Control001AccessManWecome 	

		//=========================================================================
		// Define the access_outcome() method
		/*
		*  access_outcome()
		*   This method access the 
		*  ...
		*/
		public String access_outcome() 
		{
			// insert code from here...
			return access_outcome;
		}// end raccess_response()	
		
	//=========================================================================
	// Define the getAccessManWecome() method
	/*
	*  getAccessManWecome()
	*  This method calls the Boundary Class, and with the userChoice returned 
	*  from the boundary class determines whether to hand control from this 
	*  control class to the control class of Register Student or Login User
	*/
		public void getAccessManWecome() throws InterruptedException
		{
			Bound001AccessManWecome welcome_screen= new Bound001AccessManWecome();
			welcome_screen.getWelcChoice();
			userChoice=welcome_screen.WelcChoice();
			//place holder for updated switching...
			
			if (userChoice==1)
			{
				// user has choose to register as a student
				// register user.
				Control010RegisterStudent registerStudent  = new Control010RegisterStudent();
				//call the control class for registering a student
				registerStudent.registerStudent();
				access_response=registerStudent.registration_result();
				// maybe insert a break here after the student is registered??
				// control should return to CourseManagementSystem_main..
				// more coding tba...
			} //end If (userChoice==1)
			
			else if (userChoice==2)
			{
				// user has chose to login.
				Control011LoginUser logUser = new Control011LoginUser();
				// call the control class for logging in an user
				logUser.LoginUser();
				access_response=logUser.login_result();
				
			} //end else if (userChoice==1)
			
			
			// insert code to determine access_outcome
			 /*this is the variable that stores the result of the access
			  * 	If access_response is either be "register" or "not_to_registered"
			  * 	then access_outcome=="show_welcome", it will present the welcome screen
			  * 
			  * 	If access_response is "logged_in"
			  * 	then access_outcome=="logged_in"
			  * 
			  */
			access_outcome="";
			if ((access_response=="register")||(access_response=="not_to_registered")|(access_response=="not_to_login"))
			{
				access_outcome="show_welcome";
			}// end if ((access_response=="register")||(access_response=="not_to_registered"))
		
			if (access_response=="login")
			{
				access_outcome="logged_in";
			}// access_outcome="logged_in"
			
			
			//System.out.println("access_outcome:"+access_outcome);

			
		
			
			
		}// close getAccessManWecome()
		//=========================================================================
		// Define the access_response() method
		/*
		*  access_response()
		*  This method retrieves the value of "access_response" 
		*  If access_result=="show_welcome", it will present the welcome screen 
		*  If access_result=="logged_in", it will create a new session for the user.
		*/	
	
	
}//close Control001AccessManWecome
