package com.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.student.bean.Student;

public interface StudentDao 
{
	void insert(Student s) throws SQLException;
	void update(Student s) throws SQLException;
	void delete(Student s) throws SQLException;
	List<Student >show() throws SQLException;
	void insertBatch(List<Student> St);
	void insertProcedure(Student s)throws SQLException;

}
