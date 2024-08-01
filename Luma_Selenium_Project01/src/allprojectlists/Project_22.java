package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_22 {

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
		driver.findElement(By.xpath("//div[@data-block='minicart']")).click();
		driver.findElement(By.linkText("View and Edit Cart")).click();
		driver.findElement(By.linkText("Check Out with Multiple Addresses")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Go to Shipping Information']")).click();
		driver.findElement(By.linkText("Change")).click();
		
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.clear();
		city.sendKeys("Hyderabad");
		WebElement state=driver.findElement(By.id("region_id"));
		Select s=new Select(state);
		s.selectByVisibleText("Telangana");
		driver.findElement(By.xpath("//button[@title='Save Address']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
