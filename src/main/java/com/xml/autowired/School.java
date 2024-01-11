package com.xml.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		System.out.println("Without Autowiring");
		Teacher obj1 = context.getBean("teacher1", Teacher.class);
		obj1.teach();

		System.out.println("Autowire of Default Type");
		Teacher obj2 = context.getBean("teacher2", Teacher.class);
		obj2.teach();

		System.out.println("Autowire : 'byName' ");
		Teacher obj3 = context.getBean("teacher3", Teacher.class);
		obj3.teach();

		System.out.println("Autowire : 'byType' It needs Default(no argument construcor) to execute");
		Teacher obj4 = context.getBean("teacher4", Teacher.class);
		obj4.teach();

		System.out.println("Autowire : 'constructor' ");
		Teacher obj5 = context.getBean("teacher5", Teacher.class);
		obj5.teach();
	}

}
