package testNG.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Parameters {

	RemoteWebDriver driver;

	@org.testng.annotations.Parameters({"userLoginId", "password", "browser"})
	@Test
	public void login(String email, String passW, String browser) {

		switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
				driver = new ChromeDriver();
				break;

			case "firefox":
				String driverPath = System.getProperty("user.dir") + "\\drivers\\geckodriver-v0.29.1-win32\\geckodriver.exe";
		        System.setProperty("webdriver.gecko.driver", driverPath);

		        driver = new FirefoxDriver();
			    
			    break;
			

			default:
				System.err.println("Browser is not defined properly");
				return;
		}
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Opening URL in browser: " + browser);
		driver.get("https://www.netflix.com/in/login");

		System.out.println("Finding and filling login fields...");
		driver.findElement(By.name("userLoginId")).sendKeys(email, Keys.TAB);
		driver.findElement(By.name("password")).sendKeys(passW);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Page Title: " + driver.getTitle());

		driver.quit();
	}
}
