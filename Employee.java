package com.springframework.applicationcontext.constructortype;

// Constructor Based Injection

public class Employee {

	// Declare

	private String empName;
	private String empAge;
	private String empAddress;

	// Use Parameterized Constructor

	public Employee(String empName, String empAge, String empAddress) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empAddress=" + empAddress + "]";
	}

}
