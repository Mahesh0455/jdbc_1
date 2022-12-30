package com.jdbc;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class DbConnection {
	
	public static void main(String[] args) throws Exception {
		
		DbConnection db=new DbConnection();
		
	FileInputStream fis=new FileInputStream(new File("db.properties"));
		
	Properties props=new Properties();
	props.load(fis);
	
	
	String username=props.getProperty("username");
	String hostname=props.getProperty("hostname");
	String port="5432";
	String password=props.getProperty("password");
	
	db.connectDb(hostname, username, password);
	
	

		
	}
	
	public void connectDb(String hostname,String username,String password) {
		
		Connection conn=null;
		
		try {
			conn=DriverManager.getConnection(hostname, username, password);
			System.out.println("Connected to dvd_rental database");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
