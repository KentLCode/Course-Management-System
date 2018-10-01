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
     * 20181001: in progress..
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
	// Define the validateWelcChoice(int choice)  method
	/*
	*  getWelcChoice()
	*   This method returns back to the calling method the value 
	*   of the choice made
	*/			
	
	public int getWelcChoice() 
	{
		do 
		{
			System.out.println("                  WELCOME TO THE MCGOWEN                   ");
			System.out.println("                 COURSE MANAGEMENT SYSTEM                  ");
			System.out.println("                                                           ");
			System.out.println("                                                           ");
			System.out.println("                                                           ");
			System.out.println("                                                           ");
			System.out.println("                                                           ");
			System.out.println(" What do you want to do? Choose Option:                    ");
			System.out.println(" 1. Register as a New Student?                             ");
			System.out.println(" 2. Log into our Course Management System?                 ");
			System.out.println("                                                           ");
			System.out.print(" Your Choice: ");
			
			Scanner sc = new Scanner (System.in);
			int choice = sc.nextInt();
			
			if (choice==1)
			{
				//return "true";
			}//end if (choice==1) 
			else if (choice==2) 
			{
				//return "true";
			}// if (choice==2)
			else if ((choice!=1 ) || (choice!=2))
			{
				//return "false";
			} 
			
		} while(close_screen!="Close");
		

		
		//validateWelcChoice(choice);
		WelcChoice=
		return WelcChoice;
		
		
		
	}// close getWelcChoice()
	
	//=========================================================================
	// Define the getWelcChoice() method
	/*
	*  validateWelcChoice(int choice)
	*   This method validates the value entered are either 1, 2 
	*   of the choice made
	*/
	

			
			
	 
	
	
	
	
}// close Bound001AccessManWecome
