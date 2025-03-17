<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>Books Store Application</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            color: blue;
        }
        a:hover {
            color: red;
        }
        form {
            display: inline;
        }
    </style>
    <script>
        function confirmDelete(bookId) {
            if (confirm("Are you sure you want to delete this book?")) {
                document.getElementById("deleteForm-" + bookId).submit();
            }
        }
    </script>
</head>
<body>
    <center>
        <h1>Books Management</h1>
        <h2>
            <li><a href="<%=request.getContextPath()%>/new" class="nav link">Add New Book</a></li>
        </h2>
    </center>
    <li><a href="<%=request.getContextPath()%>/list" class="nav link">List All Books</a></li>

    <div align="center">
        <table>
            <caption><h2>List of Books</h2></caption>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Actions</th>
            </tr>

            <c:forEach var="book" items="${listBook}">
                <tr>
                    <td><c:out value="${book.id}" /></td>
                    <td><c:out value="${book.title}" /></td>
                    <td><c:out value="${book.author}" /></td>
                    <td><c:out value="${book.price}" /></td>
                    <td>
                        <a href="<%=request.getContextPath()%>/edit?id=<c:out value='${book.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;
                        <form id="deleteForm-<c:out value='${book.id}' />" action="<%=request.getContextPath()%>/delete" method="post">
                            <input type="hidden" name="id" value="<c:out value='${book.id}' />">
                            <button type="button" onclick="confirmDelete('<c:out value="${book.id}" />')">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>
</body>
</html>
