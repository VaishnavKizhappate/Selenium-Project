package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileupldusingSndkys {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");;
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).sendKeys("C:\\Users\\Vaishnav K\\OneDrive\\Pictures\\Acer");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@name='send']")).click();
	}

}
