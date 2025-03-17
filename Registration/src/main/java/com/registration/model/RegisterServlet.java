package com.registration.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database credentials
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/registration_db?useSSL=false";
    private static final String JDBC_USER = "root";  // Change to your MySQL username
    private static final String JDBC_PASSWORD = "Enoch123$"; // Change to your MySQL password
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        // Database connection and insertion
        try {
            Class.forName(JDBC_DRIVER);
            try (Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
                 PreparedStatement ps = con.prepareStatement("INSERT INTO users (name, password, email, phone) VALUES (?, ?, ?, ?)")) {

                ps.setString(1, uname);
                ps.setString(2, password);
                ps.setString(3, email);
                ps.setString(4, phone);
                ps.executeUpdate();

                // Pass data to display.jsp
                request.setAttribute("uname", uname);
                request.setAttribute("email", email);
                request.setAttribute("phone", phone);
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("display-registration.jsp");
                dispatcher.forward(request, response);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
