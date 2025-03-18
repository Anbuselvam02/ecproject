<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

    <% 
        // Check if user is logged in
        HttpSession sessionObj = request.getSession(false);
        if (sessionObj == null || sessionObj.getAttribute("user") == null) {
            response.sendRedirect("../login.jsp"); // Redirect to login if not authenticated
            return;
        }
    %>

    <h2>Welcome, <%= sessionObj.getAttribute("user") %>!</h2>
    <p>You have successfully logged in.</p>
    
    <a href="../logout">Logout</a>  

</body>
</html>
