package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenRediff {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test
	public void test() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Vaishnav K\\Downloads\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("sheet1");
		int row=sh.getLastRowNum();
		
		for(int i=1;i<=row;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("email="+email);
			
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+pswd);
			
			driver.findElement(By.xpath("//input[@name='login']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(pswd);
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
		}
	}

}
