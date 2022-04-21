package com.tns.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Statement;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://localhost:3306/SampleDB";
		String user="root";
		String password="vinay8197";
		
		try {
			Connection cn=DriverManager.getConnection(dbURL,user,password);
			String st="select * from Employee";
			Statement statement=cn.createStatement();
			ResultSet r=statement.executeQuery(st);
			
			
			while(r.next()) {
				int id=r.getInt(1);
				String name=r.getString(2);
				String pass_word=r.getString(3);
				
				String output="user_id  %d --user_name : %s ---user_password : %s";
				System.out.println(String.format(output,id,name,pass_word));
			}
			cn.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
