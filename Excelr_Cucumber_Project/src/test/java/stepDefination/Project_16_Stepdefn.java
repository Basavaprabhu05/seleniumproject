package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Project_16_Stepdefn {
		WebDriver driver;
	
		@Given("User is on Home page")
		public void user_is_on_home_page() {
			driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://magento.softwaretestingboard.com/");
		}

		@Given("Click on Sign-in link")
		public void click_on_sign_in_link() {
			driver.findElement(By.linkText("Sign In")).click();
		}

		@When("User enters valid email as {string} and password as {string}")
		public void user_enters_valid_email_as_and_password_as(String string, String string2) throws InterruptedException {
			driver.findElement(By.id("email")).sendKeys("basavaprabhu@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Bp12345678");
			Thread.sleep(2000);
		}

		@When("Click on Sign-in button")
		public void click_on_sign_in_button() throws InterruptedException {
			driver.findElement(By.id("send2")).click();
			Thread.sleep(2000);
		}

		@Then("User is landed to Home page")
		public void user_is_landed_to_home_page() {
			System.out.println("user landed on homepage");
		}

		@Then("Username is displayed")
		public void username_is_displayed() {
			System.out.println("Username is displayed on homepage");
		

	}


	}


