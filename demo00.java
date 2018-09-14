import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class demo00 {

	public static void main(String[] args) throws Exception {
		final String URL = "jdbc:mysql://127.0.0.1:3306/course_management_system?serverTimezone=UTC";
		final String USER = "root"; // mysql workbench account
		final String PASSWORD = "Isys1117_project_cms"; // mysql workbench password

		// 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		Statement stat = conn.createStatement();
		ResultSet re;
		System.out.println("******Course Management Sysytem Prototype 00******");
		System.out.println("Enter your user name:");
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		System.out.println("Enter your password:");
		String password = sc.next();
		
		// Log in identity
		stat = conn.createStatement();
		if (userName.startsWith("S")) {
			re = stat.executeQuery("select * from StuPassword");
			
			while (re.next()) {
				if(userName.equals(re.getString("UserName"))& (password.equals(re.getString("Password")))){
					System.out.println("Student Login");
				}
			}
			
			
			
		}else if (userName.startsWith("L")) {
			re = stat.executeQuery("select * from LecPassword");
			
			while (re.next()) {
				if(userName.equals(re.getString("UserName"))& (password.equals(re.getString("password")))){
					System.out.println("Lecture logged in");
				}
			}
			
			
		} else {
			System.out.println("Wrong User name or Password");
			System.exit(0);
		}
		

		while (true) {
			System.out.println("Course Management Sysytem Prototype 00******");
			System.out.println("Enter 1 to show  student information:");
			System.out.println("Enter 2 to show  lecturer information:");
			System.out.println("Enter 3 to show  course information:");
			System.out.println("Enter 4 to add a new course:");
			System.out.println("Enter 5 to look for student grade:");
			System.out.println("Enter 6 to leave system:");

			System.out.println();
			System.out.println("Enter your choice:");

			int choice = sc.nextInt();
			

			switch (choice) {
			case 1:

				re = stat.executeQuery("select * from Student");

				while (re.next()) {
					System.out.println("User Name: " + re.getString("UserName") + "," + "Student Name: "
							+ re.getString("FirstName") + " " + re.getString("LastName"));
				}
				break;

			case 2:
				stat = conn.createStatement();
				re = stat.executeQuery("select * from Lecturer");

				while (re.next()) {
					System.out.println("User Name: " + re.getString("UserName") + "," + "Lecturer Name: "
							+ re.getString("FirstName") + " " + re.getString("LastName"));

				}
				break;
			case 3:
				stat = conn.createStatement();
				re = stat.executeQuery("select * from course");

				while (re.next()) {
					System.out.println("Course Code: " + re.getString("CourseCode") + "," + "Course Title: : "
							+ re.getString("CourseTitle") + " ," + "Prerequisite Courses: "
							+ re.getString("prerequisite"));

				}
				break;
			case 4:
				String sql = "insert into course " + " (CourseCode,CourseID,courseTitle,prerequisite)"
						+ " values (?,?,?,?)";
				PreparedStatement myStmt = conn.prepareStatement(sql);
				System.out.println("Enter course Code:");
				String courseCode = sc.next();
				System.out.println("Enter CourseID:");
				int courseID = sc.nextInt();
				System.out.println("Enter course title:");
				String courseTitle = sc.next();
				System.out.println("Enter Prerequisite Courses:");
				String prerequisite = sc.next();

				myStmt.setString(1, courseCode);
				myStmt.setInt(2, courseID);
				myStmt.setString(3, courseTitle);
				myStmt.setString(4, prerequisite);
				myStmt.executeUpdate();
				System.out.println("New course has been added ");

			case 5:
				stat = conn.createStatement();
				System.out.println("Enter student ID:");
				String studentID = sc.next();
				re = stat.executeQuery("select StudentID,enrolled_result.CourseID, courseTitle, ResultScore\n" + 
						"from enrolled_result, course\n" + 
						"where enrolled_result.CourseID=course.CourseID;");

				while (re.next()) {
					if (re.getString("StudentID").equalsIgnoreCase(studentID))
						System.out.println("Your course results are:");

						System.out.println(re.getString("courseTitle")
								+ "," + "Result: " + re.getString("ResultScore"));
				}
				break;

			case 6:
				System.out.println("System exit");
				System.exit(0);

			}
		}

	}

}
