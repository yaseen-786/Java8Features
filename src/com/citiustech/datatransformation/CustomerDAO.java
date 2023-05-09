package com.citiustech.datatransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {
	public static List<Customer> getCustomers(){
		//List<Customer> cuslist = new ArrayList<Customer>();
		return Stream.of(
		(new Customer(100, "YAseen", "Mumbai", Arrays.asList("810495","5635622"))),
		(new Customer(101, "Abhishek", "Aurangabad", Arrays.asList("23453","3335635622"))),
		(new Customer(102, "Vaishnavi", "Banglore", Arrays.asList("49564","222532"))),
		(new Customer(103, "Vishal", "Pune", Arrays.asList("453525","445635622"))),
		(new Customer(104, "Nikhil", "UP", Arrays.asList("810495","665635622")))
		).collect(Collectors.toList());
		
	}

}
