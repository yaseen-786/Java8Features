package com.citiustech.features;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public List<Employee> getEmployee(){
	List<Employee> emplist = new ArrayList<Employee>();
	emplist.add(new Employee(101,"Yaseen"));
	emplist.add(new Employee(102,"Vishal"));
	emplist.add(new Employee(103,"Nikhil"));
	emplist.add(new Employee(104,"Abhishek"));
	
	return emplist;
	}
}
