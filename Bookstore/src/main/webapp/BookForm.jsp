<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>Books Store Application</title>
</head>
<body>
    <center>
        <h1>Books Management</h1>
        <h2>
            <a href="/new">Add New Book</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/list">List All Books</a>
        </h2>
    </center>

    <div align="center">
        <form action="${book != null ? 'update' : 'insert'}" method="post">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>${book != null ? 'Edit Book' : 'Add New Book'}</h2>
                </caption>

                <c:if test="${book != null}">
                    <input type="hidden" name="id" value="${book.id}" />
                </c:if>

                <tr>
                    <th>Title:</th>
                    <td>
                        <input type="text" name="title" size="45" value="${not empty book.title ? fn:escapeXml(book.title) : ''}" />
                    </td>
                </tr>
                <tr>
                    <th>Author:</th>
                    <td>
                        <input type="text" name="author" size="45" value="${not empty book.author ? fn:escapeXml(book.author) : ''}" />
                    </td>
                </tr>
                <tr>
                    <th>Price:</th>
                    <td>
                        <input type="text" name="price" size="5" value="${not empty book.price ? book.price : ''}" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
