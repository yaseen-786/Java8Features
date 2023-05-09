package com.citiustech.datatransformation;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	
	public static void main(String[] args){
		List<Customer> cust = CustomerDAO.getCustomers();
		//One to one mapping as customer has one adress 
		List<String> address = cust.stream().map(custo->custo.getAddress()).collect(Collectors.toList());
		List<List<String>> number = cust.stream().map(cus->cus.getPhoneNumbers()).collect(Collectors.toList());
	System.out.println(address);
	System.out.println(number);
	//One to many Mapping
	List<String> num = cust.stream().flatMap(custom -> custom.getPhoneNumbers().stream()).collect(Collectors.toList());
	System.out.println(num);
	}

}
