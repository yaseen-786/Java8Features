package com.citiustech.datatransformation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDao {

	
	public static  List<Employee> getEmpList(){
		return Stream.of(
				new Employee(101, "Yaseen", "C", 50000),
				new Employee(102, "Vishal", "A", 150000),
				new Employee(103, "Nikhil", "A", 250000),
				new Employee(104, "Abhishek", "C", 350000),
				new Employee(105, "Jyoti", "A", 450000)
				
				).collect(Collectors.toList());
	}
		
}
