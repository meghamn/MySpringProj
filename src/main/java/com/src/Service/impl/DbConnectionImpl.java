package com.src.Service.impl;
import java.sql.*;

import com.src.Service.DbConnection;

public class DbConnectionImpl implements DbConnection{
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://trainingdb.c4hhsbxtkfor.ap-south-1.rds.amazonaws.com:3306/trainingTable";
		static final String USER = "root";
		static final String PASS = "mypassword";
		Connection conn;
		Statement stmt;
		
		
		public DbConnectionImpl() {
			    conn = null;
			    stmt = null;
		} 
	   
		public void registerConnection(){
		   try{
			   Class.forName(JDBC_DRIVER);
		   }catch(Exception e){
			  System.out.println(e.getMessage());
		   }
	   }
	   public Connection makeConnection(){
		   
		   try{
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      
				}catch(Exception e){
					System.out.println(e.getMessage());
				   }
		   return conn;
	   }
	
	   
	   
}
