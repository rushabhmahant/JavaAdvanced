package com.cts.java8.streamapi;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String empName;
	private Department empDepartment;
	private double empSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, Department empDepartment, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(Department empDepartment) {
		this.empDepartment = empDepartment;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + ", empSalary="
				+ empSalary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(this.empSalary == e.empSalary)
			return 0;
		return (this.empSalary > e.empSalary) ? 1 : -1;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		int id = ((Employee)obj).getEmpId();
		return this.getEmpId() == id;
	}
	
	@Override
	public int hashCode() {
		return this.getEmpId();
	}
	
	

}
