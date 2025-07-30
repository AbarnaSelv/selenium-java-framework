package com.Selenium.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			// An HTML inside one HTML is called as frames<iframe..<body>..</iframe> eg: ad inside a web	
			 driver.get("https://letcode.in/frame");
			// when you write in normal method like inspecting and findelementbyid("").click() or whichever func() ..if it gives an error
			// so, search for "//iframe" in elements to check how many frames are there
			
	    	/* -- Interview Que,
	    	 * What is an example for overloading
	    	 * - Frames switching to frame
		     * 
		     *  
		     *  
		     *  
		     * */
			// 1stly switching to frame
			
			driver.switchTo().frame(1); // find the index carefully where that frame is located by //iframe and use the respected index
			driver.findElementByXPath("//input[@placeholder='Enter name']").sendKeys("Abharnas");
			driver.findElementByXPath("//input[@placeholder='Enter email']").sendKeys("Appu");
			
			WebElement we = driver.findElementByXPath("//iframe[@src='innerframe']"); // we can also get by <iframe _ngcontent-ng-c3036227318="" src="innerframe"></iframe>
			driver.switchTo().frame(we);
			
			
			driver.findElementByXPath("//input[@placeholder='Enter email']").sendKeys("Abharnas@gmail.com");
			driver.switchTo().parentFrame();// since we are in child moving to the parent
			driver.findElementByXPath("//input[@placeholder='Enter name']").sendKeys("Abarna");// sendkeys always append
			// checking whether this works in outside of the frame(section)
			driver.switchTo().parentFrame(); // (or) defaultContent()

			//In order to move to the section apart from frames
			driver.findElementByXPath("//button[.='Watch tutorial']").click();

			
			
			
		    // -- Exception
			
			
			
			// -- No such frame exception
			
			
			
			
			

	}

}
