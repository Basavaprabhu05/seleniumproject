package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_24 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(2000);	
		driver.findElement(By.linkText("Argus All-Weather Tank")).click();
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		WebElement errmsg1=driver.findElement(By.id("super_attribute[143]-error"));
		String size=errmsg1.getText();
		System.out.println("Error message for size selection is " +size);
		
		WebElement errmsg2=driver.findElement(By.id("super_attribute[93]-error"));
		String colour=errmsg2.getText();
		System.out.println("Error message for colour selection is " +colour);
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
