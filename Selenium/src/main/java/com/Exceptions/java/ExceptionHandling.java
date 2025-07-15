package com.Exceptions.java;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.openqa.selenium.NoSuchElementException;

public class ExceptionHandling {
	//throws
	public void code() throws InterruptedException,NoSuchElementException {
		Thread.sleep(3000);
		
	}

	public static void main(String[] args) throws NoSuchElementException, InterruptedException {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// writing an exception to show the user whats happening inside 
		try {
			int num = a%0; // it will throw an exception since we can't divide it by 0
			System.out.println(num);
		}catch(ArithmeticException e) {
			throw new RuntimeException() ; // it will stop the code to proceed further , it wont print below completed
		}
		catch (Exception e) { // overall , we have to use it in a last catch only after the  use of  other possible exceptions in the code
			// if we are trying to call other exceptions under the head exception it will throw an error
			System.err.println("Unknown error");
			
		}finally{ // to print something even it got error or not, also to rectify the warnings
			sc.close();
		}
		/*catch(ArithmeticException e){
		}
			//e.printStackTrace();
			// just to get a exception message
			//System.out.println(e.getMessage());
			System.err.println("Number is not divisible by zero");
		}catch(InputMismatchException e) {
			// to print the error message in our style : err
			System.err.println("Input type is int");
		}*/
		
		
		 
		
		System.out.println("Completed");
		ExceptionHandling thrws = new ExceptionHandling();
		thrws.code(); // it will throw an error even we used throws , it will endup adding throws to the main class
		
		
		
				

	}

}
