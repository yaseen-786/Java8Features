package com.citiustech.datatransformation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMethod {
	
	public static Customer getCustomerByName(String name){
		List<Customer> cust = CustomerDAO.getCustomers();
		return cust.stream().filter(nam -> nam.getName().equals(name)).findAny().get();
	}
	
	public static void main(String[] args){
		
//		Customer cust = new Customer(100,"Milan", null ,Arrays.asList("435255645","5456246"));
//		Optional<Object> emptyopertionalobj =Optional.empty();
//		System.out.println(emptyopertionalobj); // it is used to return optional object
//		//Optional<String> checkadd =  Optional.of(cust.getAddress());
//		//System.out.println(checkadd);// it will do null check internally if it contains null or not if yes 
//		// it will throw an null pointer Exception
//		Optional<String> checkadd1 = Optional.ofNullable(cust.getAddress());
//		System.out.println(checkadd1);
//		System.out.println(checkadd1.orElse("India"));//It will set the Address as India default
//		//System.out.println(checkadd1.orElseThrow(()-> new IllegalArgumentException("Address not present")));
//		System.out.println(checkadd1.map(String::toLowerCase).orElseGet(()->"default... value"));
//		// it will transform the address data with map into lowercase
		
		getCustomerByName("YAseen");
	}
	

}
