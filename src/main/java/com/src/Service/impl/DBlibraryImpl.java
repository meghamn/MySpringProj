package com.src.Service.impl;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.src.Service.DBlibrary;
import com.src.Service.DbConnection;

public class DBlibraryImpl implements DBlibrary
{
	Statement stmt;
	private DbConnection dbConnection;

	public DBlibraryImpl(DbConnection dbConnection)
	{
		this.dbConnection=dbConnection;
	}
	public void createQuery(String str) throws SQLException {
		dbConnection.registerConnection();
		Connection conn=dbConnection.makeConnection();
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Create Operation Successful!");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

	public void insertQuery(String str, Connection conn) throws SQLException {
		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Insert Operation Successfull!");
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

	public void deleteQuery(String str, Connection conn) throws SQLException {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Delete Operation Successfull!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

	public void dropTable(String str, Connection conn) throws SQLException {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Drop  Operation Successfull!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}

/*
	@Override
	public void createQuery(String str,Connection conn){
		
	}
	@Override
	public void insertQuery(String str,Connection conn) throws SQLException{
		
		
	}
	@Override
	public void deleteQuery(String str,Connection conn) throws SQLException {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Delete Operation Successfull!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}
	@Override
	public void dropTable(String str,Connection conn) throws SQLException {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(str);
			System.out.println("Drop  Operation Successfull!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
	}
*/	
}
