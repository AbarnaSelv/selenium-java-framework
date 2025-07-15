package com.Selenium.java;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException{
		// Page,Element,Section
		
		// Selenium wont take a screenshorts covering that URL . tabs and taskbar , It only takes the DOM
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/button");
		
		// Page
		File src= driver.getScreenshotAs(OutputType.FILE);// It will return a file
		File dest = new File("./captures/img1.png"); // img.png --- filename.format // storing in a destination since its a file
		org.openqa.selenium.io.FileHandler.copy(src, dest); // it will copy the source file to the destination
		
		//Element
		WebElement WebE = driver.findElementById("home"); // It will retrun a webElement class
		File srcE= WebE.getScreenshotAs(OutputType.FILE);
		File destE = new File("./captures/img2.png"); // img.png --- filename.format , need to change the file name since its under the same folder
		org.openqa.selenium.io.FileHandler.copy(srcE, destE);
		
		//section
		WebElement content = driver.findElementByClassName("content");
		File srcC= content.getScreenshotAs(OutputType.FILE);
		File destC = new File("./captures/img3.png"); // img.png --- filename.format
		org.openqa.selenium.io.FileHandler.copy(srcC, destC);
		
		driver.quit();
		
		

	}

}
