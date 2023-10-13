package firstpkg;
    import org.junit.Before;
	import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Alertpgm {
	ChromeDriver driver;
		
		
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
		}
		
		@Test
		public void test1()
		{
			driver.get("file:///C:/Users/Vaishnav%20K/OneDrive/Desktop/aaa.html");
			driver.findElement(By.xpath("//input[@onclick='display_alert()']")).click();
			Alert a=driver.switchTo().alert();
			String alerttext=a.getText();
			System.out.println(alerttext);
			a.accept();//for accepting alert
			//a.dismiss();for decline alert
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("efg");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	}