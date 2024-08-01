package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Project_23 {

		WebDriver driver;
		@BeforeSuite
	    public void launchBrowser() {
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://magento.softwaretestingboard.com/");
	    	System.out.println("Browser is launched");
	    }
		@Test
	    public void enterUrl() {
			driver.findElement(By.linkText("What's New")).click();
	    	System.out.println("Whats New page is opened");
	    }
		@AfterSuite
	    public void closeBrowser() {
			driver.close();
	    	System.out.println("Browser is closed");
	    }
		@Test
	    public void enterUrl2() throws InterruptedException {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)", "");
			Thread.sleep(2000);		
			driver.findElement(By.linkText("3 Reviews")).click();
			Thread.sleep(1000);
	    	System.out.println("Checking Customer reviews for a product");


	}

}
