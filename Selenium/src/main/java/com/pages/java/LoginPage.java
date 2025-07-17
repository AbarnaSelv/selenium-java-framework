package com.pages.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.java.POMbase;

public class LoginPage extends POMbase {
	
	

	public LoginPage (RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//locators
	
	public boolean getUsernameLabel() {
		return driver.findElementByXPath("//label[.='Username']").isDisplayed();
	}
	public boolean getPasswordLabel() {
		return driver.findElementByXPath("//label[.='Password']").isDisplayed();
	}
	
	
	
	
	/**
	 * @description - get the data from user and type on the user name field 
	 * @param username - pass the user to login
	 * @return 
	 */
	
	//actions
	
	// using page factory
	
	@FindBy(name = "username")
	WebElement Username;
	
	@FindBy(name = "password")
	WebElement Pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	
	
	
	
	
	public LoginPage enterUsername(String username){
		Username.sendKeys(username);
		return this;
		
	}
	
	public LoginPage enterPassword(String password) {
		Pass.sendKeys(password);
		return this;
	}
	public LoginPage clickLogin() {
		login.click();;
		return this;
		
		
	}
	public forgotPasswordPage forgotPassword() {
		driver.findElementByXPath("//p[.='Forgot your password? ']");
		return new forgotPasswordPage();
	}
	
	// just when there is a frame , in order to switch to each other frame , just calling the frame and all the methods via constructor
	LoginPage(String username, String password){
		//driver.switchTo.frame(0);
		enterUsername(username);
		enterPassword(password);
		clickLogin();
		
		
	}

	
}
