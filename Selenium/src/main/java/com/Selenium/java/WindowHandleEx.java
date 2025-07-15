package com.Selenium.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/window");
		/*
		 * driver.findElement(By.id("home")).click();
		 * 
		 * Set<String> WindowHandles = driver.getWindowHandles(); 
		 * List<String> list = new ArrayList<String>(WindowHandles); driver.switchTo().window(list.get(1));
		 * 
		 * String title =
		 * driver.findElementByXPath("//h1[.='Ready to be a Pro Engineer?']").getText();
		 * System.out.println("Title is: "+title);
		 * 
		 * driver.switchTo().window(list.get(0)); driver.close();
		 * 
		 * Set<String> WH2 = driver.getWindowHandles(); list.clear(); list.addAll(WH2);
		 * driver.switchTo().window(list.get(0)); driver.close();
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "./drivers/chromedriver-win32/chromedriver.exe"); ChromeDriver driver1 = new
		 * ChromeDriver();
		 * 
		 * driver1.manage().window().maximize();
		 * driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * // Reopen the LetCode window page driver1.get("https://letcode.in/window");
		 */
		driver.findElement(By.id("multi")).click();
		Set<String> Handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(Handles);
		driver.switchTo().window(list.get(1));
		String title1 = driver.findElementByXPath("//h1[.='Alert']").getText();
		System.out.println("Title 1 : " +title1);
		driver.switchTo().window(list.get(2));
		String title2 = driver.findElementByXPath("//h1[.='Dropdown']").getText();
		System.out.println("Title 1 : " +title2);
		driver.quit(); 
		
		
		
	}
		
		

}
