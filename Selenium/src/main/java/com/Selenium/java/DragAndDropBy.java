package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
	
	// we use the "drag and drop by" if we has no destination to drop

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 
		
		  driver.get("https://jqueryui.com/draggable/");
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.switchTo().frame(0);
		  WebElement webE = driver.findElementById("draggable");
		  Point p = webE.getLocation(); // since we dont know the location we are getting the location and dropping it
		  int X = p.getX();
		  int Y = p.getY();
		  System.out.println("X: "+X);
		  System.out.println("Y: "+X);
		  
		  Actions builder = new Actions(driver);
		  builder.dragAndDropBy(webE, X+50, Y+80).perform();
	}

}
