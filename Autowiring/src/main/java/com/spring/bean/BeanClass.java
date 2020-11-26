package com.spring.bean;

import com.spring.interfaces.AutoDemo;

public class BeanClass implements AutoDemo
{
	BeanDemo bid;

	public BeanClass()
	{
	 System.out.println("Default constructor");
		
	}

	public BeanClass(BeanDemo bid) 
	{
		System.out.println("parametrised constructor");
		this.bid = bid;
	}

	public BeanDemo getBid() {
		return bid;
	}

	public void setBid(BeanDemo bid) {
		this.bid = bid;
	}

	public void sayHello()
	{
		System.out.println("Hello  "+bid);
		
	}

}
