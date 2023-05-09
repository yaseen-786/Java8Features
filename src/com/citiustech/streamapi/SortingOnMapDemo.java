package com.citiustech.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.citiustech.features.Employee;

public class SortingOnMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<Integer, String> m = new HashMap<>();
//		m.put(22, "Java");
//		m.put(20, "Loving");
//		m.put(23, "Stream");
//		m.put(40,"API");
		/*
		  Sorting in map using Traditional Approach
		List<Entry<Integer, Map>> l = new ArrayList(m.entrySet());
		Collections.sort(l,(o1,o2)->o1.getKey().compareTo(o2.getKey()) );
		System.out.println(l);
		*/
		//m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(a->System.out.println(a));
		
		Map<Integer,Employee> m1 = new TreeMap<>();
		m1.put(200000, new Employee(120, "Vishal"));
		m1.put(400000, new Employee(124, "Nikhil"));
		m1.put(2600000, new Employee(10, "Yaseen"));
		m1.put(230000, new Employee(21, "Abhishek"));
		m1.put(90000, new Employee(11, "Jyoti"));
		List<Entry<Integer, Employee>> data = new ArrayList<>(m1.entrySet());
//		Collections.sort(data, (o1,o2)-> o1.getValue().getId().compareTo(o2.getValue().getId()));
//		System.out.println(data);
//		
		m1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId).reversed())).forEach(a->System.out.println(a));
	}

}
