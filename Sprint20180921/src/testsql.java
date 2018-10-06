import java.sql.ResultSet;
public class testsql {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		EntityMySQLInteraction dbConnect= new EntityMySQLInteraction();
		//create the query
		//query="select password from student where username="+"'"+usName+"'";
		//String query="select * from student";
		//String SearchUserName=" \'STU123456\' ";
		String query="select Password from Student where UserName="+ " \'STU123456\' ";
		
		//call the database connection and pass the query
		dbConnect.setQuery(query);
		//return the result 
		ResultSet  results=dbConnect.getResults();

		
		
		while(results.next())
		{
			String dbPassword=results.getString(1);
			//String LastName=results.getString(2);
			System.out.println("dbPassword: "+dbPassword);
			//System.out.println("LastName: "+LastName);			
		 }//close while statement
		
	}

}
