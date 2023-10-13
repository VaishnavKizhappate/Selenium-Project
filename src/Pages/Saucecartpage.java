package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucecartpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement c1;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement c2;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement c3;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement c4;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement c5;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement c6;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartbuttn;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout; 
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement pstlcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement ctnue;
	
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finish;
	
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement bcktohome;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement menubuttn;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	
	public  Saucecartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cartp()
	{
		c1.click();
		c2.click();
		c3.click();
		c4.click();
		c5.click();
		c6.click();
		cartbuttn.click();
		checkout.click();
	}
	
	public void infrmation()
	{
		fname.sendKeys("Vaishnav");
		lname.sendKeys("K");
		pstlcode.sendKeys("680506");
		ctnue.click();
		finish.click();
		bcktohome.click();
		menubuttn.click();
		logout.click();
	}

}
