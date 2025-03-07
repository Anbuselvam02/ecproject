package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdpcconnection {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		try {
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO student (stu_name, age, address,mobile_num) VALUES (?, ?, ?,?)");
//			pstmt.setString(1, "Alice");
//			pstmt.setInt(2, 23);
//			pstmt.setString(3, "Boston");
//			pstmt.setLong(4, 994188451);
//			pstmt.addBatch();
//
//			pstmt.setString(1, "Bob");
//			pstmt.setInt(2, 24);
//			pstmt.setString(3, "Chicago");
//			pstmt.setLong(4, 994184951);
//			
//			pstmt.addBatch();
//
//			pstmt.executeBatch();  // Faster insertion

			

			

			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4) + "\t"+"\t" + rs.getLong(5));

			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
