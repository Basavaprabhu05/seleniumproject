package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
 
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("tshirt for men");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='search_autocomplete']")).click();
		driver.close();

	}

}
