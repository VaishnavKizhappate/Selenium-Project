package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test 
	public void test1()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("bfgdg");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	
	
	
	
	

}
