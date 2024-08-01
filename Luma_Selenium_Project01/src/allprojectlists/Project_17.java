package allprojectlists;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_17 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
        List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
        totalLinks.size();
        System.out.println("Total links are "+totalLinks.size());
        for(int i=0;i<totalLinks.size();i++) {
        	System.out.println(totalLinks.get(i).getText());
        }
             driver.close();
             }

	}


