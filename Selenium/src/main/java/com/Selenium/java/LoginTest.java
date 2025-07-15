package com.Selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		// launching browser
		// loading the Url
		// clicking login
		// entering email id
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		
		  driver.get("https://buymeacoffee.com/letcode");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElementByLinkText("Login").click();
		  driver.findElementByLinkText("Sign up").click();
		  //Thread.sleep(2000);
		 
		  //driver.findElementById("username").sendKeys("abarna_03");
		  
		  driver.findElementByXPath("//h3[contains(text(),'buymeacoffee.com')]/following-sibling::input").sendKeys(" abarna_03");
		
		
		/*
		 * driver.findElementByLinkText("Login").click();
		 * 
		 * driver.findElementById("google-login-page").click();
		 * driver.findElementById("identifierId").sendKeys(
		 * "abarnaselvaganapathy@gmail.com");
		 * driver.findElementByXPath("//button[.='Next']").click();
		 */
		 
		
		
		
		/*
		 * XPath syntax
		 * 
		 * here that input,label, button are the tags in the inspect don't confuse with that
		 * -- refer notes for more details
		 
		 * 1. Attribute
		 * //input[@id='fullName']
		 * 
		 * 2. Conditional
		 * //input[@type='text' and @name='name']
		 * //input[@type='text'][@name='name']
		 * 
		 * 3. Collections
		 * (//input[@type='text')[1] 
		 * 
		 * 4. Functions
		 * //input[contains(@placeholder,'Enter first')]
		 * 
		 * (//input)[last()]
		 * (//input)[last()-1]
		 * (//input)[position=1]
		 * (//input)[position<1]
		 * 
		 *  5. Text Based Xpath
		 *  //label[text()='Enter your full name']
		 *  //label[contains(text(),'Enter your')]
		 *  //label[starts-with(text(),'Enter your')]
		 *  //label[.='Enter your full name'] -> short form of text()
		 *  normalize-space when there is space between a text like " refer a video "
		 *  //button[normalize-space()='refer a video']
		 *  
		 *  6. Ancestor, Parent, Child
		 *  .. here to pcik a child
		 *  //strong[.='Sign Up']/Parent::a[@class='button is Primary']
		 *  shortcut for above line-->
		 *  //strong[.='Sign Up']/..
		 *  
		 *  here to pick a parent
		 *  //div[@class='navbar_item']/div/a[href='__']
		 *  to be more short -->
		 *  //div[@class='navbar_item']//a[href='__']
		 *  Also,
		 *  //div[@class='navbar_item']/child::/div/a
		 *  
		 *  Ancestors,
		 *  //button[.=''Login]ancestor::div[@class='Login']
		 *  
		 *  7. Axes
		 *  Following->following-sibling (Traverse downwards)
		 *  Preceding->preceding-sibling(Traverse upwards)
		 *  //label[text()='username']/following-sibling::input[@id='username']
		 *                 (or)
		 *  //label[text()='username']/following-sibling::input[1]
		 *  //input[@id='username']/preceding-sibling::label[1]
		 *  
		 *  8. Wildcard
		 *  
		 *  //* -> It will take all the elements like a * in Sql
		 *  -- to check whether the attribute is unique or not ,
		 *  //*[@id='username'] -> 1 of 1 means unique
		 *  
		 *  < input .. placeholder = "Enter your name"
		 *  normally ,
		 *  //input[@placeholder='Enter your name']
		 *  here,
		 *  //input[@*='Enter your name'].. 1of 1
		 *  
		 *  9. SVG
		 *  -- Scalable Vector Graphics
		 *  Svg is a seperate tag like input , label and others...
		 *  but we can't write like //svg .
		 *  so,
		 *  //*[local-name()='svg'][@class='global-nav-login']
		 *  
		 *                 
		 
		 */		

	}

}
