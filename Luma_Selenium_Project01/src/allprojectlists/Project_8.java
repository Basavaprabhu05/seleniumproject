package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.xpath("//span[@class='action more button']")).click();
		Thread.sleep(1000);
		//selection method
		WebElement dropdown=driver.findElement(By.id("sorter"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Price");

	}

}
