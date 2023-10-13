package firstpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCodepgm {
	ChromeDriver driver;
	String baseUrl="https://www.google.com";
	
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test1() throws Exception
	{
		driver.get(baseUrl);
		URL u=new URL(baseUrl);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("successful--"+baseUrl);
		}
		else
			{
			System.out.println("not 200");
			}
	}

}
