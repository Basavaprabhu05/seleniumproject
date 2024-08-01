package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/men/bottoms-men/pants-men.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Cronus Yoga Pant")).click();
		
		WebElement size=driver.findElement(By.id("option-label-size-143-item-176"));
	    size.click();
	    
	    WebElement color=driver.findElement(By.id("option-label-color-93-item-58"));
	    color.click();
	    
	    driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();

	}

}
