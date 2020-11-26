package com.spring.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Interfaces.StudentDao;
//import com.spring.bean.BeanClass;
import com.spring.bean.StudentDemo;

public class ClientDemo {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext beans= new ClassPathXmlApplicationContext("new.xml");
	     StudentDao ob=  (StudentDao) beans.getBean("studentDao");
		ob.saveStudent(new StudentDemo(8,"hjh","bbsr",6767L));
	}

}
