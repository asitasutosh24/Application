package com.spring.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.BeanClass;



public class Demo {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext beans= new ClassPathXmlApplicationContext("new.xml");
		BeanClass ob= (BeanClass) beans.getBean("bc");
		ob.sayHello();

	}

}
