import java.sql.*;
//import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*--------------------------------------------------------------------------
	 * This is a project of Team Invicibles, 
	 * This team consisting of the following members:
	 * 
	 * Michael John Little:9905648@student.rmit.edu.au
	 * Project Team Lead
	 * Mob: +61 476 136 482
	 * 

	 * 

	 * 
	 * ------------------------------------------------
	 * About this class:
	 * 1.  We have referenced the connector for connecting to the 
	 *     MySQL database. 
	 * 1.1 It creates a connection to a database using a database connection object
	 * 2.  It allocates a statement object in the connection 
	 * 3.  It executes a SQL Select query, and returns the 'ResultSet' object.
	 * 4.  Process the ResultSet by scrolling the cursor forward via next().
	 *  For each row, retrieve the contents of the cells with getXxx(columnName).
	 * 5. Close the resources - Done automatically by try-with-resources
	 * 
	 * 
	/*--------------------------------------------------------------------------
	 * 
	 */
//import java.sql.*; 
// we need to import the java database facilities. 
public class testsql2 
{

	public static void main(String[] args) throws Exception 
	{
		//we will now create a variable for the connection it is "connect"
		// database: jdbc:mysql://localhost:3306/course_management_system 
		// username: root
		// password: Isys1117_project_cms
		// as a connection string..
		
		String host="localhost";
		String port="3306";
		String database="course_management_system";
		String establishSSLconnect="?useSSL=false&allowPublicKeyRetrieval=true";
		//String setServerTimeZone="&serverTimezone=UTC";
		String setServerTimeZone="&useLegacyDatetimeCode=false&serverTimezone=Australia/Melbourne";
		String url="jdbc:mysql://"+host+":"+port+"/"+database+establishSSLconnect+setServerTimeZone;
		
		
		//?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
		String username="root";
		String password="isys1117_project_cms";
		Connection connect=DriverManager.getConnection(url,username,password);
		
		//Here we create our query
		String sql="select * from student";
		//String sql= "select FirstName, LastName from Student where UserName="+ "\'STU123456\'";
		PreparedStatement statement=connect.prepareStatement(sql);
		ResultSet result=statement.executeQuery();
		//result.last();
		//int numberOfRows = result.getRow();;
		//System.out.println("rows="+numberOfRows);
		
		
/*
		String sql="select * from Person";
		PreparedStatement statement=connect.prepareStatement(sql);
		
		//create a variable to execute the query
		ResultSet result=statement.executeQuery();
		//String num_row=result.getString(1);
		
		//System.out.println("rows="+num_row);
		//display the result of the query to the console
		
		*/
		
		while(result.next())
		{
			//string ln=result.
			System.out.println(
					result.getString(1) + " " +
					result.getString(2) + " " +
					result.getString(3) + " " +
					result.getString(4) 
					);
					// getString  returns the data
					//  1  is the 1st field in the table
					//  2  is the 2nd field in the table
					//  3  is the 3rd field in the table
					//  4  is the 4th field in the table
		 }//close while statement
		
	
	

	}// close main method

}
