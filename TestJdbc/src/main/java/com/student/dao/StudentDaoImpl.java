package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.CallableStatement;
import com.student.bean.Student;
import com.student.util.JdbcConnectionUtil;

public class StudentDaoImpl implements StudentDao
{

	public void insert(Student s) throws SQLException 
	{
		int roll=s.getRoll();
		System.out.println(roll);
		String name=s.getName();
		String address=s.getAddress();
		Long mobile=s.getMobile();
		String sql="insert into student values(?,?,?,?)";
		
		Connection con=JdbcConnectionUtil.getConnection();
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, roll);
		pstmt.setString(2, name);
		pstmt.setString(3, address);
		pstmt.setLong(4, mobile);
		pstmt.executeUpdate();
		System.out.println("executed successfully   ");
		con.commit();
		pstmt.close();
		con.close();
	}

	public void update(Student s) throws SQLException
	{
		String name=s.getName();
		int roll=s.getRoll();
		String sql1="update student set name='"+name+"' where roll="+roll ;
        Connection con=JdbcConnectionUtil.getConnection();
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate(sql1);
		
		stmt.close();
		con.close();
		
	}

	public void delete(Student s) throws SQLException 
	{
		
		String name=s.getName();
		String sql2="delete from student where name='"+name+"'";
		
		 Connection con=JdbcConnectionUtil.getConnection();
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql2);
			
			stmt.close();
			con.close();
	}

	public List<Student> show() throws SQLException 
	{
		
		String sql3="select * from student";
		
		 Connection con=JdbcConnectionUtil.getConnection();
		PreparedStatement pstmt=con.prepareStatement(sql3);
		
	
		ResultSet rs=pstmt.executeQuery();
		List<Student> ls=new ArrayList<Student>();
		while(rs.next())
		{
			Student st=new Student();
			int rollno=rs.getInt("roll");
			String Sname=rs.getString(2);
			String addresss=rs.getString(3);
			Long mob=rs.getLong(4);
			st.setRoll(rollno);
			st.setName(Sname);
			st.setAddress(addresss);
			st.setMobile(mob);
			System.out.println(rollno +" "+Sname+" "+addresss+" "+mob);
			ls.add(st);
			
		}
		
		pstmt.close();
		con.close();
		return ls;
	}

	public void insertBatch(List<Student> St)
	{
		
		Connection con=JdbcConnectionUtil.getConnection();
		PreparedStatement pstmt=null;
		String sql4="insert into student values (?,?,?,?)";
		int j=0;
	  try {  pstmt=con.prepareStatement(sql4);
		for(Student s : St)
		{
			/*if(j==3)
			{
				sql4="insert in student values (?,?,?,?)";
				 pstmt=con.prepareStatement(sql4);
			}*/
			pstmt.setInt(1, s.getRoll());
			pstmt.setString(2, s.getName());
			pstmt.setString(3, s.getAddress());
			pstmt.setLong(4, s.getMobile());
			pstmt.addBatch();
			j++;
		}
		pstmt.executeBatch();
		con.commit();
	  }
	  catch(SQLException e)
	  {
		  try {
			con.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  } 
			
		
	}

	public void insertProcedure(Student s) throws SQLException 
	{
		Connection con=JdbcConnectionUtil.getConnection();
		java.sql.CallableStatement cstmt=null;
		String name=s.getName();
		String sql5="{call myprocedure()}";
		
		cstmt=con.prepareCall(sql5);
		ResultSet rs=cstmt.executeQuery();
		while(rs.next())
		{
			int roll=rs.getInt("roll");
			String Name=rs.getString("name");
			String address=rs.getString("address");
			Long mobile=rs.getLong("mobile");
			
			System.out.println(roll+" "+Name+" "+address+" "+mobile);
		}
		
	}
	

}
