package allprojectlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Project_13 {

	 WebDriver driver;
	    @BeforeTest
	    public void launchBrowser() {
			System.out.println("browser is launched");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			driver.findElement(By.linkText("Sign In")).click();
	    }
			
		@Test(dataProvider ="dataset")
		public void login(String email,String pass) throws InterruptedException {
			driver.findElement(By.id("email")).sendKeys("basavaprabhu@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Bp12345678");
			driver.findElement(By.id("send2")).click();
			Thread.sleep(2000);
			System.out.println(email + "==>" + pass);
		}
		
			
			@DataProvider(name="dataset")
			public Object[][] dpMethod() {
				return new Object[][] {
					{"Basavaprabhu@gmail.com","Bp12345678"}
				};
			
		}
			@AfterMethod
			public void closeBrowser() {
				System.out.println("Browser is closed");
				driver.close();


}

		
	}


