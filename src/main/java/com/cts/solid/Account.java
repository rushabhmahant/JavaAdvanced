package com.cts.solid;

import java.util.List;

public class Account {
	
	private String accountName;
	private String accountDomain;
	private List<Employee> employees;
	
	public Account(String accountName, String accountDomain, List<Employee> employees) {
		this.accountName = accountName;
		this.accountDomain = accountDomain;
		this.employees = employees;
	}
	
	public Employee addEmployee(Employee e) {
		this.employees.add(e);
		System.out.println("Employee " + e.getEmployeeName() + " added in " + this.accountName);
		return e;
	}
	
	

}
