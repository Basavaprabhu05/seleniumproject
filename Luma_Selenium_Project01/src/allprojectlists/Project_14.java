package allprojectlists;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Project_14 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
       File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File location=new File(".//Screenshots//Luma.png");
       
       try {
		Files.copy(screenshot, location);
	} catch (IOException e) {
		e.printStackTrace();

	}

	}

}
