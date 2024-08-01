package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_20 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.linkText("Sale")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='block-promo sale-mens']")).click();
		driver.findElement(By.linkText("Pierce Gym Short")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='product-social-links']")).click();
		WebElement successmsg=driver.findElement(By.xpath("//div[@data-ui-id='message-success']"));
		String s=successmsg.getText();
		System.out.println("Success message is: "+s);

	}

}
