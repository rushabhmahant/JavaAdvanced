package com.cts.java8.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamAPI {
	
	public static void main(String[] args) {
		
		Employee em1 = new Employee(101, "First Employee", null, 25000.00);
		Employee em2 = new Employee(102, "Second Employee", null, 20000.00);
		Employee em3 = new Employee(103, "Third Employee", null, 18000.00);
		Employee em4 = new Employee(104, "Fourth Employee", null, 55000.00);
		Employee em5 = new Employee(105, "Fifth Employee", null, 50000.00);
		Employee em6 = new Employee(106, "Sixth Employee", null, 22000.00);
		Employee em7 = new Employee(107, "Seventh Employee", null, 78000.00);
		Employee em8 = new Employee(108, "Eighth Employee", null, 59000.00);
		
		Department de1 = new Department(101, "Finance");
		Department de2 = new Department(102, "HR");
		Department de3 = new Department(103, "Accounts");
		Department de4 = new Department(104, "IT");
		Department de5 = new Department(105, "Admin");
		
		em1.setEmpDepartment(de1);
		em2.setEmpDepartment(de2);
		em3.setEmpDepartment(de3);
		em4.setEmpDepartment(de4);
		em5.setEmpDepartment(de1);
		em6.setEmpDepartment(de2);
		em7.setEmpDepartment(de3);
		em8.setEmpDepartment(de1);
		

		// List Operations
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(em1);
		employeeList.add(em2);
		employeeList.add(em3);
		employeeList.add(em4);
		employeeList.add(em5);
		employeeList.add(em6);
		employeeList.add(em7);
		employeeList.add(em8);
		
		List<Department> departmentList = new ArrayList<Department>();
		departmentList.add(de1);
		departmentList.add(de2);
		departmentList.add(de3);
		departmentList.add(de4);
		departmentList.add(de5);
		
		
		System.out.println("List of employees in each department:");
		Map<Integer, List<Employee>> departmentGrouping = employeeList.stream()
				.collect(Collectors.groupingBy((e) -> e.getEmpDepartment().getDeptId(),
						Collectors.toList()
						));
		
		departmentGrouping.forEach((k1, v1) -> System.out.println(k1 + ": " + v1));
		
		System.out.println("Average salary in each department:");
		Map<Department, Double> departmentAverageSalary = employeeList.stream()
				.collect(Collectors.groupingBy((e) -> e.getEmpDepartment(),
						Collectors.averagingDouble((em) -> em.getEmpSalary())
						));
		departmentAverageSalary.forEach((k1, v1) -> System.out.println(k1 + ": " + v1));
		
		
		System.out.println("Maximun salary in each department:");
		
		Map<String, Optional<Employee>> departmentMaxSalary = employeeList.stream()
				.collect(Collectors.groupingBy((e) -> e.getEmpDepartment().getDeptName(),
						Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary))
						));
		departmentMaxSalary.forEach((k1, v1) -> System.out.println(k1 + ": " + v1.get().getEmpSalary()));
		
		
		System.out.println("List of employees, names of which starting with letter 'S' in each department");
		
		Map<String, List<Employee>> departmentEmployeeInitial = employeeList.stream()
				.collect(Collectors.groupingBy((emp) -> emp.getEmpDepartment().getDeptName(),
						Collectors.filtering((emp)->emp.getEmpName().startsWith("S"), Collectors.toList())
						));
		departmentEmployeeInitial.forEach((k1, v1) -> System.out.println(k1 + ": " + v1));
		
		System.out.println("***Top 2 salary holders in each department***");
		
		Map<String, List<Employee>> topTwoSalaryHolders = employeeList.stream()
				.collect(Collectors.groupingBy((emp) -> emp.getEmpDepartment().getDeptName(),
						Collectors.collectingAndThen(Collectors.toList(), 
								(tempList) -> tempList.stream().sorted(Collections.reverseOrder()).limit(2).collect(Collectors.toList()))
						));
		topTwoSalaryHolders.forEach((k1, v1) -> System.out.println(k1 + ": " + v1));
		
		System.out.println("Classify Senior/Junior in each department based on salary");
		
		Map<String, Map<String, List<Employee>>> employeeDesignation = employeeList.stream()
				.collect(Collectors.groupingBy((emp) -> emp.getEmpDepartment().getDeptName(),
						Collectors.groupingBy(e -> e.getEmpSalary()>=50000?"Senior":"Junior", Collectors.toList())
						));
		
		employeeDesignation.forEach((k1, v1) -> System.out.println(k1 + ": " + v1));
		
		System.out.println("3-argument grouping");
		
		Map<String, Set<Employee>> employeeLinkedHashMap =employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getEmpName, LinkedHashMap::new, 
						Collectors.toSet()));
		System.out.println(employeeLinkedHashMap);
		
	}

}
