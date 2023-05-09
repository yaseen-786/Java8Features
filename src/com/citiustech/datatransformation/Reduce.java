package com.citiustech.datatransformation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reduce is use to aggregating the data
		List<Integer> ls = Arrays.asList(1,2,3,4,521,324);
		//Finding sum using Reducer
		int sumofls = ls.stream().reduce(0,(a,b)->a+b); 
		// In this reduce function contain two parameter first as initial value
		// and second parameter as lambda function in which a is the initial value 
//		System.out.println(sumofls);
//	
//		Optional<Integer> opsum = ls.stream().reduce(Integer::sum);
//		System.out.println(opsum.get());
	
		
		
		// Reduce on user defined Type
		double avgsal = EmployeeDao.getEmpList().stream().
		filter(emp -> emp.getGrade().equals("A")).
		map(emp -> emp.getSalary()).mapToDouble(i->i).average().getAsDouble();
		System.out.printf("%.2f",avgsal);
	
	}

}
