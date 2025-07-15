package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 
		
		  driver.get("https://letcode.in/edit");
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement header = driver.findElementByTagName("h1");
		  String text = header.getText();	
		  System.out.println(text);
		  
		  // we can also write a parent attribute to get a child text
		  String s  = driver.findElementByXPath("//button[.='Watch tutorial']").getText();
		  System.out.println(s);
		  
		 // getting the overall subtitle text
		 // here card-content is 1 of 2 .. Selenium takes first by default
		  String card_content  = driver.findElementByXPath("//div[@class='card-content']").getText();
		  System.out.println(card_content);
		  
		  // to get the second one
		  String s1  = driver.findElementByXPath("//div[@class='card-content']//span[.='On completion of this exercise, you can learn the following concepts.']/following-sibling::ol[@type='1']").getText();
		  System.out.println(s1);
		  
		  // get attribute - is used only for a blurred text or an attribute value   inside a box
		  
		  String value = driver.findElementById("dontwrite").getAttribute("value");
		  System.out.println(value);
		  
		  
		  
		  
		  
		  
		  
		  // both are same but close() doesn't move from the memory when we go the task manager it runs over there
		  driver.quit();
		  //driver.close(); // mostly used in window switching

	}

}
