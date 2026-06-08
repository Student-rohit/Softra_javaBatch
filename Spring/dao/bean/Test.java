package com.dao.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	 public static void main(String[] args) {

	        Person p1 = new Person();
	        p1.setPER_ID(101);
	        p1.setPER_NAME("Rohit");

	        p1.display();

	        System.out.println(" ");

	        Person p2 = new Person(102, "Amit");
	        
	        
	        System.out.println("ID : " + p2.getPER_ID());
	        System.out.println("Name : " + p2.getPER_NAME());
	    }
}

