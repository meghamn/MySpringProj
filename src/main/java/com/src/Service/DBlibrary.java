package com.src.Service;
import java.sql.Connection;
import java.sql.SQLException;

public interface DBlibrary {
	
	
	public void createQuery(String str) throws SQLException;
	public void insertQuery(String str,Connection conn)throws SQLException;
	public void deleteQuery(String str,Connection conn)throws SQLException;
	public void dropTable(String str,Connection conn) throws SQLException;
	

}
