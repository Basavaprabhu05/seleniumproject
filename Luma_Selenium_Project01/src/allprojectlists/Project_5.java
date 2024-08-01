package allprojectlists;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Project_5 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://magento.softwaretestingboard.com/");
driver.findElement(By.linkText("Sign In")).click();
driver.findElement(By.id("email")).sendKeys("basavaprabhu@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Bp12345678");
Thread.sleep(1000);
driver.findElement(By.id("send2")).click();

//scroll down webpage
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1800)", "");
Thread.sleep(2000);

driver.findElement(By.linkText("Radiant Tee")).click();
driver.findElement(By.linkText("ADD TO WISH LIST")).click();
driver.findElement(By.xpath("//button[@title='Add All to Cart']")).click();

String exp = "All items added to the cart";
  //error message capturing
  WebElement m = driver.findElement(By.xpath("//div[@class='message-error error message'][1]"));
  WebElement m1 = driver.findElement(By.xpath("//div[@class='message-error error message'][2]"));
  String act = m.getText();
  String act1 = m1.getText();
  System.out.println("Error message is: "+ act);
  System.out.println("Error message is: "+ act1);
  //verify error message with Assertion
  Assert.assertEquals(exp, act);
  driver.quit();	
	}

}
