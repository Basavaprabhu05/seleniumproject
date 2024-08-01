package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("basavaprabhu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bp12345678");
		Thread.sleep(1000);
		driver.findElement(By.id("send2")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Argus All-Weather Tank")).click();
		driver.findElement(By.linkText("ADD TO WISH LIST")).click();

	}

}
