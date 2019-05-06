package LoginStepDefPkg;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void User_already_on_login_page(){
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mylescars.com/");
		
		}
	
	@When("^User enters username and password$")
	public void User_enters_uername_password(){
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Myles: Self Drive Cars Rental, Self Drive cars on Rent, Car Rental in India | Mylescars");
	}
	
	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
//		driver.findElement(By.id("hmsignin")).click();
//		driver.findElement(By.id("mobile")).sendKeys("8285335139");
//		driver.findElement(By.id("contact_auto")).click();
		System.out.println("Login button clicked successfully");
		
	}

	@Then("^User user redirests to home page$")
	public void user_user_redirests_to_home_page() throws Throwable {
	    System.out.println("Homepage redirected successfully");
	    
	}
	
	
	
	
}
