package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement gears=driver.findElement(By.linkText("Gear"));
		Actions act=new Actions(driver);
		act.moveToElement(gears).build().perform();
		
		WebElement watches=driver.findElement(By.id("ui-id-27"));
		Actions act1=new Actions(driver);
		act1.moveToElement(watches).build().perform();
		watches.click();
		
		Thread.sleep(2000);
		driver.navigate().back();

	}

}
