import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class course_management_system {

	public static void main(String[] args) throws Exception{
		
		while (true) {
			final String URL = "jdbc:mysql://127.0.0.1:3306/course_management_system?serverTimezone=UTC";  //replace CMS with your own database schema name	
			final String USER= "root";  //mysql workbench account
			final String PASSWORD = "Isys1117_project_cms"; //mysql workbench password


				
			//1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

			System.out.println("******Course Management Sysytem prython 00******");
			System.out.println("Enter 1 to show  student information:");
			System.out.println("Enter 2 to show  lecturer information:");
			System.out.println("Enter 3 to show  course information:");
			System.out.println("Enter 4 to add a course:");
			System.out.println("Enter 5 to look for student grade:");
			System.out.println("Enter 6 to leave system:");
			
			System.out.println();
			System.out.println("Enter your choice:");

			Scanner sc = new Scanner (System.in);
			int choice = sc.nextInt();


			switch(choice) {
			case 1:
				Statement stat = conn.createStatement();
				ResultSet re = stat.executeQuery("select * from Student");
				
				// print output
				while(re.next()) {
					System.out.println("User Name: " + re.getString("UserName")+"," + "Student Name: " + re.getString("FirstName")+ " " + re.getString("LastName"));	
				}
				break;
				
			case 2:
				Statement stat2 = conn.createStatement();
				ResultSet re2 = stat2.executeQuery("select * from Lecturer");
				
				// print output
				while(re2.next()) {
					System.out.println("User Name: " + re2.getString("UserName")+"," + "Lecturer Name: " +re2.getString("FirstName")+ " " + re2.getString("LastName"));	
					
				}
				break;
			case 3:
				Statement stat3 = conn.createStatement();
				ResultSet re3 = stat3.executeQuery("select * from course");
				
				// print output
				while(re3.next()) {
					System.out.println("Course Code: " + re3.getString("CourseCode")+"," +"Course Title: : "+ re3.getString("CourseTitle")+ " ," + "Prerequisite Courses: "+ re3.getString("prerequisite"));	
					
				}
				break;
			case 4:
				String sql = "insert into course "
						+ " (CourseCode,CourseID,courseTitle,prerequisite)" + " values (?, ?,?,?)";
				PreparedStatement myStmt = conn.prepareStatement(sql);			
				System.out.println("Enter course Code:");
				String courseCode= sc.next();
				System.out.println("Enter CourseID:");
				int courseID= sc.nextInt();
				System.out.println("Enter course title:");
				String courseTitle= sc.next();
				System.out.println("Enter Prerequisite Courses:");
				String prerequisite= sc.next();
				

				myStmt.setString(1, courseCode);
				myStmt.setInt(2,courseID );
				myStmt.setString(3, courseTitle);
				myStmt.setString(4, prerequisite);
				
				

				// 3. Execute SQL query
				myStmt.executeUpdate();
				System.out.println("Course added successfully");
				
			case 5:
				Statement stat5 = conn.createStatement();
				System.out.println("Enter student ID:");
				String studentID= sc.next();
				
				
				ResultSet re5 = stat5.executeQuery("select * from student, course,enrolled_result ");
				
				// print output
				while(re5.next()) {
					if(re5.getString("StudentID").equalsIgnoreCase(studentID))
							
					
							System.out.println(re5.getString("FirstName")+"Course title: " + re5.getString("courseTitle")+"," + "Result: " + re5.getString("ResultScore"));
					}
						break;
				
				
				
			case 6:
				System.exit(0);
				
				
				
				
				
				

				
				
				
			}}

			
		}
		
		
		
	}
