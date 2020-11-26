package com.spring.bean;

import com.spring.app.SpringInterface;

public class FirstSpringProgram implements SpringInterface
{
	public int getNumA() {
		return numA;
	}
	public void setNumA(int numA) {
		this.numA = numA;
	}
	public int getNumB() {
		return numB;
	}
	public void setNumB(int numB) {
		this.numB = numB;
	}
	private int numA;
	private int numB;
	
	public void add( ) 
	{
		System.out.println(this.numA+this.numB);
		
		
	}

}
