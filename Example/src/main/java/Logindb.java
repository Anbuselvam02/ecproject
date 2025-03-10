import java.sql.*;

public class Logindb {
	
	public boolean insert(User user) throws SQLException {
		Connection con=null;
		boolean result=false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
			String query="Insert into Login (username,password) values(?,?)";
			
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, user.getUsername());
			pst.setString(2,user.getPassword());
			ResultSet rs =pst.executeQuery();
			result=rs.next();
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return result;
			
		}
		return result;
	}

}
