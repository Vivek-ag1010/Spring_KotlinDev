package com.xml.autowired;

public class MathTeacher {
	private Teaching teach;

	public MathTeacher() {

		// TODO Auto-generated constructor stub
	}

	private MathTeacher(Teaching teach) {

		this.teach = teach;
		System.out.println("Math teacher Construcotr is Called");
	}

	public void teach() {
		System.out.println("Math Teacher is Teaching autwire byType");
		teach.teaching();
	}
}
