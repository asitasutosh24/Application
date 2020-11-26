package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.college.AnnotationDemo;
import com.spring.college.CollegeDemo;

public class ClientDemo {

	public static void main(String[] args) 
	{
		ApplicationContext context =new AnnotationConfigApplicationContext(AnnotationDemo.class);
		CollegeDemo cd=(CollegeDemo) context.getBean("CollegeDemo",CollegeDemo.class);
		System.out.println("hello");
		cd.test();

	}

}
