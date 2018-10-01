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
	 private String close_screen;
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
		// Define the getWelcChoice() method
		/*
		*  getWelcChoice()
		*   This method gets the welcome choice
		*   of the choice made
		*/		
	
	public int getWelcChoice() 
	{
		display_screen_intro();
		display_screen_selection();
		Scanner input1 = new Scanner (System.in);
		int choice = input1.nextInt();
		do 
		{						
			if (choice==1)
			{
				WelcChoice=1;
				// User has chosen to register as a student
				close_screen="Close";
			}//end if (choice==1) 
			
			else if (choice==2) 
			{
				WelcChoice=2;
				// User has chosen to Login
				close_screen="Close";
				
			}// if (choice==2)
			else if ((choice!=1 ) || (choice!=2))
			{
				System.out.println(" Wrong value entered, please choose 1 or 2 !                ");
				//this is a kuldge as there is no way to refresh/clear the eclipse console
				//and so I shall insert 200 new lines to clear the eclipse console
				for (int lines=0; lines<200; lines++)
				{
					System.out.println("                                                           ");
				}
				
				display_screen_selection();
				Scanner input2 = new Scanner (System.in);
				choice = input2.nextInt();
				close_screen="no";
			} 
			
		} while(close_screen!="Close");

		return WelcChoice;
		
	}// close getWelcChoice()
	
}// close Bound001AccessManWecome
