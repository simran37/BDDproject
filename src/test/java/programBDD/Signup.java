package programBDD;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Signup {
WebDriver driver;
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");
		driver= new FirefoxDriver();
		driver.get(string);
	}

	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.id("sign-username")).sendKeys("knjej");
		driver.findElement(By.id("sign-password")).sendKeys("password");
	}

	@When("click on Sign up button")
	public void click_on_sign_up_button() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	}
	@Then("Alert should be displayed")
	public void alert_should_be_displayed() throws InterruptedException {
		
			Alert al=driver.switchTo().alert();
		
	    Thread.sleep(3000);
	    al.accept(); 
	    
		
		
	}
	
	
}
