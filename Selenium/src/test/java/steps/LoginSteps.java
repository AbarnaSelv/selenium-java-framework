package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.picocontainer.classname.ClassName;
import org.testng.Assert;

import Drivers.DriverInstance;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.jar.asm.commons.Remapper;

public class LoginSteps extends DriverInstance {

	//RemoteWebDriver driver;
	// WebDriverWait wait;

	
	  @Given("User should navigate to the application") 
	  public void userShouldNavigate() { //System.out.println("Im here");
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver-win32/chromedriver.exe"); 
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver, 40);
	
	  driver.get("https://bookcart.azurewebsites.net/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  }
	 
	@Given("User clicks on the login")
	public void userClicksOnTheLogin() {
		driver.findElement(By.xpath("//span[normalize-space(text())='Login']")).click();

	}

	@Given("User enters the username as abarna03")
	public void userEntersTheUsernameAsAbarna() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("abarna03");

	}

	@Given("User enters the password as Abharnas#123")
	public void userEntersThePasswordAsAbharnas() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Abharnas#123");

	}

	@When("user clicks the login button")
	public void userClicksTheLoginButton() {
		driver.findElement(By.xpath(
				"//span[.='Login']/parent::button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-primary mat-mdc-button-base']"))
				.click();

	}

	@Then("login should be success")
	public void loginShouldBeSuccess() {
		WebElement e= driver.findElement(By.xpath("//span[contains(text(),' abarna03')]"));
		wait.until(ExpectedConditions.visibilityOf(e));
		
		System.out.println(e.getText());
		// driver.quit();

	}

	@Given("User enters the username as abarnas")
	public void userEntersTheUsernameAsAbarnas() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Abarnas");
	}

	@Given("User enters the password as AbharnaS#03")
	public void userEntersThePasswordAsAbharnaS() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("AbharnaS#03");

	}

	@But("login should be failed")
	public void loginShouldBeFailed() {
		String text = driver.findElement(By.cssSelector("mat-error[role='alert']")).getText();
		Assert.assertEquals(text.trim(), "Username or Password is incorrect.");

	}

	// parameterized - in order to avoid repetition9
	@Given("User enters the username as {string}")
	public void userEntersTheUsernameAs(String username) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	}

	@Given("User enters the password as {string}")
	public void userEntersThePasswordAs(String password) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

	}

}
