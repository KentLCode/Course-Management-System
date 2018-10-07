
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class EntityMySQLInteraction 
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
* -------------------------------------------------------------------------
   This class now has the following methods for and operation:
   a. EntityMySQLInteraction():  this is the constructor method for this class.
   b. setQuery(String query):  this method passes in the query from the calling method.
   c. ResultSet getResults():  this method executes the query that has been passed in from a calling method,
      and returns the results as a ResultSet  back to the calling method where it will be unpacked in that calling method.
   d. void setInsertData():  this method  executes insert into,Update SQL  queries,  for example it is used in the   
      Control011LoginUser  class to  create a new session entry on the session entry table,  and to
       change the null value for the start date, and updated with the current start time stamp for the start of the session
   e. void setInsertDateTime():  it appears this method will not need be needed,  and so it shall be deprecated.   
* 
/*--------------------------------------------------------------------------
* 
* CHANGE HISTORY:
* 20181001: First version created by Mike Little
* 
*/
////////////////////////////////////////////////////////////////////////////////
	
	
	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Attributes[Variables] Here
	
	// Here are the class variables for the:
	// 1. Query;
	// 2. The Prepared statement
	// 3. The ResultSet that is to be returned. 
 	private String sql;
 	private Connection connect_retrieve;
 	private Connection connect_insert;
 	private Connection connect_insert_date_time;
 	private PreparedStatement statement_retrieve;
 	private PreparedStatement statement_insert_date_time;
 	private Statement  statement_insert;
 	private ResultSet sql_result;
 	//this is the query string being passed in.
	
	// create an instance of the EntityMySQLInteraction() class 
	// to be able to call the EntityMySQLInteraction class methods
	
	//we will now create a variable for the connection it is "connect"

	
 	// we will define the fixed variables to connect to the MySQL database. 
 	private String host="localhost";
 	private String port="3306";
 	private String database="course_management_system";
 	private String establishSSLconnect="?useSSL=false&allowPublicKeyRetrieval=true";
 	private String setServerTimeZone="&useLegacyDatetimeCode=false&serverTimezone=Australia/Melbourne";
 	private String url="jdbc:mysql://"+host+":"+port+"/"+database+establishSSLconnect+setServerTimeZone;
	
	// we will define the username and password to access the MySQL database
 	private String username="root";
 	private String password="isys1117_project_cms";
 	
	
	
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  EntityMySQLInteraction()
		*/		 
		public EntityMySQLInteraction()  
		{
			// This is the constructor for EntityMySQLInteraction()
			// Allows access to the class methods.

		}// close EntityMySQLInteraction() 	
		
		
		
		//=========================================================================
		// Define the setQuery(String query) method
		/*
		*  setQuery(String sql):
		*  This method passes in the  query string that will be used to query
		*  they MySQL database.
		*  
		*  "query" is the external query string being passed in.
		*/			
		public void setQuery(String query) 
		{
			sql=query;
		}//close setQuery(String query)
	

		
		//=========================================================================
		// Define the getResults() method
		/*
		*  getResults():
		*  This method returns results  of the query from the MySQL database
		*  back to the calling method. This will be a ResultSet,  and as a result
		*  it will need to be unpacked by the calling method
		*/		
		public ResultSet getResults() throws Exception
		{
			connect_retrieve=DriverManager.getConnection(url,username,password);
			statement_retrieve=connect_retrieve.prepareStatement(sql);
			sql_result=statement_retrieve.executeQuery();
			return sql_result;
		}// close getResults()
		
		
		//=========================================================================
		// Define the setInsertData() method
		/*
		*  getResults():
		*  This method inserts data  MySQL database
		*  
		*/		
		public void setInsertData() throws Exception
		{
			connect_insert=DriverManager.getConnection(url,username,password);
			//statement_insert = connect_insert.createStatement();
			statement_insert=connect_insert.prepareStatement(sql);
			statement_insert.executeUpdate(sql);
			connect_insert.close();
		}// close setInsertData()

		//=========================================================================
		// Define the setInsertDateTime() method
		/*
		*  setInsertDateTime()
		*  This method inserts date and time into  MySQL database
		*  A typical quiery could be.. String query = "INSERT INTO datetests (date1) VALUES (?)";
				
		public void setInsertDateTime() throws Exception
		{
			connect_insert_date_time=DriverManager.getConnection(url,username,password);
			
			// create a java sql date object we want to insert
			Calendar calendar = Calendar.getInstance();
		    java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
		    statement_insert_date_time=connect_insert_date_time.prepareStatement(sql);
		    statement_insert_date_time.setDate(1, ourJavaDateObject);
			statement_insert_date_time.executeUpdate();
			connect_insert_date_time.close();
		}// close setInsertDateTime()
		*/
		
	
	
}//Close EntityMySQLInteraction
