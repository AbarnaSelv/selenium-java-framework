package com.Selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
	//to get all the tagname text ex: label

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/edit/");
		List<WebElement> labels = driver.findElementsByTagName("label");
		
		for(WebElement webE : labels) {
			String text = webE.getText();
			System.out.println(text);
		}
		
		// to find the specific element
		WebElement lastele = labels.get(labels.size()-1);
		System.out.println(lastele.getText());
		int size = labels.size();
		if (	size == 6) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Testcase failed");
		}
		
		driver.quit();
		
		

	}

}
