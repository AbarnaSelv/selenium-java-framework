package com.Selenium.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		// We can't handle any other actions inside the DOM when the alert or Pop-Up came, it will lock or freezes the entire DOM
		
		/*--Types
		1)Simple Alert
		2)Confirm Alert
		3)Prompt Alert*/
		
		//Simple Alert
		driver.findElementById("accept").click();
		//driver.switchTo().alert().accept();
		
		//getting the alert text
		Alert alert = driver.switchTo().alert(); // here Alert = Target Locator
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println("Simple Alert Text: "+text);
		alert.accept(); // or.dismiss(); // alert will get disappear whatever you click
		
		//Confirm Alert
		driver.findElementById("confirm").click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		String s = a.getText();// get text only gives the text only inside the DOM
		System.out.println("Confirm Alert Text: "+s);
		a.accept();
		
		//Prompt Alert
		
		driver.findElementById("prompt").click(); // here just clicking the button
		Thread.sleep(3000);
		Alert alertt = driver.switchTo().alert(); // above code will open alert here just passing the value
		alertt.sendKeys("Sharu");
		
		System.out.println(alertt.getText());// this will give the text inside the alert
		// accepting it
		alertt.accept();
		String str = driver.findElementById("myName").getText(); // printing the passed value 
		System.out.println(str);
		
		
		driver.quit();
		
		
		
		/* Exceptions Handling in Alerts
		 * -- when I am trying to get a current Url through "getCurrentUrl()" when the page is in alert it gives 
		 * -> "UnhandledAlertException"
		 * -- when I am trying to switchTo().alert() before getting an alert it will give
		 * --> "NoAlertPresentException"
		 * 
		 * so we have to handle alerts before performing any actions
		 * 
		 * 
		 *  */


	}

}
