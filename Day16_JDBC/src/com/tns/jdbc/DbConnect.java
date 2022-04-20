package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Capgemini1";
		String dbUserName="root";
		String dbPassword="vinay8197";
		String query="select *from student";
		try 
		{
			 Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			 e.printStackTrace();
		}
  
		try
		 {
			 Connection con=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(query);
			 
			 while(rs.next())
			 {
				 String EmployeesData="";
				 for(int i=1;i<=2;i++)// i belongs to column of SQL table  here
				 {
					 EmployeesData=EmployeesData+" "+rs.getString(i);
					 
				 }
				 System.out.println(EmployeesData);
			 }
			 
		 }
		 catch(SQLException e)
		 {
			 System.out.println("An error occurred. Maybe user/password is invalid");
			 e.printStackTrace();
			 
		 }
		
	
	}
}
