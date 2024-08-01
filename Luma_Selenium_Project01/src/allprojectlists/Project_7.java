package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement men=driver.findElement(By.linkText("Men"));
		
		Actions act=new Actions(driver);
		act.moveToElement(men).build().perform();
		
		Thread.sleep(2000);
		
		WebElement women=driver.findElement(By.linkText("Women"));
		
		Actions act1=new Actions(driver);
		act1.moveToElement(women).build().perform();
		
        Thread.sleep(2000);
		
		WebElement sale=driver.findElement(By.linkText("Sale"));
		
		Actions act2=new Actions(driver);
		act2.moveToElement(sale).build().perform();

	}

}
