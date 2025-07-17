package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.java.LoginPage;


public class TC001Login extends com.base.java.POMbase {
	@BeforeTest
	public void setData() {
		fileName = "TC001";
	}
	
	@Test(dataProvider = "data")
	

	public void loginTest(String[] data) {
		
		LoginPage lp = new LoginPage(driver);
		Boolean usernameLabel = lp.getPasswordLabel();
		//Assert.assertEquals(usernameLabel, true);
		Assert.assertTrue(usernameLabel);
		boolean passwordLabel = lp.getPasswordLabel();
		Assert.assertTrue(passwordLabel);
		
		new LoginPage(driver)
		.enterUsername(data[0])
		.enterPassword(data[1])
		.clickLogin();
		
		
	}
}
