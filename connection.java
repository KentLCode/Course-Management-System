import java.sql.DriverManager;
import java.sql.*;//没有这个#2就要报错
public class connection {

	public static void main(String[] args) throws Exception{
		final String URL = "jdbc:mysql://127.0.0.1:3306/CMS?serverTimezone=UTC";  //replace CMS with your own database schema name	
		final String USER= "root";  //mysql workbench account
		final String PASSWORD = "Isys1117_project_cms"; //mysql workbench password
		
		
			
		//1
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//3
		Statement stat = conn.createStatement();
		
		//Enter query
		ResultSet re = stat.executeQuery("select StudentName from Student"); 		
		//Print query
		while(re.next()) {
			System.out.println(re.getString("StudentName"));
		}
	} 

}
  
