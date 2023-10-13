package firstpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcountusingtagname {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}

	@Test
	public void test1()
	{
		driver.get("https://www.google.com");
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no.of links="+linkdetails.size());
		 for (WebElement element : linkdetails) 
		 {
	            String link = element.getAttribute("href");
	            String linktext=element.getText();
	            System.out.println(link+"------"+linktext);
	            
	            }
	        }
}

		
		
	

