package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Basepkg.Sauceurl;
import Pages.Saucecartpage;
import Pages.Saucepagelogin;

public class Saucepagetest extends Sauceurl {
	
	@Test
	public void test() throws Exception
	{
		Saucepagelogin ob=new Saucepagelogin(driver);
		ob.setValues();
		Saucecartpage ob1=new Saucecartpage(driver);
		ob1.cartp();
		ob1.infrmation();
		
	}
	
	

}
