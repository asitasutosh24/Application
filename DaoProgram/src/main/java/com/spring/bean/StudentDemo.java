package com.spring.bean;

public class StudentDemo 
{
	//Hello worldjj
	int roll;
	String name;
	String address;
	Long mobile;
	public StudentDemo() {
		super();
		
	}
	public StudentDemo(int roll, String name, String address,Long mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

}
