
//import java.util.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.*;
import java.util.Calendar;

public class Control011LoginUser 
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
* About the operations of this class and methods:
* This class now has  excess methods for:
a. login_result(): This method returns back to the calling method whether the login process 
   is successful when the returned password matches the value passed in.
b. getFirstName(): This method returns back to the calling method the FirstName of the
   logged in user.
c. getLastName(): This method returns back to the calling method the LastName of the
   logged in user.
d. getRole():  this method returns back to the calling method the role of the logged in user
e. getYr_Sem():  this method returns back to the calling method  the semesterID of the current year and semester
f. LoginUser():  this method performs the following:
   i.  creates an instance of the  login user boundary class, BoundC011LoginUser()
   ii.  calls the method 'getUserDetailsLogin()'  that is part of the  login user boundary class, BoundC011LoginUser()
         to display  the login screen, which stores as local class variables the login.
   iii.  it retrieves  using a  accessor method  that is part of BoundC011LoginUser() the  user name, and password 
         that has been entered.
   iv.    it creates an instance of the  entity class EntityMySQLInteraction(),  and using an  an array 
          containing the names of the different  database tables such as student, lecturer, coordinator, administrator
           it attempts to retrieve the password from each of these tables.  If the query returns a result, the 
           number of rows return will be 1, indicating that it has found the corresponding password for the given
            input username. It stores the corresponding tablename as a variable, called "role".
   v.    it then compares the password that has been retrieved from the database against the password that has been entered,
          if these match then it commences they process of logging in the user by creating an entry on the session table.
           As part of this process,  it retrieves various  pieces of information from the table that it has found to contain
            the corresponding  password,  such as 1st name, last name.
   v.     it retrieves from the settings table the current semester ID, as that is a pointer on the semester table 
          for the current  year  and semester.
   vi.     it then creates a query to insert into the session table allthe relevant information.
   vii.     it then inserts into the session table the day time stamp for the start of the session
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
	private String login_choice;
	// this stores the choice made on the login boundary 
	// if user chooses to login
	// then login_choice="login"
	// if the user decides not to login 
	// then login_choice="not_to_login"
	private String login_result;
	// this stores the results of the login process.
	// if successful login
	// then login_result="logged_in"
	// if  not successful login 
	// then login_result="not_to_login"
	private String usName;
	// this stores the userName entered by the user
	private String usPassword;
	// this stores the user Password entered by the user.
	private String dBPassword;
	// this stores the user Password that is stored on the database.
	private String FirstName;
	// this stores the first name of the logged in user.
	private String LastName;
	// this stores the last name of the logged in user.
	private String Role;
	// this storte the role of the logged in user
	private String yr_sem;
	// this stores the semesterID of the logged in user.
	
	private String tableNames[]= {"student","lecturer", "coordinator", "administrator"};
	// the name of the table being searched, which could be student, 
	private String query;
	// this stores the query being passed to the entity class to the database.
	private ResultSet results;
	// this stores the results returned back by the entity class to the database
	private int numberOfRows;
	// this stores the number of rows returned from a query
	// if the number of row ==0
	// then the username does not exist in the table being searched
	private String role;
	// this stores the role of the user
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  Control011LoginUser()
		*/		 
		public Control011LoginUser()  
		{
			// This is the constructor for Control011LoginUser()
			// Allows access to the class methods.

		}// close Control011LoginUser() 
		
		
	
		//=========================================================================
		// Define the login_result() method
		/*
		*  login_result()
		*   This method returns back to the calling method whether the login process 
		*   is successful when the returned password matches the value passed in.
		*  
		*/
		public String login_result() 
		{
			return login_result;
		}// end login_result()	
		
		//=========================================================================
		// Define the getFirstName() method
		/*
		*  getFirstName()
		*   This method returns back to the calling method the FirstName of the
		*   logged in user.
		*  
		*/
		public String getFirstName() 
		{
			return FirstName;
		}// end getFirstName()	
		
		//=========================================================================
		// Define the getLastName() method
		/*
		*  LastName()
		*   This method returns back to the calling method the LastName of the
		*   logged in user.
		*  
		*/
		public String getLastName() 
		{
			return LastName;
		}// end getLastName()	
		
		//=========================================================================
		// Define the getRole() method
		/*
		*  LastName()
		*   This method returns back to the calling method the Role of the
		*   logged in user.
		*  
		*/
		public String getRole() 
		{
			return Role;
		}// end getRole()		
		// yr_sem
		//=========================================================================
		// Define the getRr_Sem() method
		/*
		*  LastName()
		*   This method returns back to the calling method the yr_sem of the
		*   logged in user.
		*  
		*/
		public String getYr_Sem() 
		{
			return yr_sem;
		}// end getYr_Sem(()
		
		//=========================================================================
		// Define the  LoginUser() method
		/*
		*   LoginUser()
		*   This method  LoginUser 
		*  ...
		*/
		
		public void LoginUser() throws InterruptedException
		{
			BoundC011LoginUser userLogin = new BoundC011LoginUser();
			//diagnostic..
			//System.out.println("This is the Control011LoginUser() class");
			// call the boundary class for getting the user details for login.

				userLogin.getUserDetailsLogin();
				login_choice="";
				//clear our any previous value
				numberOfRows=0;
				//clear our any previous value
				
				//clear our any previous value
				login_choice=userLogin.login_choice();
				// this stores the results of the login process on the boundary class				
				// this could be that the user provides all the login details
				
				
				// 
				if (login_choice=="login")
				// if login_choice="login"
				// then process the login	
				// login_result!="login", that is ""not_to_login"
				// it will by pass this login process	
				{
					login_result="";
					//clear our any previous value
					do
					{
						usName="";
						//clear our any previous value
						usName=userLogin.getuserName();
						// return the username from the Boundary class.
						
						usPassword="";
						//clear our any previous value
						usPassword=userLogin.getuserPassword();
						// return the userPassword from the Boundary class.
				
						// create an instance of the EntityMySQLInteraction class
						// to make a database connection.		
						EntityMySQLInteraction dbConnect= new EntityMySQLInteraction();
					
						for (int i=0;i<=3; i++)
							// 'i' in the context is the array pointer for tableNames[i]
							/*  tableNames[0]= "student";
							 *  tableNames[1]= "lecturer";
							 *  tableNames[2]= "coordinator";
							 *  tableNames[3]= "administrator";
							 */
						{
							//create the query
							//concatenate with the usName being passed from the boundary class
							query="select password from "+ tableNames[i]+ " where username="+"\'"+usName+"\'";
					
							//call the database connection and pass the query
							dbConnect.setQuery(query);
							//return the result 
							try 
							{
								results=dbConnect.getResults();
								results.last();
								numberOfRows = results.getRow();
								// get the number of rows returned
								// if a row is returned then that means
								// a password exists
								// we need to retrieve it.
													
								results=dbConnect.getResults();
								//re-run the query to extract the password value
								if (numberOfRows==1)
								{
									role=tableNames[i];
									while(results.next())
									{
										dBPassword=results.getString("password");		
										//store the value of the password
									}//close while statement
									break;
									// this should break out of the for loop
								} //end if (numberOfRows==1)
								//diagnostic
								//System.out.println("usPassword:"+usPassword);
								//System.out.println("dBPassword:"+dBPassword);
								
						
						
							} // end the try block
							catch (Exception e) 
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}// end the catch block
						
						}// close the for loop
					//diagnostic
					
						if (numberOfRows==1)
							// this means the user-name exists on the database
							// as it has found the password for the user name.
							// here it will compare the passwords
							// if they match then log in the user.	
							// by inserting a new row on the sessions table	
						{
							if ( dBPassword.equals(usPassword) )
								// passwords match, login the user
								// record their session information
							{
								//insert information into session table.
								// insert code from here.
								/*
								 * Here we will do the following:
								 * a. Retrieve the semesterID from the settings table 
								 * b. Retrieve the user name
								 * c. Retrieve the FirstName
								 * d. Retrieve the role from role=tableNames[i], when 
								 *     (numberOfRows==1)
								 * e. retrieve sess_yr_sem from the semesterID from the settings table
								 * 
								 * And so..
								 * String sess_UserName= usName
								 * String sess_login_status= 'logged_in'
								 * String sess_FirstName= 
								 * String sess_FirstName=
								 * String sess_Role=
								 * String sess_yr_sem=
								 * 
								 */
								
								// Retrieve the FirstName, and the LastName for the userName
								// In order to login the user and create a new session entry.
								query="select FirstName, LastName from "+ role + " where username="+"\'"+usName+"\'";
								dbConnect.setQuery(query);
								try 
								{
									results=dbConnect.getResults();
									while(results.next())
									{
										FirstName=results.getString("firstname");
										LastName =results.getString("lastname");
										
										
										//store the value of the password
									}//close while statement
								}//end the try 
								catch (Exception e) 
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}//end the catch
								
								
								// Retrieve the yr_sem Semester Id from the Settings table
								// This can be used to retrieve the current Year, Semester 
								
								query="select year_semest from settings";
								dbConnect.setQuery(query);
								try 
								{
									results=dbConnect.getResults();
									while(results.next())
									{
										yr_sem=results.getString("year_semest");
									}//close while statement
								}//end the try 
								catch (Exception e) 
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}//end the catch
								
								login_result="logged_in";
								String sess_UserName    =  "\'"  + usName    	+  "\'";
								String sess_FirstName   =  " \'" + FirstName 	+ "\' ";
								String sess_LastName    =  " \'" + LastName  	+ "\' ";
								String sess_Role        =  " \'" + role      	+ "\' ";
								String sess_yr_sem      =  " \'" + yr_sem    	+ "\' ";
								String sess_login_status =  " \'" + login_result	+ "\' ";
								
								query="insert into session"
										+ "("
											+ "sessionID, "
											+ "UserName,"
											+ "login_status,"
											+ "FirstName, "
											+ "LastName,"
											+ "Role, "
											+ "yr_sem,"
											+ "Start_Date_time, "
											+ "End_Date_time"
										+ ")"
										+ "values"
											+ "("
												+ "NULL,"
												+ sess_UserName +","
												+ sess_login_status+","
												+ sess_FirstName+","
												+ sess_LastName+","
												+ sess_Role+","
												+ sess_yr_sem+","
												+ "NULL,"
												+ "NULL"
											+ ")";
								//diagnostic
								//System.out.println("query:"+query);
								dbConnect.setQuery(query);
								try {
									dbConnect.setInsertData();
								} //end the try block
								catch (Exception e) 
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}//end the catch block

								// now lets enter the data-time for the session 
								// start time
								java.util.Date dt = new java.util.Date();
								java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								String currentTime = sdf.format(dt);
								
								
								query="update session SET Start_Date_time="+"\'"+ currentTime +"\'" 
								+ "where login_status ="+"\'"+login_result+"\'"
								+ "and username       ="+"\'"+usName+"\'";
									
								
								dbConnect.setQuery(query);
								try {
									dbConnect.setInsertData();
								} //end the try block
								catch (Exception e) 
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}//end the catch block
								
								
							}//end (dBPassword=usPassword)
							
							//else passwords do not match
							else if  ( !dBPassword.equals(usPassword) )
							{
								//diagnostic
								//System.out.println("passwords do not match, display error message");
								
								// this should call the wrong username or password method. 
								userLogin.wrong_username_or_password_reenter();

							}// end else if  ( !dBPassword.equals(usPassword) )
							
							
						}// end (numberOfRows==1)
						
						else if (numberOfRows==0)
						// this means the user name does not exist
						// as it did not find the user name on the database	
						// we will need to send a message back to the user
						// that there was problem with their user-name
						// and they need to retype it.
						{
							//diagnostic
							//System.out.println("UserName does not exist!  ");
							userLogin.wrong_username_or_password_reenter();
						}

						// ELSE user has chosen not to login
						} while (login_result!="logged_in");
					
					//System.out.println("out of logging loop");
					}// end (login_choice=="login")
					// then login_result="logged_in"
					// if  not successful login 
					// then login_result="not_to_login"
					else if (login_choice=="not_to_login")
					{
						login_result="not_to_login";
					}//else if (registration_choice=="not_to_register")
				


				

			
		}// end LoginUser()
////////////////////////////////////////////////////////////////////////////////
	
	
	
}// end public class Control011LoginUser
