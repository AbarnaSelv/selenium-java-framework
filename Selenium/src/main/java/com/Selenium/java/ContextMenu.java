package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElementByXPath("//span[.='right click me']");
		 Actions builder = new Actions(driver);
		 builder.contextClick(ele).perform();
		 driver.findElementByXPath("//span[.='Edit']").click();
		 Alert a = driver.switchTo().alert();
		 System.out.println(a.getText());
		 a.accept();
		 driver.quit();
		 
		 
	}

}
