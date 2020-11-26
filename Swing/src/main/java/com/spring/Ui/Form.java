package com.spring.Ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.context.support.FileSystemXmlApplicationContext;


import com.spring.interfaceDemo.InsertDemo;

public class Form implements ActionListener
{
	JTextField roll,name,address,mobile;
	JButton submit;
	JLabel l1,l2,l3,l4;
	Form()
	{
		JFrame j=new JFrame();
		roll=new JTextField();
		name=new JTextField();
		address=new JTextField();
		mobile=new JTextField();
		l1=new JLabel("roll");
		l2=new JLabel("name");
		l3=new JLabel("address");
		l4=new JLabel("mobile");
		submit=new JButton("submit");
		roll.setBounds(100, 80, 100, 20);
		name.setBounds(100, 110, 100, 20);
		address.setBounds(100, 140, 100, 20);
		mobile.setBounds(100, 170, 100, 20);
		l1.setBounds(20, 80, 100, 20);
		l2.setBounds(20, 110, 100, 20);
		l3.setBounds(20, 140, 100, 20);
		l4.setBounds(20, 170, 100, 20);
		submit.setBounds(100, 200, 100, 20);
		j.add(roll);
		j.add(name);
		j.add(address);
		j.add(mobile);
		j.add(l1);
		j.add(l2);
		j.add(l3);
		j.add(l4);
		j.add(submit);
		submit.addActionListener(this);
		j.setSize(300,300);
		j.setLayout(null);
		j.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		int rollno=Integer.parseInt(roll.getText());
		String Name=name.getText();
		String addr=address.getText();
		int mob=Integer.parseInt(mobile.getText());
		System.out.println("insert the value");
		FileSystemXmlApplicationContext beans= new FileSystemXmlApplicationContext("C:\\Live project\\Swing\\src\\main\\resources\\new.xml");
		Object ob= beans.getBean("bean");
		InsertDemo o=(InsertDemo)ob;
		o.insert(rollno,Name,addr,mob);
		
	}
	
	public static void main(String[]args)
	{
		new Form();
	}
}
