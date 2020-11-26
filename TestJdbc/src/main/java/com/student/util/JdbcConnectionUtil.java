package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionUtil 
{
	
	private static Connection con=null;
	public static Connection getConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","Asit");
			con.setAutoCommit(false);//to save all the data in database
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}

}
