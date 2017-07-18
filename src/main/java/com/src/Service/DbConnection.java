package com.src.Service;
import java.sql.Connection;

public interface DbConnection {

	public void registerConnection();
	public Connection makeConnection();
	
}
