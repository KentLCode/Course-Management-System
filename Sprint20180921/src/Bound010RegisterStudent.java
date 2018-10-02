import java.util.Scanner;
public class Bound010RegisterStudent 
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
* a.  This class retrieves the student registration details
* b.  it may need set..(), get..() for each of the variables..
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

	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Attributes[Variables] Here
	
	// Here are the class variables for the:
	// 1. This stores the ...
	// 2. This coresponds to SUC0..-...
	// 3. 

	private String StudentRegoFName;
	private String StudentRegoLName;
	private String StudentRegoEmail;
	private String StudentRegoType;
	private String registration_choice;
	// this stores the results of the registration process
	// if successfully gets all the details for registration
	// StudentRegoFName, StudentRegoLName, StudentRegoEmail,
	// StudentRegoType, and passes the validation [not null!]
	// then registration_choice="register"
	// if the user decides not to register 
	// then registration_choice="not_register"

	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  Bound010RegisterStudent() 
		*/		 
		public Bound010RegisterStudent()  
		{
			// This is the constructor for Bound001AccessManWecome()
			// Allows access to the class methods.

		}// close Bound010RegisterStudent()

		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		
		public String getStudentDetailsRegistered() 
		{
			// this method presents a form to get the student details for
			// StudentRegoFName, StudentRegoLName, StudentRegoEmail, StudentRegoLType
			// it will need separate accessor methods to retrieve the student
			// first name, last name, email, and type.
			
			registration_choice="";
			//set registration_results to a NULL value to clear any previous settings.
			//diagnostic..
			//System.out.println("This is the Bound010RegisterStudent() class");
						
			return registration_choice;
			
		}// end getStudentDetailsRegistered()
		
		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String getStudentRegoFName() 
		{
			// insert code from here...
			return StudentRegoFName;
		}// end getStudentRegoFName()

		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String getStudentRegoLName() 
		{
			// insert code from here...
			return StudentRegoLName;
		}// end getStudentRegoLName()

		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String getStudentRegoEmail() 
		{
			// insert code from here...
			return StudentRegoEmail;
		}// end getStudentRegoEmail()
		
		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String StudentRegoType() 
		{
			// insert code from here...
			return StudentRegoType;
		}// end StudentRegoType()		
		

////////////////////////////////////////////////////////////////////////////////
	
}
