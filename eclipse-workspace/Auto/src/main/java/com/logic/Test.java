package com.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//	College col=(College) context.getBean("srujana");
	//System.out.println(col);
	Config config=(Config) context.getBean(Config.class);
	config.method();
	}

}
