package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverificationusingjunit {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("success");
		}
			
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void pagesource()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		}
	}

