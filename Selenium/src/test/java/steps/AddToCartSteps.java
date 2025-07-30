package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Drivers.DriverInstance;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartSteps extends DriverInstance {
	//WebDriver driver;
	//WebDriverWait wait;
	
	@Given("User should navigate to the application")
	public void userShouldNavigate() {
		//System.out.println("Im here");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 40);
		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@Given("User should login as {string} and {string}")
	public void userShouldLoginAsAnd(String username, String password) {
		driver.findElement(By.xpath("//span[normalize-space(text())='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[.='Login']/parent::button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']")).click();

	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	/*
	 * @Given("User search a book") public void userSearchA(String book) {
	 * driver.findElement(By.xpath("//input[@placeholder='Search books or authors']"
	 * )).sendKeys(book);
	 * driver.findElement(By.className("mdc-list-item__primary-text")).click();
	 * 
	 * 
	 * }
	 */
	
//	@Given("User search a The Simple Wild")
//	public void userSearchATheSimpleWild() {
//		driver.findElement(By.xpath("//input[@placeholder='Search books or authors']")).sendKeys("the simple wild");
//		driver.findElement(By.className("mdc-list-item__primary-text")).click();
//	   
//	}

	@When("User add the book to the cart")
	public void userAddTheBookToTheCart() throws InterruptedException {
		driver.findElement(By.className("mdc-button__label")).click();
		Thread.sleep(1000);
	   
	
	}
	
	@Given("User search a {string}")
	public void userSearchABook(String book) {
		driver.findElement(By.xpath("//input[@placeholder='Search books or authors']")).sendKeys(book);
		
		WebElement bookDisplay = driver.findElement(By.className("mdc-list-item__primary-text"));
		WebElement bookOption = wait.until(ExpectedConditions.visibilityOf(bookDisplay));
		bookOption.click();
		
		
	    
	}

	@Then("the cart badge should be updated")
	public void theCartBadgeShouldBeUpdated() {
		String text = driver.findElement(By.id("mat-badge-content-0")).getText();
		Assert.assertEquals(Integer.parseInt(text)>0, true);
	   
	}
	/*@Given("User search a The Hookup")
	public void userSearchATheHookup() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("User search a The Simple Wild")
	public void userSearchATheSimpleWild() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();*/
	//}

	


}
