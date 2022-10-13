package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDemo {
	
	public static void main(String[] args) throws SQLException {
		
		/*
		 * 
		1. Connect to the database'
		2. Create the queries
		3. Execute the queries
		4. Close the database connection
		 */
		
		// Connect to the database
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","root");
		
		// Create queries/statements
		
		Statement stmt=con.createStatement();
		
		String s = "insert into student values(105,'Rishik')";
		
		// Execute statements
		
		stmt.execute(s);
		
		//Close connection
		
		con.close();
		
		System.out.println("data inserted....");
		
	}

}
