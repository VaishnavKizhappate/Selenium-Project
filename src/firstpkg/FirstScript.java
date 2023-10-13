package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		
		
		//chrome driver
		//firefox driver
		//edge driver
		
		ChromeDriver driver=new ChromeDriver();//browse launch
		driver.get("https://www.google.com");//open application
		//driver.close();//close application
		
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

}
