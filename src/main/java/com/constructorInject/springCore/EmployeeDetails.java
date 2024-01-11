package com.constructorInject.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDetails {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee obj1 = context.getBean("emp1", Employee.class);
		obj1.displayEmployeeInfo();
		
		Employee obj2=context.getBean("emp2", Employee.class);
		obj2.displayEmployeeInfo();
		
		Employee obj3=context.getBean("emp3", Employee.class);
		obj3.displayEmployeeInfo();
	}

}
