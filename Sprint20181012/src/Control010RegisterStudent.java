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
* This  this class operates in the following manner:
a.  it has a constructor method, Control010RegisterStudent() 
b.  it has a method to return  the results of registration, registration_result()
c.  it has a method registerStudent()  that calls the boundary class
    Bound010RegisterStudent,  and the method  in that class 
    getStudentDetailsRegistered()
d.  getStudentDetailsRegistered()  in this boundary class
    collect the registration details   of the student
e.   this class calls  the different access methods of  of the boundary class
    Bound010RegisterStudent     in order to create an insert query
     that inserts  the registration details of the student.
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
	private String registration_choice;
	// this stores the choice made on the registration boundary 
	// if user chooses to registration
	// then registration_choice="registration"
	// if the user decides not to registration 
	// then login_choice="not_to_registration"

	private String registration_result;
	// this stores the results of the registration process.
	// this could be that the user provides all the registration details
	// then registration_results="registered"
	// if the user decides not to register 
	// then registration_results="not_registered"

	private String RegisteredStudentFName;
	private String RegisteredStudentLName;
	private String RegisteredStudentEmail;
	private String RegisteredStudentType;
	
	private String RegisteredStudentUsame;
	private String RegisteredStudentPword;
	
	private String query;
	// this stores the query being passed to the entity class to the database.

	

	 
	 
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
		// Define the registration_result() method
		/*
		*  registration_choice()
		*   This method access the 
		*  ...
		*/
		public String registration_result() 
		{
			// insert code from here...
			return registration_result;
		}// end registration_result()	
		
		
	//=========================================================================
	// Define the registerStudent() method
	/*
	*  registerStudent()
	*  This method calls the Boundary Class, and if the accesor for the 
	*  boudary class passes back registration_result = "register, the 
	*  this class registers the details of the new student
	*  by inserting a new row in the student table.
	*  
	*  If registration_results="not_to_register" then it will pass control back up
	*  
	*/
		
	public void registerStudent() throws InterruptedException
	{
		Bound010RegisterStudent registeredStudentDetails = new Bound010RegisterStudent();
		// call the boundary class for getting the student details for registration.
		
		registeredStudentDetails.getStudentDetailsRegistered();
		// this could be that the user provides all the registration details
		
		registration_choice="";
		//clear our any previous value
		registration_choice=registeredStudentDetails.registration_choice();
		
		if (registration_choice=="register")
		{
			registration_result="";
			//clear our any previous value
			//insert registration code from here.
			
			//here you will need to retrieve
			/*
			 * 	private String StudentRegoFName;
				private String StudentRegoLName;
				private String StudentRegoEmail;
				private String StudentRegoType;
				private String registration_choice;
			 *Useing their appropriate accessors
			 * you will need to generate random six 
			 * digit numbers to form the 
			 * student userName, and Password
			 * and pass this back to the boundary class to display
			 *
			 *
			 */
			
			//retrieve the registeredStudentDetails from the boundary class
			RegisteredStudentFName=registeredStudentDetails.getStudentRegoFName();
			RegisteredStudentLName=registeredStudentDetails.getStudentRegoLName()  ;
			RegisteredStudentEmail=registeredStudentDetails.getStudentRegoEmail()  ;
			RegisteredStudentType=registeredStudentDetails.StudentRegoType()  ;
			RegisteredStudentUsame=registeredStudentDetails.StudentRegoUsame() ;
			RegisteredStudentPword=registeredStudentDetails.StudentRegoPword();
			
			String sess_RegisteredStudentUsame   =  "\'"  + RegisteredStudentUsame+  "\'";
			String sess_RegisteredStudentFName   =  " \'" + RegisteredStudentFName+ "\' ";
			String sess_RegisteredStudentLName   =  " \'" + RegisteredStudentLName+ "\' ";
			String sess_RegisteredStudentPword   =  " \'" + RegisteredStudentPword+ "\' ";
			String sess_RegisteredStudentEmail   =  " \'" + RegisteredStudentEmail+ "\' ";
			String sess_RegisteredStudentType    =  " \'" + RegisteredStudentType + "\' ";
											

			query="insert into student"
					+ "("
						+ "StudentID, "
						+ "UserName,"
						+ "FirstName, "
						+ "LastName,"
						+ "Password, "
						+ "Email, "
						+ "Type"
						+ ")"
						+ "values"
					+ "("
							+ "NULL,"
							+ sess_RegisteredStudentUsame +","
							+ sess_RegisteredStudentFName+","
							+ sess_RegisteredStudentLName+","
							+ sess_RegisteredStudentPword+","
							+ sess_RegisteredStudentEmail+","
							+ sess_RegisteredStudentType
						+ ")";

			// create an instance of the EntityMySQLInteraction class
			// to make a database connection.		
			EntityMySQLInteraction dbConnect= new EntityMySQLInteraction();
			dbConnect.setQuery(query);
			try {
				dbConnect.setInsertData();
			} //end the try block
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end the catch block
		registration_result="registered";
		}//end (registration_choice=="register")
		
		else if (registration_choice=="not_to_register")
		{
			registration_result="not_registered";
		}//else if (registration_choice=="not_to_register")

	

	}//public void registerStudent() throws InterruptedException
	
////////////////////////////////////////////////////////////////////////////////
	
} //close Control010RegisterStudent
