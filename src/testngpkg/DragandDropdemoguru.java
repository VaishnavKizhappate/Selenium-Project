package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDropdemoguru {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		//Debit side
		WebElement src=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dest).perform();
		
		
		WebElement sour=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement des=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(sour,des).perform();
		
		//Credit side
		WebElement so=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement de=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(so,de).perform();
		
		
		WebElement s=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement d=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(s,d).perform();
		
		
		//perfect!
		WebElement perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if(perfect.getText().equals("Perfect!"))
				
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
				
		
	}

}
