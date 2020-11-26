package com.spring.Interfaces;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.spring.bean.StudentDemo;

public class StudentImplDemo implements StudentDao
{
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public Boolean saveStudent(final StudentDemo s) 
	{
		String sql="insert into student values(?,?,?,?)";
		 return jt.execute(sql,new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException 
			{
				ps.setInt(1, s.getRoll());
				ps.setString(2, s.getName());
				ps.setString(3, s.getAddress());
				ps.setLong(4, s.getMobile());
				
				return ps.execute();
			}
		});
		
	}

}
