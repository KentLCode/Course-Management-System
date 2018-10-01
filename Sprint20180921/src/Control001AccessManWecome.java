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
	// Define the getAccessManWecome() method
	/*
	*  getAccessManWecome()
	*  This method calls the Boundary Class, and with the userChoice returned 
	*  from the boundary class determines whether to hand control from this 
	*  control class to the control class of Register Student or Login User
	*/
		public void getAccessManWecome() 
		{
			Bound001AccessManWecome welcome_screen= new Bound001AccessManWecome();
			userChoice=welcome_screen.getWelcChoice();
			//System.out.println("the user has choosen:"+userChoice);
			switch (userChoice)
			{
				case 1:
					// user has choose to register as a student
					// register user.
					Control010RegisterStudent registerStudent  = new Control010RegisterStudent();
					
				case 2:
					// user has chose to login.
					// log user
					Control011LoginUser logUser = new Control011LoginUser();
			}
			
			
		}// close getAccessManWecome()
	
	
	
}//close Control001AccessManWecome
