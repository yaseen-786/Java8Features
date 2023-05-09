package com.citiustech.features;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> st = () ->  "Yaseen";
		System.out.println(st.get());
	}
	/* Supplier is a function interface with return type object but no method argument 
	  used in streamapi */

}
