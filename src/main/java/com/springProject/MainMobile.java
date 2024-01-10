package com.springProject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainMobile {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		System.out.println("Hello Mobile World!!");
		
//		Sim air=(Airtel) context.getBean("sim", Sim.class);
//		air.calling();
//		air.dataServices();
		
//		Sim vi=(Vodafone) context.getBean("sim", Sim.class);
//		vi.calling();
//		vi.dataServices();
		
		Sim jio=(Jio) context.getBean("sim", Sim.class);
		jio.calling();
		jio.dataServices();
	
	}
}
