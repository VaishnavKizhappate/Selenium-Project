package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBloginusingParammeterization {
	ChromeDriver driver;
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
	}
   
	@BeforeMethod
	
	public void urlLoad()
	{
		driver.get("https://www.facebook.com/");
	}
	@Parameters({"email","password"})
	@Test
	
	public void test1(String email,String password)
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		
	}
}
