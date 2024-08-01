package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.linkText("Create an Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("Basava");
		driver.findElement(By.id("lastname")).sendKeys("Prabhu");
		driver.findElement(By.id("email_address")).sendKeys("basavaprabhu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Bp12345678");
		driver.findElement(By.id("password-confirmation")).sendKeys("Bp12345678");
		driver.findElement(By.xpath("//div[@class='primary']//button[@title='Create an Account']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
