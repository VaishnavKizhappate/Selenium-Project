package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayTestNG {
	
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlLoad()
	{
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void test1()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links="+linkdetails.size());
		
	}
	
	@Test
	public void test2()
	{
		WebElement buttn=driver.findElement(By.xpath("//input[@id='gh-btn']"));
		if(buttn.isEnabled())
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}
	}
	@Test
	public void test3()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id='gh-l-h1']/a/img"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	@Test
	public void test4()
	{
		String src=driver.getPageSource();
		if(src.contains("Daily Deals"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
