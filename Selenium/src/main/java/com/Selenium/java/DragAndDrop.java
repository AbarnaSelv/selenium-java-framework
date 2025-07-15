package com.Selenium.java;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 
		
		  driver.get("https://jqueryui.com/droppable/");
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.switchTo().frame(0);
		  WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		  WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		  Actions builder = new Actions(driver); // it is also a one of the overloading examples
		  builder.dragAndDrop(src, dest).perform(); // or .build().perform()
	}

}
