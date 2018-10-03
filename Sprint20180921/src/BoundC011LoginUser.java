import java.util.Scanner;
public class BoundC011LoginUser 
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
	
	////////////////////////////////////////////////////////////////////////////////

	//Define Class Attributes[Variables] Here

	// Here are the class variables for the:
	// 1. This ...
	// 2. This corresponds to SUC....
	// 3. This ...
	// 4. This ...
	 private int Choice;
	 // This is a local class variable that stores the choice made
	private String userName;
	// this stores the userName entered by the user
	private String userPassword;
	// this stores the user Password entered by the user.
	
	private String login_choice;
	// this stores the results of the login process
	// if successfully gets all the details for userName
	// userPassword,and passes the validation [not null!]
	// then login_choice="login"
	// if the user decides not to login 
	// then login_choice="not_to_login"
	
	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  BoundC011LoginUser()
		*/		 
		public BoundC011LoginUser()  
		{
			// This is the constructor for BoundC011LoginUser()
			// Allows access to the class methods.

		}// close BoundC011LoginUser() 	
		
		//=========================================================================
		// Define the login_choice() method
		/*
		*  login_choice()
		*   This method access the 
		*  ...
		*/
		public String login_choice() 
		{
			// insert code from here...
			return login_choice;
		}// end raccess_response()	
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
		
		private void display_screen_selection() 
		{
			System.out.println("                                                           ");
			System.out.println(" What do you want to do? Choose Option:                    ");
			System.out.println(" 1. Log into our Course Management System?                 ");
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
		// Define the prompt_for_username() method
		/*
		*   This prompts for the username
		*/	
		private void prompt_for_username() 
		{
			System.out.println("                                                           ");
			System.out.print(" What is your username: ");

		}// end prompt_for_username()	

		//=========================================================================
		// Define the prompt_for_username() method
		/*
		*   This prompts for the username
		*/	
		private void prompt_for_password() 
		{
			System.out.println("                                                           ");
			System.out.print(" What is your password: ");

		}// end prompt_for_username()	
		
		//=========================================================================
		// Define the validate_user_input() method
		/*
		*   This validates the length of the user input
		*/	
		private String validate_user_input(String input) 
		{
			String result;
			int input_length=input.length();
			if (input_length!=9)
			{
				result="Fail";
				return result;
			}
			
			result="Pass";
			return result;

		}// end validate_user_input()	
		
		
		//=========================================================================
		// Define the getUserDetailsLogin()  method
		/*
		*  getUserDetailsLogin() 
		*   This method presents the user login details screen
		*   It first presents the choice to login or return back to the welcome screen
		*   of the choice made
		*/		

		public void getUserDetailsLogin()throws InterruptedException
		{
			// this method presents a form to get the user details for
			// username and password
			login_choice="";
			clear_console_screen();
			display_screen_intro();
			display_screen_selection();
			//System.out.println("This is the BoundC011LoginUser() class");
			Scanner input1 = new Scanner (System.in);
			int choice = input1.nextInt();
								
				if (choice==1)
				{
					//get login details.
					//retrieve the userName details
					clear_console_screen();
					prompt_for_username();
					Scanner userName_input= new Scanner(System.in);
					userName= userName_input.nextLine();
					//test the length of the user name is correct. 
					if (validate_user_input(userName)=="Fail")
					{
						do
						{
							clear_console_screen();
							wrong_choice_error_message("User name is not nine characters in length");
							clear_console_screen();
							prompt_for_username();
							Scanner userName_input2= new Scanner(System.in);
							userName= userName_input.nextLine();
							//test the length of the user name is correct. 
							validate_user_input(userName);
						}
						while (validate_user_input(userName)=="Fail");
						// while is fails validation go around the loop
					}//close the if statement

					
					//get login details.
					//retrieve the userPassword details
					clear_console_screen();
					prompt_for_password() ;
					Scanner userPassword_input= new Scanner(System.in);
					userPassword=userPassword_input.nextLine();
					//test the length of the password is correct. 
					if (validate_user_input(userPassword)=="Fail")
					{
						do
						{
							clear_console_screen();
							wrong_choice_error_message("Password is not nine characters in length");
							clear_console_screen();
							prompt_for_password() ;
							Scanner userPassword_input2= new Scanner(System.in);
							userPassword=userPassword_input.nextLine();
							//test the length of the password is correct. 
							validate_user_input(userPassword);
						}
						while (validate_user_input(userPassword)=="Fail");
						// while is fails validation go around the loop
					}//close the if statement
					
					
					
					login_choice="login";
				}//end if (choice==1) 
				
				else if (choice==2) 
				{
					//user has chosen not to login
					//need to set login_choice="not_to_login"
					login_choice="not_to_login";
					
				}// if (choice==2)
				else if ((choice!=1 ) || (choice!=2))
					
				{
					//wrong_value_enter();
					clear_console_screen();
					wrong_choice_error_message("You have not chosen option 1 or 2");
					display_screen_selection();
					Scanner input2 = new Scanner (System.in);
					choice = input2.nextInt();
					
					//close_screen="no";
				} 

			//login_choice="login";
			// this stores the results of the login process
			// if successfully gets all the details for userName
			// userPassword,and passes the validation [not null!]
			// then login_choice="login"
			// if the user decides not to login 
			// then login_choice="not_to_login"
			
			
			
		}// end getUserDetailsLogin() 
		
		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String getuserName() 
		{
			// insert code from here...
			return userName;
		}// end getuserName()

		//=========================================================================
		// Define the ...() method
		/*
		*  ..()
		*   This method ... 
		*  ...
		*/
		public String getuserPassword() 
		{
			// insert code from here...
			return userPassword;
		}// end getuserPassword()
		
		
		
////////////////////////////////////////////////////////////////////////////////
}// BoundC011LoginUser class 
