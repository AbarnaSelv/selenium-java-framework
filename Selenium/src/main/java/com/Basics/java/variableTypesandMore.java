package com.Basics.java;

public class variableTypesandMore {
	int c=10; // instance variable or global variable - access only inside this class
	/*int num() {
		return 10;
	}*/
	void addingNum(int a, int b) {// local variable - access only inside a method
		System.out.println(a+b+this.c);// it won't work in static methods or this.num
	}
	
	public static void main(String[] args) {
		variableTypesandMore v = new variableTypesandMore();
		v.addingNum(10, 5);
	}
	

}
