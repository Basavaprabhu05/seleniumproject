package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.id("email_address")).sendKeys("basavaprabhu@gmail.com");
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		
		WebElement msg=driver.findElement(By.xpath("//div[@data-ui-id='message-success']"));
		String st=msg.getText();
		System.out.println("Message displayed: "+st);

	}

}
