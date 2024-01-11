package com.looseCouplingEx1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheatMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		System.out.println("config.xml.started!!");
		Cheat ch1 = context.getBean("math",MathCheat.class);
		ch1.cheat();
		
		Cheat ch2 = context.getBean("science",ScienceCheat.class);
		ch2.cheat();
	}
	}


