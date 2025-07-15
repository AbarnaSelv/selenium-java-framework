package com.Basics.java;

public class Constructor{
	int id;
	String name ;
	// default constructor
	
	Constructor(){
		id = 02;
		name = "Appu";
	}
	
	
	void display() {
		System.out.println(id +":" + name );
		
	}
	
	
	
	// parameterized constructor
	public Constructor(int id) {
		this.id=id;
	}
	public Constructor(int id,String s) {
		this.id = id;
		this.name = s;
	}
	public static void main(String args[]) {
		Constructor c = new Constructor(1);
		Constructor c1 = new Constructor(1, "Abharnas");
		Constructor c2 = new Constructor();
		c.display();
		c1.display();
		c2.display();
		
	}

}
