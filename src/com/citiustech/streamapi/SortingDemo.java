package com.citiustech.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.citiustech.features.Employee;
import com.citiustech.features.EmployeeDAO;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(19);
		ls.add(32);
		ls.add(54);
		ls.add(56);
		ls.add(9);
		
		/*
		 Sorting on primitive datatype
		ls.stream().sorted().forEach(l -> System.out.println(l)); //list sorted in ascending order
		ls.stream().sorted(Comparator.reverseOrder()).forEach( l -> System.out.println(l)); //Descending Order
		 */
		List<Employee> emplis = new EmployeeDAO().getEmployee();
		//emplis.stream().sorted((o1,o2)-> o2.getId().compareTo(o1.getId())).forEach(l -> System.out.println(l));
		//emplis.stream().sorted(Comparator.comparing(e -> e.getName())).forEach(a -> System.out.println(a));
		emplis.stream().sorted(Comparator.comparing(Employee :: getName)).forEach(a -> System.out.println(a));
	}
	

}
