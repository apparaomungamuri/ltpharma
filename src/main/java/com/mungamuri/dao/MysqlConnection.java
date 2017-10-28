package com.mungamuri.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

	public static Connection getConnection() {

		Connection con = null;
		
		try {
			System.out.println("getconection()");
			String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
			   String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
			   System.out.println("host"+host);
			   System.out.println("port"+port);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("after getconection()");
			con = DriverManager.getConnection(
					"jdbc:mysql://"+host+":"+port+"/mungamuri", "adminjR4FB9L", "6w7FaKNlPSC-");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		MysqlConnection.getConnection();
		System.out.println("i am in Main()");
		System.out.println(" MysqlConnection ");
		System.out.println(MysqlConnection.getConnection());
	}
}
