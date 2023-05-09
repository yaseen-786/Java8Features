package com.citiustech.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("Yaseen");
		ls.add("Abhishek");
		ls.add("Vishal");
		ls.add("Nikhil");
		//ls.stream().forEach(l -> System.out.println(l));
		ls.stream().filter( t -> t.endsWith("l")).forEach(s -> System.out.println(s));

	}

}
