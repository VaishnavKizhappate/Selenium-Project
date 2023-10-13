package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbcreatepage;

public class FbCreatepagetest {

	
	WebDriver driver;
	
	  @BeforeTest
	    public void setUp()
	    {
	    	driver=new ChromeDriver();
	    }

	  
	  @Test
	    public void test()
	    {
	    	driver.get("https://www.facebook.com/");
	    	Fbcreatepage ob=new Fbcreatepage(driver);
	    	ob.createclick();
	    	ob.getstrtClick();
	    }	    	
}

