package com.xml.autowired;

public class Teacher {
	private Teaching teach;

	private Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Teacher(Teaching teach) {
		super();
		this.teach = teach;
	}

	public void setTeach(Teaching teach) {
		this.teach = teach;
	}

	public void teach() {
		teach.teaching();
	}
}
