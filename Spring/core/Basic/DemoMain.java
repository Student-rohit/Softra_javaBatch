package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		HelloWorld h1 = ctx.getBean("hello" , HelloWorld.class);
		
		
		System.out.println(h1.sayHello("spring 5.x ! "));
		
	}

}

