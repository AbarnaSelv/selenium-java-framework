package com.base.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.utilities.java.ReadExcel;

public class POMbase {
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	protected RemoteWebDriver driver = null;
public String fileName = "";
	
	@DataProvider(name="data")
	public String[][] dataProvider() {
		String[][] excelData = ReadExcel.getExcelData(fileName);
		return excelData;
	}
	                                                                 
			
	@BeforeMethod
	public void startApp(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}

