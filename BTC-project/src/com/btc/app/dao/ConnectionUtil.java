package com.btc.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getDbConnection() throws SQLException {
		
		String dbUrl="jdbc:mysql://localhost:3306/btc";
		String username="root";
		String password="password";
		
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		
		return con;
		
	}
	
}