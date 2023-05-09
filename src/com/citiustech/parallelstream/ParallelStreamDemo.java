package com.citiustech.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		long start = 0;
//		long end = 0;
//		start = System.currentTimeMillis();
//		IntStream.range(0, 100).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Plain stream took"+(end-start));
//		System.out.println("--------------------------------------");
//		start = System.currentTimeMillis();
//		IntStream.range(0, 100).parallel().forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Parallel stream took"+(end-start));
//		
		
		IntStream.range(1,10).
		forEach( x->System.out.println("Thread:"+Thread.currentThread().getName()+": "+x));
		
		
		IntStream.range(1,10).parallel().
		forEach( x->System.out.println("Thread:"+Thread.currentThread().getName()+": "+x));
		

	
	}

}
