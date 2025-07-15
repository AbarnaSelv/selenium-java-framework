package com.Basics.java;
import java.util.*;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"0","1","2","3","4"};
		System.out.println(arr.length);
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		// without using for loop
		System.out.println(Arrays.toString(arr));
		
		

	}

}
