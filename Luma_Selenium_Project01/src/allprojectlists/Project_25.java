package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project_25 {
	WebDriver driver;
	@Test
	public void test()
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Browser is launched");
	}
	@Test(priority=2)
	public void test2() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Radiant Tee")).click();
		driver.findElement(By.linkText("ADD TO WISH LIST")).click();
		driver.findElement(By.xpath("//button[@title='Add All to Cart']")).click();
	    System.out.println("One item is added to wishlist");
	}
	@Test(priority=1)
	public void test3() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("basavaprabhu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bp12345678");
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);	
		System.out.println("Signed in to my account");
	}

}
