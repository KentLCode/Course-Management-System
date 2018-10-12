
public class Test_020AdminCMS {
// this is a test class to test the behaviour of the administration control and boundary classes.
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Control020AdminCMS AdminCMSControl=new Control020AdminCMS();
		AdminCMSControl.CMSApplicationAdministrationManagementControl();
		String access_result= AdminCMSControl.getLogout_choice();
		System.out.println ("In the main method, logout_choice:"+ access_result );

	}

}
