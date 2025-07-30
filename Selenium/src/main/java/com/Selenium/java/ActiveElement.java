package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // here the element will blink when we open a website that is called as Active Element
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement activeE = driver.switchTo().activeElement();
		activeE.sendKeys("Abharnas", Keys.TAB, "Absharu@123",Keys.ENTER);
		
		// interview ques how to interact with an element without finding it 
		// -- Active Element 
		
	}

}
