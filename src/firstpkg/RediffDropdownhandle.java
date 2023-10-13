package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDropdownhandle {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		    WebElement dayElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	        Select day = new Select(dayElement);
	        day.selectByIndex(01);
	        
	        WebElement monthElmenet = driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	        Select month = new Select(monthElmenet);
	        month.selectByVisibleText("JAN");
	        
	        
	        WebElement yearElmenet = driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	        Select year = new Select(yearElmenet);
	        year.selectByValue("2000");

	        
	}

}
