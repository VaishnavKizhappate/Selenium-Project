package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class Datepickerpgm {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.booking.com/");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[2]")).click();
		while(true)
		{
		String monthtext=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		System.out.println("month="+monthtext);
		if(monthtext.equals("October 2023"))
		{
			System.out.println("month selected");
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
		}
		}
	List<WebElement>alldates= driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
	
	for(WebElement dateele:alldates)
	{
		String date=dateele.getText();
		//System.out.println(date);
		if(date.equals("19"))
		{
			dateele.click();
			break;
			
		}
	}
	}
}
