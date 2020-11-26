package com.spring.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
@Component("df")
public class DateFactory implements FactoryBean
{
	

	public Class getObjectType() {
		// TODO Auto-generated method stub
		return java.util.Date.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		return new java.util.Date();
	}
}
