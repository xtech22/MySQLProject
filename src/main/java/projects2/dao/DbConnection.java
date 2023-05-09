package projects2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects2.exception.DbException;


public class DbConnection {
	private static final String SCHEMA = "projects2";
	private static final String USER = "projects2";
	private static final String PASSWORD = "projects2";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;

	public static Connection getConnection() {					/*created a format string to take in order */
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);
		System.out.println("Connecting with url=" + url);
		
		try { /*Asked driver manager to look up the driver for us and asked the driver to make a connection for us */
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Successfully obtained connection!");
			return conn;
		} catch (SQLException e) {
			System.out.println("Error getting a connection.");
		throw new DbException(e);
		}
	}
}
