package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotclssIlovepdfFileUpld {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test() throws AWTException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		fileUopload("\"D:\\CV\\CV DOC.docx\"");
	}

	private void fileUopload(String p) throws AWTException {
		StringSelection strselection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		
		
		Robot robot=new Robot();
		
		robot.delay(3000);//delay
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.delay(2000);//delay
		
		
	}

}
