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
		
		scrn00.1: AdminWelcometoCMSAdminScreen displays:
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
//Define Class Attributes[Variables] Here

// INTERNAL CLASS VARIABLES USED BY THIS BOUNDARY CLASS
private int Choice;
// This is a local class variable that stores the choice made
private String logout_choice;
// this stores the choice of the user to logout
// on launch, this is set to logout_choice="logged_in";
// if the user decides to log out,  
// then logout_choice="logged_out"
// this will cause this process to close and this 
// message passed up through the control class for this
// boundary class to the main method, that will cause
// the logout process to start.
	


//CLASS VARIABLES FOR THE ADMINISTRATOR DETAILS
private String AdminFrstName;
// stores the Administrators First name
private String AdminLastName;
// stores the Administrators Last name



//CLASS VARIABLES FOR CURRENT YEAR, SEMESTER	
private String CurrentYear;
// this stores the current year
private String CurrentSemester;
// this stores the current semester



//SCANNER VARIABLES FOR RETURNING INPUT FROM THE CONSOLE
private Scanner input1;
//scanner input for Choice	on first entry screen
private Scanner input2;
//scanner input for Choice	when neither 1 or 2 is chosen
private Scanner StaffNewFName_input;
private Scanner StaffNewFName_input2;
private Scanner StaffNewLName_input;
private Scanner StaffNewLName_input2;
private Scanner StaffNewEmail_input;
private Scanner StaffNewEmail_input2;
private Scanner StaffNewType_input;
//private Scanner StaffNewType_input2;



//CLASS VARIABLES FOR NEW STAFF DETAILS
private String StaffNewFName;
private String StaffNewLName;
private String StaffNewEmail;
private String StaffNewType;
private int StaffNewType_Choice;
// administrator, coordinator, lecturer
private String StaffNewUsame;
// this stores the generated User-name
private String StaffNewPword;
// this stores the generated User password


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
//Define the display_screen() method
/*
*  display_screen()
*   This method validates the value entered are either 1, 2 
*   of the choice made
*/	
private void display_screen_intro() 
{
	System.out.println("                  WELCOME TO THE MCGOWEN                   ");
	System.out.println("                 COURSE MANAGEMENT SYSTEM                  ");
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
//Define the wrong_choice_error_message() method
/*
*   clear_wrong_choice_error_message()
*   this method presents an error message and goes to sleep for a period of time.
*/	
private void wrong_choice_error_message(String message) throws InterruptedException 
{
	System.out.println("                                                           ");
	System.out.println(" "+message+"             ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	Thread.sleep(1000);
}// end wrong_choice_error_message()



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




///////////////////////////////////////////////////////////////////////////
//Methods the scrn00.0 CMS Administration Home Screen
///////////////////////////////////////////////////////////////////////////





//=========================================================================
//Define the display_screen_selection() method
/*
*   display_screen_selection()
*   This method validates the value entered are either 1, 2 
*   of the choice made
*/	

private void display_rego_selections_screen() 
{
	System.out.println("                                                           ");
	System.out.println(" What do you want to do? Choose Option:                    ");
	System.out.println(" 1. Register as a student for our courses?                 ");
	System.out.println(" 2. Return to the CMS Welcome screen                       ");
	System.out.println("                                                           ");
	System.out.print(" Your Choice: ");
}// end display_screen()	




//=========================================================================
// Define the setAdminFrstName() method
/*
*  SetAdminFrstName()
*   This method sets the Admin First Name details from the calling constructor class
*  ...
*/
public void setAdminFrstName(String fname) 
{
	// insert code from here...
	AdminFrstName=fname;
}// end SetAdminFrstName()



//=========================================================================
// Define the setAdminLastName() method
/*
*  AdminLastName()
*   This method sets the Admin Last Name details. 
*  ...
*/
public void setAdminLastName(String lname) 
{
	// insert code from here...
	AdminFrstName=lname;
}// end SetAdminFrstName()



//=========================================================================
// Define the getCurrentYear() method
/*
*  getCurrentYear() 
*   called by the control class, this gets the Current Year.
*  ...
*/
public String getCurrentYear() 
{
	// insert code from here...
	return CurrentYear;
}// end getSetCurrentYear()	



//=========================================================================
// Define the getCurrentSemester() method
/*
*  getCurrentYear() 
*   called by the control class, this gets the Current Year.
Returns this back to the control class.
*  ...
*/
public String getCurrentSemester() 
{
	// insert code from here...
	return CurrentSemester;
}// end getSetCurrentYear()	




///////////////////////////////////////////////////////////////////////////
//methods for for the scrn01.0 Update Current Year, Semester screen
///////////////////////////////////////////////////////////////////////////



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
// Define the getStaffNewLName() method
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
// Define the getStaffNewFName() method
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
// Define the getStaffNewEmail() method
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
// Define the StaffNewType() method
/*
*  StaffNewType()
*   This method returns the registration type {[International, Domestic] details
*  ...
*/
public String StaffNewType() 
{
	// insert code from here...
	return StaffNewType;
}// end StaffNewType()	



//=========================================================================
// Define the StaffNewUsame() method
/*
*  StaffNewUsame()
*   This method returns the Staff Registered User name
*  ...
*/
public String StaffNewUsame() 
{
	// insert code from here...
	return StaffNewUsame;
}// end StaffNewUsame()	



//=========================================================================
// Define the StaffNewPword() method
/*
*  StaffNewPword()
*   This method returns the Staff Registered password
*  ...
*/
public String StaffNewPword() 
{
	// insert code from here...
	return StaffNewPword;
}// end StaffNewPword()	



//=========================================================================
// Define the logout_choice() method
/*
*  logout_choice()
*   this method returns  back to the calling method
*   the choice made by the user whether to register or not
*  ...
*/
public String logout_choice() 
{
	// insert code from here...
	return logout_choice;
}// end logout_choice()	












///////////////////////////////////////////////////////////////////////////
//Methods the scrn02.0  add new staff member screen
///////////////////////////////////////////////////////////////////////////

//=========================================================================
//Define the display_registration_details() method
/*
*   display_registration_details()
*   this method presents the registration details.
*/	



private void display_registration_details() throws InterruptedException 
{

	System.out.println("Here is your registration profile details...               ");
	System.out.println("	Your First Name          :"+StaffNewFName            );
	System.out.println("	Your Last Name           :"+StaffNewLName            );
	System.out.println("	Your email address       :"+StaffNewEmail            );
	System.out.println("	Your are an "+StaffNewType+" student                ");
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	System.out.println("Here are your login details, take a note of them..         ");
	System.out.println("	Your login username is   :"+StaffNewUsame            );
	System.out.println("	Your login password is   :"+StaffNewPword            );
	System.out.println("                                                           ");
	System.out.println("                                                           ");
	Thread.sleep(16000);

}// end display_registration_details()	



//=========================================================================
//Define the prompt_for_StaffNewType() method
/*
*   This prompts for the StaffLName
*/	
private void prompt_for_StaffNewType() throws InterruptedException
{
	clear_console_screen();
	System.out.println("                                                           ");
	System.out.println(" What type of student are you? Choose Option:              ");
	System.out.println(" 1. International                                          ");
	System.out.println(" 2. Domestic                                               ");
	System.out.println("                                                           ");
	System.out.print(" Your Choice: ");

}// end prompt_for_StaffNewType()	


//=========================================================================
// Define the prompt_for_StaffNewFName() method
/*
*   This prompts for the StaffNewFName
*/	
private void prompt_for_StaffNewFName() 
{
	clear_console_screen();
	System.out.println("                                                           ");
	System.out.print(" What is your First Name: ");

}// end prompt_for_StaffNewFName()	



//=========================================================================
// Define the prompt_for_StaffNewLName() method
/*
*   This prompts for the StaffNewLName
*/	
private void prompt_for_StaffNewLName() 
{
	clear_console_screen();
	System.out.println("                                                           ");
	System.out.print(" What is your Last Name: ");

}// end prompt_for_StaffNewLName()	



//=========================================================================
// Define the prompt_for_StaffNewEmail() method
/*
*   This prompts for the StaffLName
*/	
private void prompt_for_StaffNewEmail() 
{
	clear_console_screen();
	System.out.println("                                                           ");
	System.out.print(" What is your email address: ");
	StaffNewEmail_input= new Scanner(System.in);
	StaffNewEmail= StaffNewEmail_input.nextLine();

}// end prompt_for_StaffNewEmail()	





////////////////////////////////////////////////////////////////////////////////
//Main Boundary Class Method for processing the CMS Administration Information
////////////////////////////////////////////////////////////////////////////////


//=========================================================================
// Define the getNewStaffDetailsCreated() method
/*
// this method presents a form to get the student details for
// StaffNewFName, StaffNewLName, StaffNewEmail, StaffNewType
// it will need separate accessor methods to retrieve the staff
// first name, last name, email, and type.
*  ...
*/

public void getNewStaffDetailsCreated() throws InterruptedException
{
	logout_choice="";
	//set registration_results to a NULL value to clear any previous settings.
	clear_console_screen();
	display_screen_intro();
	display_rego_selections_screen();
	input1 = new Scanner (System.in);
	Choice = input1.nextInt();

if (Choice==1)
{
	//user has decided to register.
	// retrieve following details..
	/*
	 * 	private String StaffNewFName;
	private String StaffNewLName;
	private String StaffNewEmail;
	private String StaffNewType;
	 */


//retrieve StaffNewFName
	clear_console_screen();
	prompt_for_StaffNewFName();
	StaffNewFName_input= new Scanner(System.in);
	StaffNewFName= StaffNewFName_input.nextLine();
	if (validate_user_input(StaffNewFName)=="Fail")
	{
		do
		{
			clear_console_screen();
			wrong_choice_error_message("Registered First Name contains no characters");
			clear_console_screen();
			prompt_for_StaffNewFName();
			StaffNewFName_input2= new Scanner(System.in);
			StaffNewFName= StaffNewFName_input.nextLine();
			StaffNewFName_input2.close();
			validate_user_input(StaffNewFName);
		}
		while (validate_user_input(StaffNewFName)=="Fail");
	}//end if (validate_user_input(StaffNewFName)=="Fail")

	//retrieve StaffNewLName
	clear_console_screen();
	prompt_for_StaffNewLName();
	StaffNewLName_input= new Scanner(System.in);
	StaffNewLName= StaffNewLName_input.nextLine();
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

	//retrieve StaffNewEmail
	clear_console_screen();
	prompt_for_StaffNewEmail();
	//StaffNewEmail_input= new Scanner(System.in);
	//StaffNewEmail= StaffNewEmail_input.nextLine();
	if (validate_user_input(StaffNewEmail)=="Fail")
	{
		do
		{
			clear_console_screen();
			wrong_choice_error_message("Registered Email contains no characters");
			clear_console_screen();
			prompt_for_StaffNewEmail();
			StaffNewEmail_input2= new Scanner(System.in);
			StaffNewEmail= StaffNewEmail_input2.nextLine();
			StaffNewEmail_input2.close();
			validate_user_input(StaffNewEmail);
		}
		while (validate_user_input(StaffNewEmail)=="Fail");
	}//end if (validate_user_input(StaffNewEmail)=="Fail")

	//retrieve StaffNewType
	prompt_for_StaffNewType();
	StaffNewType_input= new Scanner(System.in);
	StaffNewType_Choice = StaffNewType_input.nextInt();
	if (StaffNewType_Choice==1)
	{
		StaffNewType="International";
	}//end if (StaffNewType_Choice==1)
	else if (StaffNewType_Choice==2)
	{
		StaffNewType="Domestic";
	} //end else if (StaffNewType_Choice==2)
	else if ((StaffNewType_Choice==1)||(StaffNewType_Choice==2))
	{
		clear_console_screen();
		wrong_choice_error_message("You have not chosen option 1 or 2");
		clear_console_screen();
		prompt_for_StaffNewType();
	}// else if ((StaffNewType_Choice==1)||(StaffNewType_Choice==2))

	// generate the user name by appending a six digit random number
	String StaffNewUsame_random_number=String.valueOf(six_digit_random_number());
	StaffNewUsame="STU"+StaffNewUsame_random_number;

	// generate a password by appending a six digit random number
	String StaffNewPword_random_number=String.valueOf(six_digit_random_number());
	StaffNewPword="ABD"+StaffNewPword_random_number;

	//display registration details of student
	clear_console_screen();
	display_registration_details();
	logout_choice="register";			
	//return logout_choice;
	}// end (Choice==1)

	else if (Choice==2) 
	{
		//user has chosen not to registration_
		//need to set logout_choice="not_to_register"
		logout_choice="not_to_register";
	} // end 	else if (Choice==2)
	else if ((Choice!=1 ) || (Choice!=2))	
	{
		//wrong_value_enter();
		clear_console_screen();
		wrong_choice_error_message("You have not chosen option 1 or 2");
		display_rego_selections_screen();
		input2 = new Scanner (System.in);
		Choice = input2.nextInt();


	} //else if ((Choice!=1 ) || (Choice!=2));

	}// end getStaffDetailsRegistered()	


////////////////////////////////////////////////////////////////////////////////


}//end public class Bound020AdminCMS 

