package com.Selenium.java;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/button");
		
		// getting X & Y coordinates i.e getting a location where we cant find the locator or when the link is dynamic
        WebElement webE= driver.findElementById("position"); // web element is a class here
        // also we can write as
        // -- driver.findElementById("position").getLocation();
        Point p = webE.getLocation(); // it returns Point class
        int x = p.getX();
        int y = p.getY();
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
        
        //getting the color of the button
        WebElement wE = driver.findElementById("color");
        String s = wE.getCssValue("background-color");// it has taken from the styles 
        System.out.println(s);
        
        //getting the height and width of the button
        Rectangle rect = driver.findElementById("property").getRect(); // rectangle gives the size(height,width) + position of the element
        //i.e, x = horizontal position from the left, y = vertical position from the top


        Dimension d = rect.getDimension(); // dimension gives only the size(height,width) of the element
        System.out.println(d);
        System.out.println(d.getWidth());
        System.out.println(d.getHeight());
        
		/*
		 * // Also we can write as (without using a dimension)
		 * System.out.println(rect.getHeight());
		 * System.out.println(rect.getWidth());
		 */
        
        // confirm button is disabled
        
        Boolean b = driver.findElementByXPath("//button[@id='isDisabled']").isEnabled();
        System.out.println(b);
        
        
        driver.quit();
        
        
        
		
        

	}

}
