package com.spring.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.spring.interfaceDemo.InsertDemo;

public class BeanClass implements InsertDemo
{
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void insert(int roll, String name, String address, int mobile)
	{
		try {
			Connection con=ds.getConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into newdb values(?,?,?,?)");
			pstmt.setInt(1, roll);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setInt(4, mobile);
			pstmt.executeUpdate();
			System.out.println("value inserted");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		
	}

}
