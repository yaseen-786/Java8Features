package com.citiustech.features;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> i = n -> n%2==0;
		System.out.println(i.test(21));
		/* predicate is a functional interface return type boolean use for condition check  */
	}
	

}
