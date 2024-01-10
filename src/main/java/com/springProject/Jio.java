package com.springProject;

public class Jio implements Sim {

	public Jio() {
		System.out.println("Constructor from Jio");
	}

	@Override
	public void calling() {
		System.out.println("Calling from Jio");
		
	}

	@Override
	public void dataServices() {
		System.out.println("Internet Services from Jio");
		
	}
	

}
