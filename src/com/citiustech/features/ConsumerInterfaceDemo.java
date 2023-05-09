package com.citiustech.features;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> i = n -> System.out.println("The consumer is "+n);
		i.accept(20);
		/* Consumer interface is a functional interface with return type void use to perform operation on 
		input it is use as a parameter in for each for streamapi */
	}

}
