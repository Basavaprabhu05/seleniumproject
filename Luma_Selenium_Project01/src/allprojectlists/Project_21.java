package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_21 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("basavaprabhu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bp12345678");
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='action more button']")).click();
		driver.findElement(By.linkText("Echo Fit Compression Short")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("option-label-size-143-item-171")).click();
		driver.findElement(By.id("option-label-color-93-item-49")).click();
		WebElement qty=driver.findElement(By.id("qty"));
		qty.clear();
		qty.sendKeys("2");
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-block='minicart']")).click();
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
