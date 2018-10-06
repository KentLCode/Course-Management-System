import java.util.Random;
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
	
	private int Choice;
	// This is a local class variable that stores the choice made
	private Scanner input1;
	//scanner input for Choice	on first entry screen
	private Scanner input2;
	//scanner input for Choice	when neither 1 or 2 is chosen
	
	private Scanner StudentRegoFName_input;
	private Scanner StudentRegoFName_input2;
	
	private Scanner StudentRegoLName_input;
	private Scanner StudentRegoLName_input2;
	
	private Scanner StudentRegoEmail_input;
	private Scanner StudentRegoEmail_input2;
	
	private Scanner StudentRegoType_input;
	//private Scanner StudentRegoType_input2;

	
	private int StudentRegoType_Choice;
	
	private String StudentRegoUsame;
	// this stores the generated Username
	
	private String StudentRegoPword;
	// this stores the generated Username

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
		// Define the getStudentRegoFName() method
		/*
		*  getStudentRegoFName()
		*   This method returns the student registration First Name details. 
		*  ...
		*/
		public String getStudentRegoFName() 
		{
			// insert code from here...
			return StudentRegoFName;
		}// end getStudentRegoFName()

		//=========================================================================
		// Define the getStudentRegoLName() method
		/*
		*  getStudentRegoLName()
		*   This method returns the registration last Name details.
		*  ...
		*/
		public String getStudentRegoLName() 
		{
			// insert code from here...
			return StudentRegoLName;
		}// end getStudentRegoLName()

		//=========================================================================
		// Define the getStudentRegoEmail() method
		/*
		*  getStudentRegoEmail() 
		*   This method returns the registration email details details 
		*  ...
		*/
		public String getStudentRegoEmail() 
		{
			// insert code from here...
			return StudentRegoEmail;
		}// end getStudentRegoEmail()
		
		//=========================================================================
		// Define the StudentRegoType() method
		/*
		*  StudentRegoType()
		*   This method returns the registration type {[International, Domestic] details
		*  ...
		*/
		public String StudentRegoType() 
		{
			// insert code from here...
			return StudentRegoType;
		}// end StudentRegoType()	
		
		//=========================================================================
		// Define the StudentRegoUsame() method
		/*
		*  StudentRegoUsame()
		*   This method returns the Student Registered User name
		*  ...
		*/
		public String StudentRegoUsame() 
		{
			// insert code from here...
			return StudentRegoUsame;
		}// end StudentRegoUsame()	
		//=========================================================================
		// Define the StudentRegoPword() method
		/*
		*  StudentRegoPword()
		*   This method returns the Student Registered password
		*  ...
		*/
		public String StudentRegoPword() 
		{
			// insert code from here...
			return StudentRegoPword;
		}// end StudentRegoPword()	
		
		
		
		//=========================================================================
		// Define the registration_choice() method
		/*
		*  registration_choice()
		*   this method returns  back to the calling method
		*   the choice made by the user whether to register or not
		*  ...
		*/
		public String registration_choice() 
		{
			// insert code from here...
			return registration_choice;
		}// end registration_choice()	
		
		//=========================================================================
		// Define the display_screen() method
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
		// Define the display_screen_selection() method
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
		// Define the clear_console_screen() method
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
		// Define the prompt_for_StudentRegoFName() method
		/*
		*   This prompts for the StudentRegoFName
		*/	
		private void prompt_for_StudentRegoFName() 
		{
			clear_console_screen();
			System.out.println("                                                           ");
			System.out.print(" What is your First Name: ");

		}// end prompt_for_StudentRegoFName()	
		
		//=========================================================================
		// Define the prompt_for_StudentRegoLName() method
		/*
		*   This prompts for the StudentRegoLName
		*/	
		private void prompt_for_StudentRegoLName() 
		{
			clear_console_screen();
			System.out.println("                                                           ");
			System.out.print(" What is your Last Name: ");
			
		}// end prompt_for_StudentRegoLName()	
		
		//=========================================================================
		// Define the prompt_for_StudentRegoEmail() method
		/*
		*   This prompts for the StudentLName
		*/	
		private void prompt_for_StudentRegoEmail() 
		{
			clear_console_screen();
			System.out.println("                                                           ");
			System.out.print(" What is your email address: ");
			StudentRegoEmail_input= new Scanner(System.in);
			StudentRegoEmail= StudentRegoEmail_input.nextLine();
			
		}// end prompt_for_StudentRegoEmail()	
		//=========================================================================
		// Define the prompt_for_StudentRegoType() method
		/*
		*   This prompts for the StudentLName
		*/	
		private void prompt_for_StudentRegoType() throws InterruptedException
		{
			clear_console_screen();
			System.out.println("                                                           ");
			System.out.println(" What type of student are you? Choose Option:              ");
			System.out.println(" 1. International                                          ");
			System.out.println(" 2. Domestic                                               ");
			System.out.println("                                                           ");
			System.out.print(" Your Choice: ");

			
		}// end prompt_for_StudentRegoType()		
		
		
		
		

		//=========================================================================
		// Define the validate_user_input() method
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
		// Define the wrong_choice_error_message() method
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
		// Define the display_registration_details() method
		/*
		*   display_registration_details()
		*   this method presents the registration details.
		*/	
		private void display_registration_details() throws InterruptedException 
		{
			
				System.out.println("Here is your registration profile details...               ");
				System.out.println("	Your First Name          :"+StudentRegoFName            );
				System.out.println("	Your Last Name           :"+StudentRegoLName            );
				System.out.println("	Your email address       :"+StudentRegoEmail            );
				System.out.println("	Your are an "+StudentRegoType+" student                ");
				System.out.println("                                                           ");
				System.out.println("                                                           ");
				System.out.println("Here are your login details, take a note of them..         ");
				System.out.println("	Your login username is   :"+StudentRegoUsame            );
				System.out.println("	Your login password is   :"+StudentRegoPword            );
				System.out.println("                                                           ");
				System.out.println("                                                           ");
				Thread.sleep(16000);
			
		}// end display_registration_details()	
		
		
		//=========================================================================
		// Define the six_digit_random_number() method
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
		}
		//=========================================================================
		// Define the getStudentDetailsRegistered() method
		/*
			// this method presents a form to get the student details for
			// StudentRegoFName, StudentRegoLName, StudentRegoEmail, StudentRegoLType
			// it will need separate accessor methods to retrieve the student
			// first name, last name, email, and type.
		*  ...
		*/
		
		public void getStudentDetailsRegistered() throws InterruptedException
		{

			
			registration_choice="";
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
				 * 	private String StudentRegoFName;
					private String StudentRegoLName;
					private String StudentRegoEmail;
					private String StudentRegoType;
				 */
				
				
				//retrieve StudentRegoFName
				clear_console_screen();
				prompt_for_StudentRegoFName();
				StudentRegoFName_input= new Scanner(System.in);
				StudentRegoFName= StudentRegoFName_input.nextLine();
				if (validate_user_input(StudentRegoFName)=="Fail")
				{
					do
					{
						clear_console_screen();
						wrong_choice_error_message("Registered First Name contains no characters");
						clear_console_screen();
						prompt_for_StudentRegoFName();
						StudentRegoFName_input2= new Scanner(System.in);
						StudentRegoFName= StudentRegoFName_input.nextLine();
						StudentRegoFName_input2.close();
						validate_user_input(StudentRegoFName);
					}
					while (validate_user_input(StudentRegoFName)=="Fail");
				}//end if (validate_user_input(StudentRegoFName)=="Fail")
					
				//retrieve StudentRegoLName
				clear_console_screen();
				prompt_for_StudentRegoLName();
				StudentRegoLName_input= new Scanner(System.in);
				StudentRegoLName= StudentRegoLName_input.nextLine();
				if (validate_user_input(StudentRegoLName)=="Fail")
				{
					do
					{
						clear_console_screen();
						wrong_choice_error_message("Registered Last Name contains no characters");
						clear_console_screen();
						prompt_for_StudentRegoFName();
						StudentRegoLName_input2= new Scanner(System.in);
						StudentRegoLName= StudentRegoLName_input2.nextLine();
						StudentRegoLName_input2.close();
						validate_user_input(StudentRegoLName);
					}
					while (validate_user_input(StudentRegoFName)=="Fail");
				}//end if (validate_user_input(StudentRegoFName)=="Fail")

				//retrieve StudentRegoEmail
				clear_console_screen();
				prompt_for_StudentRegoEmail();
				//StudentRegoEmail_input= new Scanner(System.in);
				//StudentRegoEmail= StudentRegoEmail_input.nextLine();
				if (validate_user_input(StudentRegoEmail)=="Fail")
				{
					do
					{
						clear_console_screen();
						wrong_choice_error_message("Registered Email contains no characters");
						clear_console_screen();
						prompt_for_StudentRegoEmail();
						StudentRegoEmail_input2= new Scanner(System.in);
						StudentRegoEmail= StudentRegoEmail_input2.nextLine();
						StudentRegoEmail_input2.close();
						validate_user_input(StudentRegoEmail);
					}
					while (validate_user_input(StudentRegoEmail)=="Fail");
				}//end if (validate_user_input(StudentRegoEmail)=="Fail")
				
				//retrieve StudentRegoType
				prompt_for_StudentRegoType();
				StudentRegoType_input= new Scanner(System.in);
				StudentRegoType_Choice = StudentRegoType_input.nextInt();
				if (StudentRegoType_Choice==1)
				{
					StudentRegoType="International";
				}//end if (StudentRegoType_Choice==1)
				else if (StudentRegoType_Choice==2)
				{
					StudentRegoType="Domestic";
				} //end else if (StudentRegoType_Choice==2)
				else if ((StudentRegoType_Choice==1)||(StudentRegoType_Choice==2))
				{
					clear_console_screen();
					wrong_choice_error_message("You have not chosen option 1 or 2");
					clear_console_screen();
					prompt_for_StudentRegoType();
				}// else if ((StudentRegoType_Choice==1)||(StudentRegoType_Choice==2))
				
				// generate the user name by appending a six digit random number
				String StudentRegoUsame_random_number=String.valueOf(six_digit_random_number());
				StudentRegoUsame="STU"+StudentRegoUsame_random_number;
				
				// generate a password by appending a six digit random number
				String StudentRegoPword_random_number=String.valueOf(six_digit_random_number());
				StudentRegoPword="ABD"+StudentRegoPword_random_number;
				
				//display registration details of student
				clear_console_screen();
				display_registration_details();
				registration_choice="register";			
				//return registration_choice;
			}// end (Choice==1)
			
			else if (Choice==2) 
			{
				//user has chosen not to registration_
				//need to set registration_choice="not_to_register"
				registration_choice="not_to_register";
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
			
			
			
			
		}// end getStudentDetailsRegistered()	
		
		
		
////////////////////////////////////////////////////////////////////////////////
	
}// end public class Bound010RegisterStudent 
