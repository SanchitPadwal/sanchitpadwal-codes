package SeleniumTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Sample {
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before class ...");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class...");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test1 executed...");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2 executed...");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before method...");
	}
	
	@AfterMethod 
	public void AfterMethod()
	{
		System.out.println("After method...");
	}
	
	

}


