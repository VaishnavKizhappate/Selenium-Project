package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99demo {
	
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement buttn=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(buttn);
		act.perform();
		
	  driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
	Alert a=driver.switchTo().alert();
	a.accept();
	
	WebElement doubleb=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleb);
	act.perform();
	Alert ab=driver.switchTo().alert();
	String alerttext=ab.getText();
	System.out.println(alerttext);
	a.accept();	
	}	
	}

