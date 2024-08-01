package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("gear");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("men pants");
		
		driver.findElement(By.xpath("//div[@id='search_autocomplete']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
