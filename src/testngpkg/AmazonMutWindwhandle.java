package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonMutWindwhandle {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.amazon.in/");
		
	String parentwindw=driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
	Set<String> allwindwhandle=driver.getWindowHandles();
	for(String handle : allwindwhandle)
	{
		if(!handle.equalsIgnoreCase(parentwindw))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			
		}
			
	}
		
	}

}
