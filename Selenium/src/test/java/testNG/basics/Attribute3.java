package testNG.basics;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Attribute3 {
	

	
		// Print the number of word named  "cricket" in the given WebSite 

		@Test(invocationCount = 3, invocationTimeOut = 10000)// to run for " " given count, next one is to complete the execution within the given seconds 
		// "invocationTimeOut" will works only if there is "invocationCount"
		public void main() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN1289G0&p=cricket"); // here the element will blink when we open a website that is called as Active Element
			driver.manage().window().maximize();
			List<WebElement> count  =driver.findElementsByXPath("//*[contains(text(),'Cricket') or contains(text(),'cricket')]");
			System.out.println(count.size());
			driver.quit();
		}

	}



