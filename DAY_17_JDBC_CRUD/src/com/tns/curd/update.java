package com.tns.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bdURL="jdbc:mysql://localhost:3306/SampleDB";
		String user="root";
		String password="vinay8197";
		
		try {
			Connection cn=DriverManager.getConnection(bdURL,user,password);
			String sql="update employee set user_name=?  where user_id=?";
			
			PreparedStatement statement=cn.prepareStatement(sql);
			statement.setString(1,"abhi" );
			statement.setInt(2,102 );
			
			int rowUpdate=statement.executeUpdate();
			if(rowUpdate>0) {
				System.out.println("An existing user was updated");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
