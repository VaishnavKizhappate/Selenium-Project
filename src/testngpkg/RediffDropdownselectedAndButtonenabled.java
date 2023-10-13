package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffDropdownselectedAndButtonenabled {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlLoad()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
		WebElement radiobuttn=driver.findElement(By.xpath("//input[@value='m']"));
		 if (radiobuttn.isSelected()) 
		 {
	            System.out.println("Radio button is already selected.");
		 }
	         else {
	           
	            System.out.println("Radio button is not selected.");
	         }
	}
	@Test
	public void test2()
	{
		WebElement buttn=driver.findElement(By.xpath("//input[@value='Create my account >>']"));
		 if (buttn.isEnabled()) 
		 {
	            System.out.println("The button is enabled");
	        } 
		 else {
	            System.out.println("The button is disabled");
	        }
	}

}
