package stepDefination;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver ;
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	}
	@Given("I want to load the URL")
	public void i_want_to_load_the_url() {
	   
		driver.get("http://localhost:8888");
	}
	@When("Login page is dispalyed enter username and password")
	public void login_page_is_dispalyed_enter_username_and_password() {
	 
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@When("Click on Login")
	public void click_on_login() {
		driver.findElement(By.id("submitButton")).click();
	}
	@Then("I validate for home page")
	public void i_validate_for_home_page() {
	   
		
		 String expTitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
			System.out.println(expTitle);
		    String actTitle = driver.getTitle();
			System.out.println(actTitle);
			assertEquals(expTitle, actTitle);
	}

}
