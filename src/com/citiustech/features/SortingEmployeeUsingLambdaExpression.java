package com.citiustech.features;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingEmployeeUsingLambdaExpression {
	public static void main(String[] args){
		System.out.println(getEmployeeSortById());
			}
	public static List<Employee> getEmployeeSortById(){
		List<Employee> list = new EmployeeDAO().getEmployee();
		Collections.sort(list, (o1,o2)->{return o2.getId().compareTo(o1.getId());});
		return list;
	}

	}
