
import java.sql.*;
//import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
* About the operation of this class and methods:
* a.  This is the entity class that is called to interact with the MySQL db.
* b.  The constructor method creates the database connection
* c.  setQuery(String query) sets the query string into this class.
* d.  getResults() returns the query results 
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
 	private Connection connect;
 	private PreparedStatement statement;
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
			// this creates the database connection
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//connect=DriverManager.getConnection(url,username,password);

		}// close Game()	
		
		
		
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
			connect=DriverManager.getConnection(url,username,password);
			statement=connect.prepareStatement(sql);
			sql_result=statement.executeQuery();
			return sql_result;
		}
		
		
	
	
}//Close EntityMySQLInteraction
