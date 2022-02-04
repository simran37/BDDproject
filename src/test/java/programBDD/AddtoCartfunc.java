package programBDD;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCartfunc {
WebDriver driver;
	
@Given("user must be on homepage url {string}")	
public void user_must_be_on_homepage_url(String string) 
{		System.setProperty("webdriver.gecko.driver", "/Users/jaura/Downloads/geckodriver");		
driver= new FirefoxDriver();		
driver.get(string);
driver.manage().window().fullscreen();
}

	@Given("login with same username and password")
	public void login_with_same_username_and_password() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.id("login2")).click();
		
		driver.findElement(By.id("loginusername")).sendKeys("swapan");
		Thread.sleep(3000);
			
			driver.findElement(By.id("loginpassword")).sendKeys("password");
			 driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
	}

	@When("Select one laptop under Laptops Option")
	public void select_one_laptop_under_laptops_option() throws InterruptedException {
		
	   driver.findElement(By.linkText("Laptops")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();
	    Thread.sleep(3000);
	}

	@When("Click on Add to Cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	Thread.sleep(3000);
	}

	@Then("An alert should be displayed")
	public void an_alert_should_be_displayed() throws InterruptedException {
		
	    Alert al=driver.switchTo().alert();
	    Thread.sleep(3000);
	    al.accept();
	}

	@Then("Product is added to the Navigate to Cart page")
	public void product_is_added_to_the_navigate_to_cart_page() throws InterruptedException {
		Thread.sleep(3000);
	    driver.navigate().to("https://www.demoblaze.com/cart.html");
	   if(driver.getPageSource().contains("MacBook air"))
	  
	    {System.out.println("Product is added to cart");}
	   Thread.sleep(3000);
	    driver.close();
	}

}
