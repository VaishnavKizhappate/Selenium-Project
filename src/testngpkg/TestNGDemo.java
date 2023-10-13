package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	//@beforesuite
	//@beforeTest
	//@beforeclass
	//@beforemethod
	//@test
	//@aftermethod
	//@afterclass
	//@aftertest
	//@aftersuite
	
	@BeforeTest
		public void setUp()
		{
			System.out.println("open browser");
		}
	
	@BeforeMethod
	   public void urlloading()
	   {
		System.out.println("url details");
	   }
	
	@Test(priority=2,invocationCount=3)
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=1,enabled=false,dependsOnMethods= {"test 1"})
	public void test2()
	{
		System.out.println("test 2");
	}
	
	@AfterMethod
	   public void methodclose()
	   {
		System.out.println(" after method");
	   }
	
	@AfterTest
	public void browserclose()
	{
		System.out.println("browser close");
	}

}
