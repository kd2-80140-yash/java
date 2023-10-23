package com.sunbeam;


	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBUtil 
	{
		public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
		public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
		public static final String DB_USER = "kd2_80140_yash";
		public static final String DB_PASSWD = "manager";
		
		public static Connection getConnetion() throws SQLException {
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			return con;
		}
	}

