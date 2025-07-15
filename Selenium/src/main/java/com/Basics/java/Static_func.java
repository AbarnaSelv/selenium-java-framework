package com.Basics.java;

public class Static_func {
	static int a =10;
	public static void display() {
		System.out.println(a);// we  can't call loacal variable to the static method we can call only a static method inside it and also we can't call this keyword inside it
		System.out.println("Abarna");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();// we can call directly without creating a function
		
		String a = "10";
	
		String b = "10";
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		System.out.println(c+d);
		

	}

}
