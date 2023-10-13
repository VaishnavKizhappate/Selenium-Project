package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoneusingxpath {
	ChromeDriver driver;
	
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		Thread.sleep(6000);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("books",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-cart-text-container']")).click();
		driver.findElement(By.xpath("//*[contains(@href,'/gp/new-releases/?ref_=nav_cs_newreleases')]")).click();
		driver.findElement(By.xpath("//a[@href='/gp/new-releases/amazon-renewed/ref=zg_bsnr_nav_amazon-renewed_0']")).click();
		

	}
}
