package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef{
WebDriver driver;
    
	@Given("Login Page must display")
	public void login_page_must_display() {
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
	
		Reporter.log("Login is done",true);
	
	}

	@When("Fill the username")
	public void fill_the_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");	
	
		
		Reporter.log("Un filled",true);
		
	
	}

	@When("Fill the password")
	public void fill_the_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
	
		Reporter.log("Pwd Filled",true);
		
	}

	@When("Click on login")
	public void click_on_login() {
	 driver.findElement(By.id("submitButton")).click();
		Reporter.log("Login Clicked",true);
		
	
	}

	@Then("Home Page must Display")
	public void home_page_must_display() {
	
		Reporter.log("Home Page is displayed",true);
		
	
	}
	@When("Fill the invalid password")
	public void Fill_the_invalid_password() {
		driver.findElement(By.name("user_password")).sendKeys("12345");
		
	}
	
	
	@When("Fill the invalid username")
	public void fill_the_invalid_username() {
	
		driver.findElement(By.name("user_name")).sendKeys("admin");	
		
	
	}

	

	@When("Fill the blank username")
	public void fill_the_blank_username() {
	 
		driver.findElement(By.name("user_name")).sendKeys("  ");	
				
		
	}

	@When("Fill the blank password")
	public void fill_the_blank_password() {
	
		driver.findElement(By.name("user_password")).sendKeys("   ");
		
		
	}

	@When("Fill the wrong username")
	public void fill_the_wrong_username() {
	
		driver.findElement(By.name("user_name")).sendKeys("admin123");	
		
	}

	@When("Fill the wrong password")
	public void fill_the_wrong_password() {
	
		driver.findElement(By.name("user_password")).sendKeys("123454343");
		
	
	}
	@Then("Home Page must not  Display")
	public void home_page_must_not_Display() {
	
		Reporter.log("Home Page not displayed",true);
	
	}
	
	@When("Fill the username {string}")
	public void fill_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Fill the password {string}")
	public void fill_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Fill the username {int}")
	public void fill_the_username(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Fill the password {int}")
	public void fill_the_password(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
