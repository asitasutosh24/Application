package com.spring.bean;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

import com.spring.interfaces.Demo;
@Service("hcm")   //we can also @Component to make a class as spring bean
public class BeanClass implements Demo
{
	@Value("20")
	int a;
	Date s;
	public Date getS() {
		return s;
	}
	//@Autowired  //to perform autowiring byType
	@Resource(name="df")
	public void setS(Date s) {
		this.s = s;
	}
	public String sayHello()
	{
		
		return "current tim is "+ s.toString()+ " value is"+a;
	}

}
