package com.springProject;

public class Vodafone implements Sim {
	
	public Vodafone() {
		System.out.println("Vodafone Constructor is Calling");
	}

	@Override
	public void calling() {
		System.out.println("Calling from Vodafone");
		
	}

	@Override
	public void dataServices() {
		System.out.println("Internet Services from Vodafone");
		
	}

}
