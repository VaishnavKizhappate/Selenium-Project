package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucepagelogin {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement usrname;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement login;
	
	

	public  Saucepagelogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setValues() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Vaishnav K\\Downloads\\Sauce.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);//workbook
		XSSFSheet sh=wb.getSheet("sheet1");//sheet
		int row=sh.getLastRowNum();//rowdetails
		
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("usrname="+username);
			
			String psswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+psswd);
			
		usrname.sendKeys(username);
		pswd.sendKeys(psswd);
		login.click();
		driver.navigate().refresh();
	
	}
	}
}
