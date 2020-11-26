package com.student.service;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.student.bean.Student;
import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;

public class StudentService {

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setRoll(21);
		s.setName("M");
		s.setAddress("bbsr");
		s.setMobile((long) 8296);
		StudentDao sd= new StudentDaoImpl();
		
		List<Student> l=new LinkedList();
		l.add(new Student(05,"f","bbsr",(long) 9979));
		l.add(new Student(06,"d","bbsr",(long) 9980));
		l.add(new Student(07,"g","bbsr",(long) 9981));
		l.add(new Student(8,"y","bbsr",(long) 9982));
		try {
			sd.insert(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
