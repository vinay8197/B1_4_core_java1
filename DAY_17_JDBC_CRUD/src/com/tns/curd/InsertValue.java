package com.tns.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class InsertValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://127.0.0.1:3306/SampleDB";
		String userName="root";
		String password="vinay8197";
		
		try {
			Connection conn=DriverManager.getConnection(dbURL,userName,password);
			if(conn!=null)
		    {
		    	System.out.println("Connected");
		    	
		    	
		    }

			String sql="INSERT INTO Employee(user_id,user_name,password) VALUES(?,?,?)";
			
			PreparedStatement statement=conn.prepareStatement(sql);
		    statement.setInt(1,102);
			statement.setString(2, "varun");
			statement.setString(3, "1000");
			int rowInserted=statement.executeUpdate();
			if(rowInserted>0) {
				System.out.println("A new user was inserted successfully");
			}
			
			conn.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("process completed");
		
		

	}

}
