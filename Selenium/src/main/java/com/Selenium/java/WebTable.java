package com.Selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	// An Important Concept

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		// 1st search for a "//table" and choose the table you are gonna work on
		WebElement Table = driver.findElement(By.id("simpletable"));
		 
		// getting text of that table(column name) so,
		List<WebElement> th = Table.findElements(By.tagName("th"));
		for (WebElement text : th) {
			System.out.println(text.getText()); 
		}
		
		// printing all rows
		List<WebElement> rows = Table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		for (WebElement rwtext : rows) {
			System.out.println(rwtext.getText()); 
		}
		// to get only the first column values
		List<WebElement> firstColumnCells = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[1]"));

		for (WebElement cell : firstColumnCells) {
		    System.out.println(cell.getText());
		}

		
		// we have to click the textbox if the name is Raj
		List<WebElement> Raj = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));

		for (WebElement row : Raj) {
		    String lastName = row.findElement(By.xpath("td[2]")).getText();
		    if (lastName.equals("Raj")) {
		        WebElement checkbox = row.findElement(By.xpath("td[4]/input"));
		        checkbox.click();
		        System.out.println("Clicked checkbox for: " + lastName);
		        break; // if only one match is expected
		    }
		}

		
		
		
		
		//driver.quit();

	};

}
