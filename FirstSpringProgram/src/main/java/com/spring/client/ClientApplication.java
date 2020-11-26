package com.spring.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.spring.app.SpringInterface;

public class ClientApplication {

	public static void main(String[] args) 
	{
		ClassPathResource resource= new ClassPathResource("app.xml");
		XmlBeanFactory bean= new XmlBeanFactory(resource);
		Object ob= bean.getBean("firstApp");
		SpringInterface si=(SpringInterface)ob;
		si.add();

	}

}
