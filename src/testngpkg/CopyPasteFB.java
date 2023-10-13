package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPasteFB {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com");
	    WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		fname.sendKeys("abc");
		Actions act=new Actions(driver);
		act.keyDown(fname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fname, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(lname,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		
	}

}
