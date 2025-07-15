package testNG.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider extends DataUtils { //  to run a multiple user ids using array
	
	// one using extend 
	// another using "dataProviderClass"
	@Test(dataProvider = "login", dataProviderClass= DataUtils.class) // just calling the name
	public void login(String email, String password)  {
//This tells TestNG:
//"Hey, call the getData() method, get the values, 
//and inject them automatically into login(email, password)."
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//System.out.println("Opening URL in browser: " + browser);
	driver.get("https://www.netflix.com/in/login");


	driver.findElement(By.name("userLoginId")).sendKeys(email, Keys.TAB);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	System.out.println("Page Title: " + driver.getTitle());

	driver.quit();
	}
}


// -- instead of giving
//->@Test(dataProvider = "login") we can give the method inside the "DataProvider"
//->@Test(dataProvider = "getData")

// dataproviderMismatch -> when u use both the parameter and dataProvider in the same class, 
// here -- higher precedence is for DataProvider

// to print the data inside the frame 
// public void login(String data[]){
//sop("email: "+data[0]);
//sop("pass: "+data[1]);
//}











