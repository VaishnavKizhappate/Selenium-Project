package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpage;

public class Fblogintest {
	
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
    	Fbloginpage ob =new Fbloginpage(driver);
    	ob.setValues("abc@gmail.com", "abcvdgd");
    	ob.loginClick();
    }

}
