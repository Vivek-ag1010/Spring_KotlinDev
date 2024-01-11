package com.constructorInject.springCore;

public class Employee {
	private String empName;
	private int empId;
	
	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}
	public Employee(int empId)
	{
		this.empId=empId;
	}
	
	public void displayEmployeeInfo()
	{
		System.out.println("Employee Name is: "+empName+" and the id is: "+empId);
	}
	
}
