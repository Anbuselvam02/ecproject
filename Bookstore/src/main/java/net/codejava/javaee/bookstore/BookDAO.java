package net.codejava.javaee.bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private static final String jdbcURL = "jdbc:mysql://127.0.0.1:3306/bookstore?useSSL=false";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "Enoch123$";

    private static final String INSERT_BOOK_SQL = "INSERT INTO book (book_id, title, author, price) VALUES (?, ?, ?, ?);";
    private static final String SELECT_BOOK_BY_ID = "SELECT book_id, title, author, price FROM book WHERE book_id = ?";
    private static final String SELECT_ALL_BOOKS = "SELECT * FROM book";
    private static final String DELETE_BOOK_SQL = "DELETE FROM book WHERE book_id = ?;";
    private static final String UPDATE_BOOK_SQL = "UPDATE book SET title = ?, author = ?, price = ? WHERE book_id = ?;";

    public BookDAO() {}

    protected static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public List<Book> selectAllBooks() {
        List<Book> books = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOKS)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int book_id = rs.getInt("book_id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                int price = rs.getInt("price");
                books.add(new Book(book_id, title, author, price));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return books;
    }

    public Book selectBook(int book_id) {
        Book book = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BOOK_BY_ID)) {
            preparedStatement.setInt(1, book_id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                String title = rs.getString("title");
                String author = rs.getString("author");
                int price = rs.getInt("price");
                book = new Book(book_id, title, author, price);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return book;
    }

    public void deleteBook(int book_id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
        		 PreparedStatement statement = connection.prepareStatement(DELETE_BOOK_SQL)) {
            statement.setInt(1, book_id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }     


    public boolean updateBook(Book book) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_BOOK_SQL)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setInt(3, book.getPrice());
            statement.setInt(4, book.getId());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    public static void insertBook(Book newBook) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BOOK_SQL)) {
            preparedStatement.setInt(1, newBook.getId());
            preparedStatement.setString(2, newBook.getTitle());
            preparedStatement.setString(3, newBook.getAuthor());
            preparedStatement.setInt(4, newBook.getPrice());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    

    private static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
            }
        }
    }
}

