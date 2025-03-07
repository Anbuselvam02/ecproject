package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdpcconnection {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		try {
			// Ensure correct database name
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");

			while(rs.next()) {
				// Ensure correct data type retrieval
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4) + "\t"+"\t" + rs.getLong(5));

			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
