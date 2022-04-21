package com.tns.curd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CurdDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/SampleDB";
		String username = "root";
		String password = "vinay8197";
		 
		try 
		{
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if(conn!=null)
		    {
		    	System.out.println("Connected");
		    	conn.close();
		    	
		    }
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
