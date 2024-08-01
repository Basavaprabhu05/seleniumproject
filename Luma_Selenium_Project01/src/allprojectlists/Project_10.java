package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='block-promo home-pants']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Portia Capri")).click();
		driver.findElement(By.id("option-label-size-143-item-171")).click();
		driver.findElement(By.id("option-label-color-93-item-53")).click();
		WebElement qty=driver.findElement(By.id("qty"));
		qty.clear();
		Thread.sleep(1000);
		qty.sendKeys("2");
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
