package com.spring.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.BeanClass;

public class ClientDemo {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext beans= new AnnotationConfigApplicationContext();
		beans.scan("com.spring");
		beans.refresh();
		BeanClass ob=  (BeanClass) beans.getBean("hcm");
		System.out.println(ob.sayHello());

	}

}
