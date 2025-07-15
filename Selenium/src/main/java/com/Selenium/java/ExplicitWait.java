package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		// it is used when we click any button with alerts but the alert will takes some time to display so we are asking the driver to 
		// wait until the alert displays so we are using Explicit wait
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://letcode.in/waits");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("accept")).click();
//		/*
//		 * Alert a = driver.switchTo().alert(); 
		  //a.accept();
//		 */
		WebDriverWait wait = new WebDriverWait(driver,40);
//		Alert a = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(until.getText());
//		a.accept();
		
		// invisibility - ElementClickInterceptedException
		//--source -> f8 -> elements for that toast
		
		
		// wait for title change
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement ele = driver.findElementByXPath("//span[.='Electronics']");
		 Actions builder = new Actions(driver);
		 builder.moveToElement(ele).perform();
		 WebElement Electronics = driver.findElementByLinkText("Laptop Accessories");
		 wait.until(ExpectedConditions.visibilityOf(Electronics));
		 Electronics.click();
		 wait.until(ExpectedConditions.titleContains("Itaccessories"));
		 System.out.println(driver.getTitle());
		

	}

}
