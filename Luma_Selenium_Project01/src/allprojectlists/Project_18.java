package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='block-promo home-t-shirts']")).click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.linkText("Gwyn Endurance Tee")).click();
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,1400)", "");
		driver.findElement(By.linkText("Reviews 3")).click();
		Thread.sleep(2000);
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,600)", "");
		
		
		WebElement rating=driver.findElement(By.id("Rating_5_label"));
		Actions act1=new Actions(driver);
		act1.moveToElement(rating).build().perform();
		act1.click();
		driver.findElement(By.id("nickname_field")).sendKeys("Bp");
		driver.findElement(By.id("summary_field")).sendKeys("Rating the product");
		driver.findElement(By.id("review_field")).sendKeys("Not that Good Quality");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		Thread.sleep(2000);

	}

}
