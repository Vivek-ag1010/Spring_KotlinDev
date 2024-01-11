package com.setterInjection.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDetails {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student obj1 = context.getBean("student1", Student.class);
		obj1.displayStudentInfo();
		
		Student obj2 = context.getBean("student2", Student.class);
		obj2.displayStudentInfo();
	}

}
