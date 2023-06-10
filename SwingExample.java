package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import corejava.if_else_statment;

public class SwingExample implements ActionListener {
	
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	public SwingExample() {
		f=new JFrame("my swing example");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayeredPane(null);
		f.setResizable(false);
		
		l1=new JLabel("ID");
		l2=new JLabel("FIRST NAME");
		l3=new JLabel("LAST NAME");
		l4=new JLabel("EMAIL");
		l5=new JLabel("MOBILE");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		
		b1=new JButton("INSERT");
		b2=new JButton("UPDATE"); 
		b3=new JButton("SERACH");
		b4=new JButton("DELETE");
				
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3); 
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);
		
		t1.setBounds(50, 50, 100, 20);
		t2.setBounds(150, 100, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);
		

		b1.setBounds(50, 300, 100, 20);
		b2.setBounds(190, 300, 100, 20);
		b3.setBounds(50, 350, 100, 20);
		b4.setBounds(190, 350, 100, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public static void main(String[] args) {
		new SwingExample();
	}
	
	public void actionPerformed(ActionEvent e) {
	  if(e.getSource()==b1)
	  {
		  try {
			  Class.forName("com.mysql.jdbc.driver");
			  Connection connection=DriverManager.getConnection("jdbc:mysql//localhost:3306//java","root","");
			  String sql="inert into student(fname,lname,email,mobile()values('"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";			   
			  Statement stmt=connection.createStatement();
			  stmt.execute(sql);
			  
		} catch (Exception e2) {
			
			e2.printStackTrace();
		}
		  
		  
		  System.out.println("insert clicked");
	  }
	  else if(e.getSource()==b2)
	  {
		  System.out.println("search clicked");
	
	  }
	  else if(e.getSource()==b3)
	  {
		  System.out.println("update clicked");
	
	  }
	  else if(e.getSource()==b4)
	  {
		  System.out.println("delete clicked");
	
	  }
	}
}
