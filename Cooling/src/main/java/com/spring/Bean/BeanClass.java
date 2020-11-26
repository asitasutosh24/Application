package com.spring.Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.spring.Interface.Operation;

public class BeanClass implements Operation
{
	private int roll;
	private String name;
	private String address;
	private int mobile;
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public void insert(int roll,String name,String address,int mobile) 
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

	public void update(int roll) 
	{
		Connection con;
		try {
			con = ds.getConnection();
			PreparedStatement pstmt=con.prepareStatement("update newdb set name='bc' where roll=?");
			pstmt.setInt(1, roll);
			pstmt.executeUpdate();
			System.out.println("record updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void delete(int roll) 
	
	{
		try
		{
			Connection con=ds.getConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from newdb where roll=?");
			pstmt.setInt(1, roll);
			pstmt.executeUpdate();
			System.out.println("records deleted");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
