package SeleniumTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGkeyword {
	
	//Priority
	//InvocationCount
    //Enabled="false"  or "true"
	//timeOut(time in millisecond)
	//DependsOnMethod
	
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
	
	@Test(invocationCount = 2 )
	public void Test1()
	{
		System.out.println("Test1 executed...");
	}
	
	@Test(priority = 2)
	public void Test2()
	{
		System.out.println("Test2 executed...");
	}
	
	@Test(enabled = false)
	public void ABC()
	{
		System.out.println("ABC method ...");
	}
	
	@Test
	public void BeforeMethod()
	{
		System.out.println("Before method...");
	}
	
	@Test
	public void AfterMethod()
	{
		System.out.println("After method...");
	}
	
	
}
