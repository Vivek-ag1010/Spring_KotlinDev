package com.springProject;

public class Airtel implements Sim {

	
	public Airtel() {
		System.out.println("Airtel Constructor Called");
	}

	@Override
	public void calling() {
		System.out.println("Calling from Airtel");
		
	}

	@Override
	public void dataServices() {
		System.out.println("Internet Services from Airtel");
		
	}
	

}
