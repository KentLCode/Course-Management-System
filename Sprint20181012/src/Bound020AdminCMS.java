import java.util.Random;
import java.util.Scanner;
public class Bound020AdminCMS
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
a. 	This class is the boundary class for the Administrator


// scrn00.0 CMS Administration Home Screen
b.	When this class  the scrn00.0 CMS Administration Home Screen launches that consists of three components:
		
		scrn00.1: AdminWelcometoCMSAdminScreen screen component displays:
			- The the generic "WELCOME TO THE MCGOWEN...." screen component

		scrn00.2: AdminWelcomeAdminstratorCurrentYearSemesterScreen displays:
			- identfies the name of the administrator [needs Set..() method]
			- identifies the current year and current semester
			- may be include the current date, time [system clock??]

		scrn00.3: AdminWelcomeAdminstrationChoices displays:
			1 	Update the current year and semester 	
			2	Add a new staff member						
			x	log out


// scrn01.0 Update Current Year, Semester screen
c.	Choosing option '1' launches scrn01.0 Update Current Year, Semester	screen that has the following components:
		
		scrn01.1 Update Current Year, Semester>>display current year, semester:
			-displays the current year
			-displays the current semester

		scrn01.2  Update Current Year, Semester>>Waht do you want to do:	 	
			What do you want to do? Choose Option: 
				1. Increment Semester, Year to the next Semester.
				2. Return to the CMS Welcome screen 	
				- prompt for user choice.	

// scrn02.0 add new staff member screen
d. 	choosing option '2' launches scrn02.0  add new staff member screen that has the following components:
		
		scrn02.1 add new staff member screen
			- prompts for the first name of the administrator
			- prompts for the last name of the administrator
			- prompts for the role of the staff member..
				1. Administrator
				2. Course Coordinator
				3. Lecturer
				-prompt for user choice
		
		scrn02.2 displays and prompts the details of the new staff member as: 
			- Present Staff First Name
			- Present Staff Last Name
			- Present Staff Role in College
			- Present Staff Email Address [app generates this as firstName.lastName@mcgowen.edu.au]
			-Present Staff UserName
			-Present Staff Password
			-prompt for user input.. do you want to apply the change:
				1. Yes... apply the changes...
					this provide Information Message.. 
					changes have been applied
				2. No.. back to the Administer CMS Home screen..			




/*--------------------------------------------------------------------------

CHANGE HISTORY:
20181009: First version created by Mike Little


*/

///////////////////////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////
//Define Class Attributes[Variables] Here

// INTERNAL GLOBAL CLASS VARIABLES USED BY THIS BOUNDARY CLASS
// This is a local class variable that stores the choice made
// if they choose '1" it will increment the semester. year
// if they choose '2' it will prompt for the addition of a new
// staff member.

private String logout_choice;
// this stores the choice of the user to logout
// on launch, this is set to logout_choice="logged_in";
// if the user decides to log out,  
// then logout_choice="logged_out"
// this will cause this process to close and this 
// message passed up through the control class for this
// boundary class to the main method, that will cause
// the logout process to start.
	


//CLASS VARIABLES FOR the scrn00.0 CMS Administration Home Screen
private int AdminScreenChoice;
//variable that stores the administrator choice.
private String AdminScreenOperation;
// this is a variable that informs the control class as to the operation performed here
// so as to determine the action in the control class.
// values set are AdminScreenOperation="updateyr_sem"
//                AdminScreenOperation="createnewstaff"

private int AdminUpdateYerSemesterChoice;
//variable that stores the administrator choice.

private Scanner AdminScreenChoice_input1;
//scanner input for the Administration Choice on scrn0120AdminUpdateCurrYearSemChoices Screen Component
private Scanner AdminScreenChoice_input2;
//scanner input for Administration Choice on scrn0120AdminUpdateCurrYearSemChoices Screen Component when neither 1 or 2 is chosen

private int AdminUpdateYearSemesterChoice;
//variable that stores the administrator choice.
private Scanner AdminUpdateYearSemesterChoice_input1;
//scanner input for the Administration Choice on scrn0120AdminUpdateCurrYearSemChoicesScreenComp Screen Component
private Scanner AdminUpdateYearSemesterChoice_input2;
//scanner input for Administration Choice on scrn0120AdminUpdateCurrYearSemChoices Screen Component when neither 1 or 2 is chosen

private int StaffNewRoleChoice;
//variable that stores the StaffNewRole choice
private Scanner StaffNewRoleChoice_input1;
//scanner input for the StaffNewRoleChoice Screen Component
private Scanner StaffNewRoleChoice_input2;
//scanner input for StaffNewRoleChoice Screen Component when neither 1, 2 or 3 is chosen


private String AdminFrstName;
// stores the Administrators First name
private String AdminLastName;
// stores the Administrators Last name



//CLASS VARIABLES FOR the scrn01.0 Admin Update Current Year, Semester screen	
private String CurrentYear;
// this stores the current year
private String CurrentSemester;
// this stores the current semester
private String UpdatedYear;
//this stores the updated year
private String UpdatedSemester;
//this stores the updated semester


//CLASS VARIABLES FOR the scrn02.0 ADMIN add new staff member screen

private Scanner StaffNewFName_input1;
private Scanner StaffNewFName_input2;
private Scanner StaffNewLName_input1;
private Scanner StaffNewLName_input2;
private Scanner StaffNewEmail_input1;
private Scanner StaffNewEmail_input2;



private String StaffNewFName;
private String StaffNewLName;
private String StaffNewEmail;
private String StaffNewRole;

private String StaffNewUsame;
// this stores the generated User-name
private String StaffNewPword;
// this stores the generated User password


///////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////
//Define Class Methods from here



//=========================================================================
// Define the constructor method
/*
*  Bound020AdminCMS() 
*/		 
public Bound020AdminCMS()  
{
	// This is the constructor for Bound020AdminCMS()
	// The boundary class for the Administrator screen.

}// close Bound020AdminCMS() constructor method
//=========================================================================



///////////////////////////////////////////////////////////////////////////
//Methods used by all screens Screen
///////////////////////////////////////////////////////////////////////////

//=========================================================================
//Define the scrn001AdminWelcometoCMSAdminScreenComponent()
/*
*   scrn001AdminWelcometoCMSAdminScreen()
*   This method the screen component that is the welcome to the McGowen Course Management
*   System.
*/	
private void scrn001AdminWelcometoCMSAdminScreenComponent() 
{
	System.out.println("                  WELCOME TO THE MCGOWEN                   ");
	System.out.println("                 COURSE MANAGEMENT SYSTEM                  ");
	System.out.println("             APPLICATION ADMINISTRATION SYSTEM             ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");

}// end display_screen()


//=========================================================================
//Define the clear_console_screen() method
/*
*   clear_console_screen()
*   this is a kuldge as there is no way to refresh/clear the eclipse console
*   and so I shall insert 200 new lines to clear the eclipse console
*/	
private void clear_console_screen()
{
	for (int lines=0; lines<200; lines++)
		{
			System.out.println("                                                           ");
		}// end for (int lines=0; lines<200; lines++)

}// end clear_console_screen()



//=========================================================================
//Define the six_digit_random_number() method
/*
*   this method generates a six digit random number to be appended with
*   the username and password.
*   
*/
public int six_digit_random_number()
{

	Random rnd = new Random(); 
	int n = 100000 + rnd.nextInt(900000);
	return n;
}//end public int six_digit_random_number()

//=========================================================================
//Define the validate_user_input() method
/*
*   This validates the length of the user input that it is not empty.
*/	
private String validate_user_input(String input) 
{
	String result;
	int input_length=input.length();
	if (input_length==0)
	{
		result="Fail";
		return result;
	}

	result="Pass";
	return result;

}// end validate_user_input()

//=========================================================================
//Define the wrong_choice_error_message() method
/*
*   clear_wrong_choice_error_message()
*   this method presents an error message and goes to sleep for a period of time.
*/	
private void wrong_choice_error_message(String message) throws InterruptedException 
{
	System.out.println("                                                           ");
	System.out.println(" "+message+"                                               ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	Thread.sleep(1000);
}// end wrong_choice_error_message()

//=========================================================================
//Define the getAdminScreenOperation() method
/*
*  getAdminScreenOperation()
*   this method returns  back to the calling method
*   the Admin screen operation chosen to determine whether 
*   to update the current year and semester, or add a new user.
*  ...
*/
public String getAdminScreenOperation() 
{
	// insert code from here...
	return AdminScreenOperation;
}// end getAdminScreenOperation()	


//=========================================================================
//Define the getLogout_choice() method
/*
*  logout_choice()
*   this method returns  back to the calling method
*   the choice made by the user whether to log out or not
*  ...
*/
public String getLogout_choice() 
{
	// insert code from here...
	return logout_choice;
}// end getLogout_choice()	


///////////////////////////////////////////////////////////////////////////
//Methods the scrn00.0 CMS Administration Home Screen
///////////////////////////////////////////////////////////////////////////


//=========================================================================
// Define the setAdminFrstName() method
/*
*  SetAdminFrstName()
*   This method sets the Admin First Name details and it is set from
*   the calling constructor class
*  ...
*/
public void setAdminFrstName(String fname) 
{
	// insert code from here...
	AdminFrstName=fname;
}// end SetAdminFrstName()

//=========================================================================
//Define the setAdminLastName() method
/*
*  AdminLastName()
*   This method sets the Admin Last Name details and it is set from
*   the calling constructor class
*  ...
*/
public void setAdminLastName(String lname) 
{
	// insert code from here...
	AdminLastName=lname;
}// end SetAdminFrstName()


//=========================================================================
//Define the scrn002AdminWelcomeAdminNameScreenComp() method
/*
*   scrn002AdminWelcomeAdminstratorCurrentYearSemesterScreen()
*   This method displays the screen component that displays the 
*   Administrator First Name, Last name
*/	

private void scrn002AdminWelcomeAdminNameScreenComp() 
{
	
	System.out.println("                                                           ");
	System.out.println("Welcome "+AdminFrstName+" "+AdminLastName                   );
	System.out.println("                                                           ");
}// end scrn002AdminWelcomeAdminNameScreenComp()


//=========================================================================
//Define the scrn003AdminWelcomeAdminsChoicesScreenComp() method
/*
*   display_screen_selection()
*   This method presents the screen component that 
*   validates the value entered are either 1, 2 
*   of the choice made
*/	

private void scrn003AdminWelcomeAdminsChoicesScreenComp()
{
	System.out.println("                                                           	");
	System.out.println(" What do you want to do? Choose Option:                    	");
	System.out.println(" 1. Increment the Current Semester, Year?                  	");
	System.out.println(" 2. Add a new Staff Member?                                	");
	System.out.println(" 3. Logout					                                ");
	System.out.println("                                                           	");
	System.out.print(" Your Choice: ");
}// end scrn003AdminWelcomeAdminsChoicesScreenComp()	


///////////////////////////////////////////////////////////////////////////
//methods for for the scrn01.0 Update Current Year, Semester screen
///////////////////////////////////////////////////////////////////////////

//=========================================================================
//Define the getUpdatedYear() method
/*
*  getCurrentYear() 
*   called by the control class, this gets the Current Year.
*  ...
*/
public String getUpdatedYear() 
{
	// insert code from here...
	return UpdatedYear ;
}// end getUpdatedYear()	

//=========================================================================
//Define the setCurrentYear() method
/*
*  setCurrentYear()
*   This method sets the current year. 
*  ...
*/
public void SetCurrentYear(String year) 
{
	//insert code from here...
	CurrentYear=year;
}// end setCurrentYear()


//=========================================================================
//Define the getUpdatedSemester() method
/*
*  getCurrentYear() 
*   called by the control class, this gets the Current Year.
Returns this back to the control class.
*  ...
*/
public String getUpdatedSemester() 
{
	// insert code from here...
	return UpdatedSemester ;
}// end getUpdatedSemester()	

//=========================================================================
//Define the setCurrentSemester(String year) method
/*
*  setCurrentSemester()
*   This method sets the current year, which is set by the control class for this boundary class.
*  ...
*/
public void setCurrentSemester(String semester) 
{
	//insert code from here...
	CurrentSemester=semester;
}// end setCurrentSemester()


//=========================================================================
//Define the scrn0120AdminUpdateCurrYearSemChoicesScreenComp() method
/*
*   scrn01.0 Update Current Year, Semester screen
*   display_screen_selection()
*   This method presents the screen component that 
*   presents the user with the choice to increment the current semester, year
*   or return back to the CMS Admin. Home screen.
*   
*/	

private void scrn0120AdminUpdateCurrYearSemChoicesScreenComp() 
{
	System.out.println("Our Current Year    : "+CurrentYear                         );
	System.out.println("Our Current Semester: "+CurrentSemester                     );
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	System.out.println(" What do you want to do? Choose Option:                    ");
	System.out.println(" 1. Increment the Current Semester, Year?                  ");
	System.out.println(" 2.Return to the CMS Admin Home screen?                    ");
	System.out.println("                                                           ");
	System.out.print(" Your Choice: ");
}// end scrn0120AdminUpdateCurrYearSemChoicesScreenComp()



//=========================================================================
//Define the updateCurrentSemesterYear() method
/*
 * CurrentSemester.equals("Semester 1") 
 * 
*   updateCurrentSemesterYear()
*   This method updates the year and semester by [pseudo code]:
*   a. If CurrentSemester.equals("Semester 1") then
*   	  	UpdatedSemester= "Semester 2"
*   		UpdatedYear=CurrentYear
*   b.	If CurrentSemester.equals("Semester 2") then
*   	  	UpdatedSemester= "Semester 1"
*   		int temp_year=Integer.parseInt(CurrentYear);
*   		UpdatedYear=  String.valueOf(temp_year+1);
*  
*/	

private void updateCurrentSemesterYear() 
{
	int temp_year;
	// this is a temporary variable to store the year.
	if  (CurrentSemester.equals("semester 1" ))
	{
		UpdatedSemester= "semester 2";
		UpdatedYear=CurrentYear;
	} //end if  (CurrentSemester.equals("Semester 1" ))
	
	else if (CurrentSemester.equals("Semester 2" ))
	{
		UpdatedSemester= "semester 1";
		temp_year=Integer.parseInt(CurrentYear);
		UpdatedYear=  String.valueOf(temp_year+1);
		
	} // else if (CurrentSemester.equals("Semester 2" ))
}// end updateCurrentSemesterYear()

//=========================================================================
//Define the scrn0120AdminDisplayUpdateYearSemScreenComp() method
/*
*   scrn01.0 Update Current Year, Semester screen
*   display_screen_selection()
*   This method presents the screen component that 
*   presents the user with the choice to increment the current semester, year
*   or return back to the CMS Admin. Home screen.
*   
*/	

private void scrn0120AdminDisplayUpdateYearSemScreenComp() throws InterruptedException
{
	
	System.out.println("The Current Semester and Year has now been updated.        ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	System.out.println("The Updated Semester and Year is now:                      ");
	System.out.println("New Current Year    : "+UpdatedYear                         );
	System.out.println("New Current Semester: "+UpdatedSemester                     );
	System.out.println("                                                           ");
	Thread.sleep(5000);

}// end scrn0120AdminDisplayUpdateYearSemScreenComp()



///////////////////////////////////////////////////////////////////////////
//Methods the scrn02.0  add new staff member screen
///////////////////////////////////////////////////////////////////////////




//=========================================================================
//Define the prompt_for_StaffNewFName() method
/*
*   This prompts for the StaffNewFName
*/	
private void prompt_for_StaffNewFName() 
{
	clear_console_screen();
	System.out.println("                                                           ");
	System.out.print(" What is the Staff Member's First Name:"						);

}// end prompt_for_StaffNewFName()	



//=========================================================================
//Define the prompt_for_StaffNewLName() method
/*
*   This prompts for the StaffNewLName
*/	
private void prompt_for_StaffNewLName() 
{
	clear_console_screen();
	System.out.println("                                                           ");
	System.out.print(" What is the Staff Member's Last Name:"						);

}// end prompt_for_StaffNewLName()	


//=========================================================================
//Define the prompt_for_StaffNewRole() method
/*
*   This prompts for the StaffLName
*/	
private void prompt_for_StaffNewRole()
{
	clear_console_screen();
	System.out.println("                                                           ");
	System.out.println(" What is the role of the Staff Memeber? Choose Option:     ");
	System.out.println(" 1. Administrator                                          ");
	System.out.println(" 2. Coordianator                                           ");
	System.out.println(" 3. Lecturer                                               ");
	System.out.println("                                                           ");
	System.out.print(" Your Choice: ");

}// end prompt_for_StaffNewRole()	

//=========================================================================
//Define the generateStaffNewEmail() method
/*
*   This generates the email address of the new staff member. 
*   It also includes the role of the new staff member in the email address.
*/	
private void generateStaffNewEmail() 
{
	//clear_console_screen();
	//System.out.println("                                                           ");
	//System.out.print(" What is your email address: ");
	//StaffNewEmail_input= new Scanner(System.in);
	StaffNewEmail= StaffNewFName+"."+StaffNewLName+"@"+StaffNewRole+".mgowen.edu.au";

}// end generateStaffNewEmail()	


//generateStaffNewUsame
//=========================================================================
//Define the generateStaffNewUsame() method
/*
*   This generates the User Name of the new staff member. 
*/
private void generateStaffNewUsame()
{
	//generate the user name by appending a six digit random number
	String StaffNewUsame_random_number=String.valueOf(six_digit_random_number());
	StaffNewUsame="STF"+StaffNewUsame_random_number;
	
	
}//end generateStaffNewUsame()



//generateStaffNewPword
//=========================================================================
//Define the generateStaffNewPword() method
/*
*   This generates the password of the new staff member. 
*/
private void generateStaffNewPword()
{
	//generate the user name by appending a six digit random number
	String StaffNewPword_random_number=String.valueOf(six_digit_random_number());
	StaffNewPword="PWD"+StaffNewPword_random_number;
}//end generateStaffNewPword()



//=========================================================================
//Define the scrn022AdminDisplayStaffMemberDetailsConfirmScreenComp() method
/*
*   scrn022AdminDisplayStaffMemberDetailsConfirmScreenComp()
*   this method presents the details of the new staff member in terms of:
*   a. 
*/	



private void scrn022AdminDisplayStaffMemberDetailsConfirmScreenComp() throws InterruptedException 
{

	System.out.println("Here is the registration details of the new staff member...    			");
	System.out.println("	Their First Name          			:"+StaffNewFName        		);
	System.out.println("	Their Last Name           			:"+StaffNewLName        		);
	System.out.println("	The role of the new staff member    :"+StaffNewRole					);
	System.out.println("	Their email address       			:"+StaffNewEmail        		);
	System.out.println("                                                           				");
	System.out.println("                                                           				");
	System.out.println("Here are the login details of the staff member,  take a note of them..  ");
	System.out.println("	Their login username is   			:"+StaffNewUsame            	);
	System.out.println("	Thei login password is   			:"+StaffNewPword            	);
	System.out.println("                                                           				");
	System.out.println("                                                           				");
	Thread.sleep(16000);

}// end scrn022AdminDisplayStaffMemberDetailsConfirmScreenComp()	

//=========================================================================
//Define the getStaffNewFName() method
/*
*  getStaffNewFName()
*   This method returns the student registration First Name details. 
*  ...
*/
public String getStaffNewFName() 
{
	// insert code from here...
	return StaffNewFName;
}// end getStaffNewFName()

//=========================================================================
//Define the getStaffNewLName() method
/*
*  getStaffNewLName()
*   This method returns the registration last Name details.
*  ...
*/
public String getStaffNewLName() 
{
	// insert code from here...
	return StaffNewLName;
}// end getStaffNewLName()


//=========================================================================
//Define the getStaffNewRole() method
/*
*  StaffNewType()
*   This method returns the staff new type [Administrator, Coordinator, Lecturer] details
*  ...
*/
public String getStaffNewRole() 
{
	// insert code from here...
	return StaffNewRole;
}// end getStaffNewRole()	


//=========================================================================
//Define the getStaffNewEmail() method
/*
*  getStaffNewEmail() 
*   This method returns the registration email details details 
*  ...
*/
public String getStaffNewEmail() 
{
	// insert code from here...
	return StaffNewEmail;
}// end getStaffNewEmail()



//=========================================================================
//Define the getStaffNewUsame() method
/*
*  StaffNewUsame()
*   This method returns the Staff Registered User name
*  ...
*/
public String getStaffNewUsame() 
{
	// insert code from here...
	return StaffNewUsame;
}// end getStaffNewUsame()	



//=========================================================================
//Define the getStaffNewPword() method
/*
*  StaffNewPword()
*   This method returns the Staff Registered password
*  ...
*/
public String getStaffNewPword() 
{
	// insert code from here...
	return StaffNewPword;
}// end getStaffNewPword()	




////////////////////////////////////////////////////////////////////////////////
//Main Boundary Class Method for processing the CMS Administration Information
////////////////////////////////////////////////////////////////////////////////


//=========================================================================
// Define the CMSApplicationAdministrationManagementBoundary() method
/*
// this method provides the screen flows for administering the 
 * Course Management System.
*  
*/

public void CMSApplicationAdministrationManagementBoundary() throws InterruptedException
{
	logout_choice="logged_in";
	// this stores the choice of the user to logout
	// on launch, this is set to logout_choice="logged_in";
	// if the user decides to log out,  
	// then logout_choice="logged_out"
	
	Control020AdminCMS adminCMSControl = new Control020AdminCMS();
	// this has been instantiated to gain access to the 
	// methods to update the current year semester
	// and add new staff member.

	
	clear_console_screen();
	// This clears the console screen.
	scrn001AdminWelcometoCMSAdminScreenComponent();
	// this is the intro screen component for the welcome to the 
	// Application Administration system.
	scrn002AdminWelcomeAdminNameScreenComp();
	//  This method displays the screen component that displays the 
	//   Administrator First Name, Last name
	scrn003AdminWelcomeAdminsChoicesScreenComp();
	// this screen component prompts for the choice
	// to increment the semester, year
	// add a new staff member.
	// or to log out.
	AdminScreenChoice_input1= new Scanner (System.in);
	AdminScreenChoice=AdminScreenChoice_input1.nextInt();
	
	do
	{
		if (AdminScreenChoice==1)
		{
			// user has chosen to increment the current year to the next semester.
			clear_console_screen();
			// This clears the console screen.
			scrn0120AdminUpdateCurrYearSemChoicesScreenComp();
			AdminUpdateYearSemesterChoice_input1 = new Scanner (System.in);
			AdminUpdateYearSemesterChoice = AdminUpdateYearSemesterChoice_input1.nextInt();
			
			
			if (AdminUpdateYearSemesterChoice==1)
			{
				clear_console_screen();
				//clear the screen
				updateCurrentSemesterYear();
				// this has updated the current year and current semester
				scrn0120AdminDisplayUpdateYearSemScreenComp();
				//displays the new updated year and semester
				
				adminCMSControl.setUpdatedYearSemester(UpdatedYear, UpdatedSemester);
				//this causes the control class to update the year, and semester.	
				
				clear_console_screen();
				// This clears the console screen.
				scrn001AdminWelcometoCMSAdminScreenComponent();
				// this is the intro screen component for the welcome to the 
				// Application Administration system.
				scrn002AdminWelcomeAdminNameScreenComp();
				//  This method displays the screen component that displays the 
				//   Administrator First Name, Last name
				scrn003AdminWelcomeAdminsChoicesScreenComp();
				// this screen component prompts for the choice
				// to increment the semester, year
				// add a new staff member.
				// or to log out.
				AdminScreenChoice_input2= new Scanner (System.in);
				AdminScreenChoice=AdminScreenChoice_input2.nextInt();
				
				
			}//end 
			
			else if (AdminUpdateYearSemesterChoice==2)
			{
				//user decides to return to the Administrator home screen.
				// using a break statement to break out of this choice back to the 
				// main loop 
				clear_console_screen();
				// This clears the console screen.
				scrn001AdminWelcometoCMSAdminScreenComponent();
				// this is the intro screen component for the welcome to the 
				// Application Administration system.
				scrn002AdminWelcomeAdminNameScreenComp();
				//  This method displays the screen component that displays the 
				//   Administrator First Name, Last name
				scrn003AdminWelcomeAdminsChoicesScreenComp();
				// this screen component prompts for the choice
				// to increment the semester, year
				// add a new staff member.
				// or to log out.
				AdminScreenChoice_input2= new Scanner (System.in);
				AdminScreenChoice=AdminScreenChoice_input2.nextInt();
			}// end else if (AdminUpdateYerSemesterChoice==2)
			else if ((AdminUpdateYearSemesterChoice!=1 ) || (AdminUpdateYearSemesterChoice!=2))	
			{
				// what happens here??
				
			}// end else if ((AdminUpdateYerSemesterChoice!=1 ) || (AdminUpdateYerSemesterChoice!=2))
			

		}//end if (AdminScreenChoice==1)
		
		else if (AdminScreenChoice==2) 
		{
			//user has chosen to add a new staff member
			//--> from here
			//System.out.println ("user has chosen to add a new staff member" );
			//break;
			clear_console_screen();
			
			prompt_for_StaffNewFName();
			StaffNewFName_input1= new Scanner(System.in);
			StaffNewFName= StaffNewFName_input1.nextLine();
			if (validate_user_input(StaffNewFName)=="Fail")
			{
				do
				{
					clear_console_screen();
					wrong_choice_error_message("Staff First Name contains no characters");
					clear_console_screen();
					prompt_for_StaffNewFName();
					StaffNewFName_input2= new Scanner(System.in);
					StaffNewFName= StaffNewFName_input2.nextLine();
					StaffNewFName_input2.close();
					validate_user_input(StaffNewFName);
				}
				while (validate_user_input(StaffNewFName)=="Fail");
			}//end if (validate_user_input(StaffNewFName)=="Fail")
			
			clear_console_screen();
			prompt_for_StaffNewLName();
			//retrieve StaffNewLName
			clear_console_screen();
			prompt_for_StaffNewLName();
			StaffNewLName_input1= new Scanner(System.in);
			StaffNewLName= StaffNewLName_input1.nextLine();
			if (validate_user_input(StaffNewLName)=="Fail")
			{
				do
				{
					clear_console_screen();
					wrong_choice_error_message("Registered Last Name contains no characters");
					clear_console_screen();
					prompt_for_StaffNewFName();
					StaffNewLName_input2= new Scanner(System.in);
					StaffNewLName= StaffNewLName_input2.nextLine();
					StaffNewLName_input2.close();
					validate_user_input(StaffNewLName);
				}
				while (validate_user_input(StaffNewFName)=="Fail");
			}//end if (validate_user_input(StaffNewFName)=="Fail")
			
			clear_console_screen();
			prompt_for_StaffNewRole();
			//StaffNewRole_Choice
			StaffNewRoleChoice_input1= new Scanner (System.in);
			StaffNewRoleChoice=StaffNewRoleChoice_input1.nextInt();
			
			if (StaffNewRoleChoice==1)
			{
				// choice is "Administrator"
				StaffNewRole="Administrator";
			}//end if (StaffNewRoleChoice==1)
			
			else if (StaffNewRoleChoice==2)	
			{
				// choice is "Coordinator"
				StaffNewRole="Coordinator";
			}//end if (StaffNewRoleChoice==2)
			
			else if (StaffNewRoleChoice==3)	
			{
				// choice is "Lecturer"
				StaffNewRole="Lecturer";
			}//end if (StaffNewRoleChoice==3)
						
			else if ((StaffNewRoleChoice!=1)||(StaffNewRoleChoice!=2)||(StaffNewRoleChoice!=3)	)
			{
				//wrong_value_enter();
				clear_console_screen();
				wrong_choice_error_message("You have not chosen option 1, 2 or 3");
				clear_console_screen();
				prompt_for_StaffNewRole();
				//StaffNewRole_Choice
				StaffNewRoleChoice_input2= new Scanner (System.in);
				StaffNewRoleChoice=StaffNewRoleChoice_input2.nextInt();
			}//end else if ((StaffNewRoleChoice!=1)||(StaffNewRoleChoice!=2)||(StaffNewRoleChoice!=3)	)
			generateStaffNewEmail();
			//generate the email address for the new staff member
			generateStaffNewUsame();
			//generate the Staff User name.
			generateStaffNewPword();
			// generate the staff password.
			
			adminCMSControl.setCreateNewStaffMember(StaffNewRole,StaffNewUsame, StaffNewFName, StaffNewLName, StaffNewPword, StaffNewEmail);
			// this causes the control class create the staff member details.
			
			clear_console_screen();
			scrn022AdminDisplayStaffMemberDetailsConfirmScreenComp();
			// display the the details of the newly registered staff member.
			
			clear_console_screen();
			scrn003AdminWelcomeAdminsChoicesScreenComp();
			// this screen component prompts for the choice
			// to increment the semester, year
			// add a new staff member.
			AdminScreenChoice_input2 = new Scanner (System.in);
			AdminScreenChoice = AdminScreenChoice_input2.nextInt();
		
			
		}//end if (AdminScreenChoice==2)
		
		
		else if (AdminScreenChoice==3) 
		{
			//user has chosen to logout
			logout_choice="logged_out";
			// changing this will cause this process to end, and
			// hand back control to the control class which will
			// hand control to main() method
			
		}//end if (AdminScreenChoice==2)
		
		else if ((AdminScreenChoice!=1 ) || (AdminScreenChoice!=2)||(AdminScreenChoice!=3) )	
		{
			//wrong_value_enter();
			clear_console_screen();
			wrong_choice_error_message("You have not chosen option 1, 2 or 3");
			clear_console_screen();
			scrn003AdminWelcomeAdminsChoicesScreenComp();
			// this screen component prompts for the choice
			// to increment the semester, year
			// add a new staff member.
			AdminScreenChoice_input2 = new Scanner (System.in);
			AdminScreenChoice = AdminScreenChoice_input2.nextInt();


		} //else if ((Choice!=1 ) || (Choice!=2));
	}
	while (logout_choice!="logged_out");
	
}// end CMSApplicationAdministrationManagementBoundary()	


////////////////////////////////////////////////////////////////////////////////


}//end public class Bound020AdminCMS 

