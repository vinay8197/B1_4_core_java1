package com.tns.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://localhost:3306/SampleDB";
		String user="root";
		String password="vinay8197";
		
		
		try {
			Connection cn=DriverManager.getConnection(dbURL,user,password);
			
			String sql="delete from Employee where user_name=?";
			PreparedStatement statement=cn.prepareStatement(sql);
			statement.setString(1, "vijay");
			
			
			int rowDeleted=statement.executeUpdate();
			
			if(rowDeleted>0) {
				System.out.println("A user was deleted successfuly");
			}
			cn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
