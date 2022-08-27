package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	
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
		
		@Parameters({"a" , "s"})
		@Test(priority = 2)
		public void Test2(int a ,String s)
		{
			System.out.println("Test2 executed...");
			System.out.println(a);
			System.out.println(s);
		}
      
		@Parameters ({"a","b","str"})
		@Test(priority = 1)
        public void ABC(int a, int b , String str)
        {
        	System.out.println("Abc executed...");
        	System.out.println(a);
        	System.out.println(b);
        	System.out.println(str);
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




