package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RequestParmExamples extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Request Parameters</title></head><body>");
        out.println("<h3>Request Parameters Example</h3>");
        
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");

        if (firstName != null && lastName != null) {
            out.println("<p>First Name: " + escapeHtml(firstName) + "</p>");
            out.println("<p>Last Name: " + escapeHtml(lastName) + "</p>");
        } else {
            out.println("<p>No Parameters, Please enter some</p>");
        }

        out.println("<form action=\"RequestParmExamples\" method=\"POST\">");
        out.println("First Name: <input type='text' name='firstname'><br>");
        out.println("Last Name: <input type='text' name='lastname'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        doGet(request, response);
    }

    private String escapeHtml(String input) {
        return input.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
}
