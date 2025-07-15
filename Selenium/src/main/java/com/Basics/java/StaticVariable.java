package com.Basics.java;

public class StaticVariable {

	int x =0;
	static int y =0;
	
	void count() {
		x++;
		y++;
		System.out.println("Non static "+x+ " static "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s = new StaticVariable();
		s.count();
		s.count();
		StaticVariable s1 = new StaticVariable();
		s1.count();
		s1.count();
		StaticVariable s3 = new StaticVariable();
		s3.count();
		
		

	}

}
