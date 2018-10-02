//import java.sql.*;
//import java.util.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Control010RegisterStudent 
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
	private String registration_result;
	// this stores the results of the registration process.
	// this could be that the user provides all the registration details
	// then registration_results="register"
	// if the user decides not to register 
	// then registration_results="not_register"
	

	 
	 
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  Control010RegisterStudent()
		*/		 
		public Control010RegisterStudent()  
		{
			// This is the constructor for Control010RegisterStudent()
			// Allows access to the class methods.

		}// close Control010RegisterStudent() 	


	//=========================================================================
	// Define the getAccessManWecome() method
	/*
	*  getAccessManWecome()
	*  This method calls the Boundary Class, and with the userChoice returned 
	*  from the boundary class the registration details entered by the student
	*  This is then used to populate the student database with new student details
	*/
		
	public String registerStudent()
	{
		Bound010RegisterStudent registeredStudentDetails = new Bound010RegisterStudent();
		//diagnostic..
		//System.out.println("This is the Control010RegisterStudent() class");
		// call the boundary class for getting the student details for registration.
		registration_result=registeredStudentDetails.getStudentDetailsRegistered();
		// this could be that the user provides all the registration details
		// then registration_results="register"
		// if the user decides not to register 
		// then registration_results="not_to_register"
		
		
		
		// if registration_result = "register"
		
		
		
		
		// if registration_result = "not_to_register"
		
		return registration_result;

	}
	
////////////////////////////////////////////////////////////////////////////////
	
} //close Control010RegisterStudent
