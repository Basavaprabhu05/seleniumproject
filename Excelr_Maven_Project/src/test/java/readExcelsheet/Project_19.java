package readExcelsheet;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_19 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Sign In")).click();
		String path="E:\\read excel\\book1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Data2");
		int rows=sh.getLastRowNum();
		for(int r=1;r<=rows;r++) {
			XSSFRow row=sh.getRow(r);
			XSSFCell email=row.getCell(0);
			XSSFCell password=row.getCell(1);
			System.out.println(email+" "+password);
			try {
				driver.findElement(By.id("email")).sendKeys(email.toString());
				driver.findElement(By.id("pass")).sendKeys(password.toString());
				driver.findElement(By.id("send2")).click();
			Thread.sleep(2000);
			System.out.println("valid");
			} catch(Exception e) {
				System.out.println("invalid");
			}
		}

	}

}
