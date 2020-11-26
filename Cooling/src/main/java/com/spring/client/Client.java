package com.spring.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.Interface.Operation;



public class Client {

	public static void main(String[] args) 
	{
		//ClassPathResource resource= new ClassPathResource("hello.xml");
		FileSystemXmlApplicationContext beans= new FileSystemXmlApplicationContext("C:\\Live project\\Cooling\\src\\main\\resources\\hello.xml");
		Object ob= beans.getBean("bean");
		Operation o=(Operation)ob;
		o.insert(10,"bb","bbsr",776);
		//o.delete(10);
		//o.update(10);
	}

}
