//import java.util.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Control020AdminCMS
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
	 * a.  This is the control class for Administering the CMS application 
	 * b.  This..
	 *	1. Creates an instance of the Bound020AdminCMS() class
	 *	2. retrieves the  updated current Year
	 *	3. retrieves the updated current semester
	 *	3.1 uses this to determine the semesterID to update the settings table.
	 *	4. retrieves the new staff details
	 *	5. Depending on the role, populate either the administrator, coordinator
	 *		or the lecturer tables.
	 *
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */
	/*--------------------------------------------------------------------------

	CHANGE HISTORY:
	20181009: First version created by Mike Little


	*/
	
	////////////////////////////////////////////////////////////////////////////////

	//Define Class Attributes[Variables] Here

	// Here are the class variables for the:
	// 1. This ...
	// 2. This corresponds to SUC....
	// 3. This ...
	// 4. This ...
	private String logout_choice;
	// this is from the boundary class
	// this stores the choice of the user to logout
	// on launch, this is set to logout_choice="logged_in";
	// if the user decides to log out on the boundary class
	// then logout_choice="logged_out"
	// there is an accessor that will get this and pass up to the 
	// Main() method.
	private String AdminScreenOperation;
	//  values set are: 
	//  AdminScreenOperation="updateyr_sem"
	//  AdminScreenOperation="createnewstaff"
	
	private String AdminFrstName;
	// this stores the Administrator FirstName
	// this is set a value for testing purposes of the boundary class.
	
	
	private String AdminLastName;
	// this stores the Administrator FirstName
	// this is set a value for testing purposes of the boundary class
	
	
	private String CurrentYear;
	// this stores the current year that is retrieved from the 
	// the session info, and using the semesterID to retrieve
	// this on the semester table.
	private String CurrentSemester;
	// this stores the current Semester that is retrieved from the 
	// the session info, and using the semesterID to retrieve
	// this on the semester table.
	private String UpdatedYear;
	//this stores the updated year
	private String UpdatedSemester;
	//this stores the updated semester
	
	private String StaffNewFName;
	private String StaffNewLName;
	private String StaffNewEmail;
	private String StaffNewRole;

	private String StaffNewUsame;
	// this stores the generated User-name
	private String StaffNewPword;
	// this stores the generated User password
	
	
	private String query;
	// this stores the query being passed to the entity class to the database.
	
	private int session_yr_sem;
	// this stores the year, semester from the session table, 
	// which is the PK on the session table
	// this will be used to extract the year, semester from the semester table.
	
	private ResultSet results;
	// this stores the results returned back by the entity class to the database
	private int numberOfRows;
	// this stores the number of rows returned from a query
	
	private int semesterID;
	//the semesterID to be inserted the settings table.

	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  Control020AdminCMS()
		*/		 
		public Control020AdminCMS()  
		{
			// This is the constructor for Control020AdminCMS()
			// Allows access to the class methods.

		}// close Control020AdminCMS() 	

		//=========================================================================
		//Define the getLogout_choice() method
		/*
		*  logout_choice()
		*   this method returns  back to the main method
		*   the choice made by the user whether to log out or not
		*  ...
		*/
		public String getLogout_choice() 
		{
			// insert code from here...
			return logout_choice;
		}// end getLogout_choice()	
		
		//=========================================================================
		//Define the setUpdatedYearSemester() method
		/*
		*  setUpdatedYearSemester()
		*   this method updates the Year and Semester
		*  ...
		*/
		public void setUpdatedYearSemester(String Year, String Semester) 
		{
			UpdatedYear=Year;
			UpdatedSemester=Semester;
			EntityMySQLInteraction dbConnect= new EntityMySQLInteraction();
			// Retrieve the SemesterID using the updated year, semester.
			String temp_UpdatedYear			="\'" + UpdatedYear+ "\'";
			String temp_UpdatedSemester	="\'" + UpdatedSemester+ "\'";
			query="select semesterID from semester where year="+temp_UpdatedYear+" and semester="+temp_UpdatedSemester; 
			dbConnect.setQuery(query);
			try 
			{
				results=dbConnect.getResults();
				while(results.next())
				{
					semesterID=Integer.parseInt(results.getString("semesterID"));
					//retrieve the CurrentYear from the semester table
				}//close while statement
			}//end the try 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end the catch
			
			/*
			 * Update the settings table with the updated semester and year
			 * information retrieved from the administrator.
			 * 
			 */
			query="update settings SET year_semest="+"\'"+semesterID +"\'" ;
			dbConnect.setQuery(query);
			try {
				dbConnect.setInsertData();
			} //end the try block
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end the catch block
			
			
		}// end setUpdatedYearSemester(String Year, String Semester) 
		
		//=========================================================================
		//Define the setUpdatedYearSemester() method
		/*
		*  setUpdatedYearSemester()
		*   this method updates the Year and Semester
		*  ...
		*/
		public void setCreateNewStaffMember(
											String StaffNewRole,
											String StaffNewUsame, 
											String StaffNewFName, 
											String StaffNewLName,
											String StaffNewPword,
											String StaffNewEmail 
											) 
		{
			EntityMySQLInteraction dbConnect= new EntityMySQLInteraction();
			String temp_StaffNewUsame   =  "\'"  + StaffNewUsame+  "\'";
			String temp_StaffNewFName   =  " \'" + StaffNewFName+ "\' ";
			String temp_StaffNewLName   =  " \'" + StaffNewLName+ "\' ";
			String temp_StaffNewPword   =  " \'" + StaffNewPword+ "\' ";
			String temp_StaffNewEmail   =  " \'" + StaffNewEmail+ "\' ";
			String tableID=StaffNewRole+"ID";								
			 
			 query="insert into "+StaffNewRole
			 		+ "("
			 			+ tableID+","
			 			+ "UserName, "
			 			+ "FirstName, "
			 			+ "LastName, "
			 			+ "Password, "
			 			+ "Email "
			 			+ ")"
			 			+ "values"
			 		+ "("
			 				+ "NULL,"
			 				+ temp_StaffNewUsame +","
			 				+ temp_StaffNewFName+","
			 				+ temp_StaffNewLName+","
			 				+ temp_StaffNewPword+","
			 				+ temp_StaffNewEmail
			 			+ ")";
			 
			 // create an instance of the EntityMySQLInteraction class
			 // to make a database connection.		
			 dbConnect.setQuery(query);
			 try {
			 	dbConnect.setInsertData();
			 } //end the try block
			 catch (Exception e) 
			 {
			 	// TODO Auto-generated catch block
			 	e.printStackTrace();
			 }//end the catch block
			
		}//end public void setCreateNewStaffMember
		
		
		//=========================================================================
		// Define the CMSApplicationAdministrationManagementControl() method
		/*
		*  CMSApplicationAdministrationManagementControl()()
		*   This CMSApplicationAdministrationManagementContro() method ... 
		*	1. Creates an instance of the Bound020AdminCMS() class
		*	2. retrieves the  updated current Year
		*	3. retrieves the updated current semester
		*	3.1 uses this to determine the semesterID to update the settings table.
		*	4. retrieves the new staff details
		*	5. Depending on the role, populate either the administrator, coordinator
		*		or the lecturer tables.
		*  ...
		*/
		public void CMSApplicationAdministrationManagementControl() throws InterruptedException
		{
			
			Bound020AdminCMS AdminCMSBoundary= new Bound020AdminCMS();
			// query the session table for the AdminFirstname, Last name
			// Define the query etc from here...
			
			// create an instance of the EntityMySQLInteraction class
			// to make a database connection.		
			EntityMySQLInteraction dbConnect= new EntityMySQLInteraction();
			// Retrieve the FirstName, and the LastName for the userName
			// In order to login the user and create a new session entry.
			
			query= "select FirstName, LastName, yr_sem from session where login_status="+"\'logged_in\'";
			dbConnect.setQuery(query);
			try 
			{
				results=dbConnect.getResults();
				while(results.next())
				{
					AdminFrstName=results.getString("FirstName");
					//retrieve the AdminFrstName from the session table
					AdminLastName =results.getString("LastName");
					//retrieve the AdminFrstName from the session table
					session_yr_sem=Integer.valueOf(results.getString("yr_sem"));
					// this retrieve "yr_sem" from the session table, 
					// but this is a string, but this needs to be converted to a
					// an integer to use to get the year, semester that corresponds 
					// to it.

				}//close while statement
			}//end the try 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end the catch
			
			AdminCMSBoundary.setAdminFrstName(AdminFrstName);
			AdminCMSBoundary.setAdminLastName(AdminLastName);
			
			//diagnostic
			//System.out.println ("AdminFrstName:"+ AdminFrstName );
			//System.out.println ("AdminLastName:"+ AdminFrstName );
			
			
			// query the session table for the Session ID
			// and use the session ID to query the Current Year, Semester
			// Define the query etc from here...
			
			query= "select year, semester from semester where semesterID="+"\'"+session_yr_sem+"\'" ;
			dbConnect.setQuery(query);
			try 
			{
				results=dbConnect.getResults();
				while(results.next())
				{
					CurrentYear=results.getString("year");
					//retrieve the CurrentYear from the semester table
					CurrentSemester =results.getString("semester");
					//retrieve the CurrentSemester from the semester table

				}//close while statement
			}//end the try 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end the catch		
			
			//System.out.println ("CurrentYear:"+ CurrentYear );
			//System.out.println ("CurrentSemester:"+ CurrentSemester );
			
			//diagnostic
			AdminCMSBoundary.SetCurrentYear(CurrentYear);
			AdminCMSBoundary.setCurrentSemester(CurrentSemester);
			AdminCMSBoundary.CMSApplicationAdministrationManagementBoundary();

			
			logout_choice="logged_in";
			do 
			{
				logout_choice=AdminCMSBoundary.getLogout_choice();
			}
			while (logout_choice!="logged_out");
					//System.out.println ("Out of loop, logout_choice:"+ logout_choice );
			
					
		}// end CMSApplicationAdministrationManagementControl()

		
		
		
		
////////////////////////////////////////////////////////////////////////////////
}// <<class name>> class 