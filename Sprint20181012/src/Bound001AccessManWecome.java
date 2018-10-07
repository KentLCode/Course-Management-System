import java.util.Scanner;
public class Bound001AccessManWecome 
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
	/*--------------------------------------------------------------------------
	 * 
	 * CHANGE HISTORY:
     * 20181001: First version created by Mike Little
	 * 
	 * 
	 */
////////////////////////////////////////////////////////////////////////////////	

	
	///////////////////////////////////////////////////////////////////////////
	//Define Class Attributes[Variables] Here
	
	// Here are the class variables for the:
	// 1. This stores the user choice from the Boundary Class.
	// 2. This coresponds to SUC00.1-Access CMS
	// 3. 
	 private int WelcChoice;
	 // This is a local class variable that stores the choice made
	 //private String close_screen;
	 // this is used to close the current screen.

	 ///////////////////////////////////////////////////////////////////////////
	 //Define Class Methods from here
	//=========================================================================
		// Define the constructor method
		/*
		*  Bound001AccessManWecome() 
		*/		 
		public Bound001AccessManWecome()  
		{
			// This is the constructor for Bound001AccessManWecome()
			// Allows access to the class methods.

		}// close Bound001AccessManWecome() 

		//=========================================================================
		// Define the WelcChoice() method
		/*
		*  WelcChoice()
		*   This method access the WelcChoice value.
		*  ...
		*/
		public int WelcChoice() 
		{
			// insert code from here...
			return WelcChoice;
		}// end WelcChoice()	
		
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
			System.out.println(" 1. Register as a New Student?                             ");
			System.out.println(" 2. Log into our Course Management System?                 ");
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
		private void wrong_choice_error_message() throws InterruptedException 
		{
			
				System.out.println("                                                           ");
				System.out.println(" You have not correctly choosen option 1 or 2              ");
				System.out.println("                                                           ");
				System.out.println("                                                           ");
				Thread.sleep(1000);
			
		}// end wrong_choice_error_message()		
		
		
		//=========================================================================
		// Define the getWelcChoice() method
		/*
		*  getWelcChoice()
		*   This method gets the welcome choice
		*   of the choice made
		*/		
	
	public void getWelcChoice() throws InterruptedException
	{
		display_screen_intro();
		display_screen_selection();
		Scanner input1 = new Scanner (System.in);
		int choice = input1.nextInt();
							
			if (choice==1)
			{
				WelcChoice=1;
				//System.out.println("WelcChoice is:"+WelcChoice);
				// User has chosen to register as a student
				//close_screen="Close";
			}//end if (choice==1) 
			
			else if (choice==2) 
			{
				WelcChoice=2;
				//System.out.println("WelcChoice is:"+WelcChoice);
				// User has chosen to Login
				//close_screen="Close";
			}// if (choice==2)
			else if ((choice!=1 ) || (choice!=2))
				
			{
				//wrong_value_enter();
				clear_console_screen();
				wrong_choice_error_message();
				clear_console_screen();
				display_screen_intro();
				display_screen_selection();
				Scanner input2 = new Scanner (System.in);
				choice = input2.nextInt();
				
				//close_screen="no";
			} 
			
		//System.out.println("WelcChoice to be returned is:"+WelcChoice);	
		
		
	}// close getWelcChoice()
	
}// close Bound001AccessManWecome
