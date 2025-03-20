<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP with JDBC</title>
</head>
<body>
    <h2>User List</h2>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Email</th></tr>
        <%
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root"; // Change as per your MySQL credentials
            String pass = "Enoch123$";
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM users");

                while (rs.next()) {
                    out.println("<tr><td>" + rs.getInt("id") + "</td><td>" 
                        + rs.getString("name") + "</td><td>" 
                        + rs.getString("email") + "</td></tr>");
                }

                con.close();
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>
</body>
</html>
