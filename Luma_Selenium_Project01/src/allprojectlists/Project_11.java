package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2400)", "");
		Thread.sleep(2000);		
		driver.findElement(By.linkText("Push It Messenger Bag")).click();
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@data-block='minicart']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[@class='action delete']")).click();
		
		Alert al=driver.switchTo().alert();
		al.accept();

	}

}
