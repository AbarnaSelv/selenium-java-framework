package com.Selenium.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/window");
		
		driver.findElement(By.id("home")).click();
		String WindowHandle = driver.getWindowHandle();
		System.out.println("Parent window: "+ WindowHandle);// this will give the parent URL 
		
		// it will return the URL in the array type
		Set<String> WindowHandles = driver.getWindowHandles(); // WindowHandles supports LinkedHashset since its follow an insertion order
		System.out.println(WindowHandles); 
		
		// after switching to window printing the current URL 
		System.out.println(driver.getCurrentUrl()); // it wont print the current url it will give the parent URL even when we use WindowHandling
		
		//so,
		// since we cant use "get()" in set we are using
		List<String> list = new ArrayList<String>(WindowHandles);
		driver.switchTo().window(list.get(1)); // here 1 refers to current child url and 0 means parent;
		System.out.println(driver.getCurrentUrl());// this will print the current url
		
		// to close the parent window 
		driver.switchTo().window(list.get(0));
		driver.close();
		
		//driver.getCurrentUrl();// this will give an exception "NoSuchWindowException" since we trying to print the closed window
		
		// so, creating set again
		Set<String> WindowHandles2 = driver.getWindowHandles();
		list.clear(); // clearing the previous list
		list.addAll(WindowHandles2);
		driver.switchTo().window(list.get(0)); // since we closed the parent window child become parent so 1 
		// then we are printing it 
		driver.getCurrentUrl();// this will give the window
		
		// WindowHandle() - for one URL
		// WindowHandles() - for more URL.

	}

}
