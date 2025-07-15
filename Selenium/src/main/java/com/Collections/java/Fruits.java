package com.Collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Fruits {
	
	// List - ArrayList and Set - TreeSet, HashSet,LinkedHashSet 

	public static void main(String[] args) {
		
		// LIST
		
		// in order to find implementation select list
		// -> Rightclick -> open type hierarchy ->u can see the implemented classes.
		//arrayList is majorly used for Selenium scripts
		//<--> ..called as generic , only non Primitve and wrapper class is used inside
		
		// In selenium list is used to find the list of web elements
		// Two properties of list
		// -- allow duplicates
		// -- maintains an order
		List<String> list = new ArrayList<String>();
		list.add("Avacado");
		list.add("Apple");
		list.add("Avacado");
		list.add("Apple");
		list.add("Banana");
		int size = list.size();// like a length in an array
		System.out.println(size);
		// to print all the values
		for(int i = 0;i<size;i++ ) {
			System.out.println(list.get(i));// get(index)
		}
		// also we can print like,
		for(String s: list) {
			System.out.println(s);
		}
		// to sort the list
				Collections.sort(list);
		
		// to remove
		list.remove("apple"); // it will remove the first occurrence
		// contains
		
		boolean contains = list.contains("Mango");
		System.out.println(contains);
		
		// to check whether the list is empty or not
		list.isEmpty();
		
		// to clear 
		list.clear();
		
		
		// SETS
		
		// HashSet
		Set<String> set = new HashSet<String>(); // remove duplicates and doesn't maintains insertion order
		set.add("Apple");
		set.add("Avacado");
		set.add("Apple");
		list.add("Banana");
		for(String sets : set) {
			System.out.println(sets);
		}
		
		//TreeSet
		
		Set<String> Trset = new TreeSet<String>(); // remove duplicates and maintains order by ASCII
		set.add("Apple");
		set.add("Avacado");
		set.add("Apple");
		list.add("Banana");
		for(String Trsets : set) {
			System.out.println(Trsets);
		}
		
		//LinkedHashSet
		Set<String> lnkHset = new LinkedHashSet<String>(); // remove duplicates and maintains insertion order
		set.add("Apple");
		set.add("Avacado");
		set.add("Apple");
		list.add("Banana");
		for(String lnkHsets : lnkHset) {
			System.out.println(lnkHsets);
		}
		
		//functions
		set.isEmpty();
		set.clear();
		set.size();
		// in set we cant use set.get() so,
		List<String> myList = new ArrayList<String>(set);
		for(String values: myList ) {// it will print duplicates 
			System.out.println(values);
		}
		myList.get(0);
	
// dependencies -  used for a maven project, downloads a jar file and links to the workspace -> library or jar file
// jar file - used for java project
// plugin - run as java app , run as testNG -> software or tool
		


		
		
//TestNG - Test Next Generation -> useful for sequential execution and parallel execution to run the configuration without code
//-- inspired by J unit - java and N unit - c# unit testing framework
//-- 1. Annotations with Order of Execution of Annotation
//-- 2. Setting priority 
//-- 3. Ignore Test Case
//-- 4. Thread pool size
//-- 5. Running Test Case multiple times
//-- 6. Create Groups
//-- 7. Parameter passing(XML)
//-- 8. Parameter passing using Data Provider
//-- 9. Handle Exceptions
//-- 10. Method Dependency
//-- 11. Group Dependency
//-- 12. Timeout
//-- 13. Soft Assertion
//-- 14. parallel 

		
		
		
	}
}
