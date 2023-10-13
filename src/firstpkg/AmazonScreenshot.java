package firstpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonScreenshot {
	
	ChromeDriver driver;
	
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
	}

	@Test
	
	public void test1() throws Exception 
	
	{
		driver.get("https://www.amazon.in/ap/signin?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex&openid.pape.max_auth_age=0");
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileHandler.copy(src,new File("E://Screenshot1.png"));
		
       
		driver.get("https://www.amazon.in/ap/signin?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex&openid.pape.max_auth_age=0");
      WebElement button=driver.findElement(By.id("continue"));
      File con=button.getScreenshotAs(OutputType.FILE);
      FileHandler.copy(con,new File("./Screenshot/button.png"));
	}
}
