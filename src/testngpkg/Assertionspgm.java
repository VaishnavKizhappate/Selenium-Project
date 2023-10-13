package testngpkg;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionspgm {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https:\\www.facebook.com");
		String actualtitle=driver.getTitle();
		String exp="facebook";
		Assert.assertEquals(actualtitle,exp);
		System.out.println("title verified");
	}

}
