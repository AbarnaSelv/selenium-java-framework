package com.Selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 WebElement ele = driver.findElementByCssSelector("#fruits"); // here # refers to id in CssSelector 
		 Select myFruits = new Select(ele);
		 myFruits.selectByVisibleText("Apple");
		 myFruits.selectByVisibleText("Orange"); // here we can select only one item 1stly it will select apple and the orange
		 
		 WebElement webE = driver.findElementById("country");
		 Select Country = new Select(webE);
		 Country.selectByVisibleText("India");
		 // interview Ques
		 WebElement WE = Country.getFirstSelectedOption();
		 System.out.println(WE.getText());
		 
		 //selecting multiple values
		 WebElement MulSel = driver.findElementById("superheros");
		 Select Heros = new Select(MulSel);
		 // checking whether it is a multiple select so
		 Boolean isMul = Heros.isMultiple();
		 System.out.println("Multilple select ? " +isMul);
		 Heros.selectByIndex(1); // selecting by index 1st will be 0 , 2nd one will be 1 likewise and so on 
		 Heros.selectByValue("ta"); // selecting by value <option value = "ta" >....
		 
		 // deselecting the selected option it works only for Multiple select
		 Heros.deselectByIndex(1);
		 
	     // to print or get all the options 
		 
		 List<WebElement> allHeros = Heros.getOptions();
		 allHeros.forEach(i->System.out.println(i.getText()));
		 
		 // to print all the selected options
		 List<WebElement> allSelHeros = Heros.getAllSelectedOptions();
		 for (WebElement sel : allSelHeros) {
			 System.out.println(sel.getText());
		 }
		 
		 
		 
		 
		 
		 
	}

}
