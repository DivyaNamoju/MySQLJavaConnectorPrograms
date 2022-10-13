package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","root");
		
		// Create queries/statements
		
		Statement stmt=con.createStatement();
		
		String s = "select * from student";
		
		// Execute statements
		
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
		{
			int snum=rs.getInt("sno");
			String name=rs.getString("sname");
			System.out.println("Student Number : " + snum + " -- Student name : " + name);
		}
		
		//Close connection
		
		con.close();
		
		System.out.println("Extracted the table student");
		
	}

}
