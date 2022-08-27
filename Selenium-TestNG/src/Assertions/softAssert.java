package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	//globally define
	SoftAssert assertion = new SoftAssert(); 
	SoftAssert assertion1 = new SoftAssert();
	
	@Test
	public void demoTest()
	{
		assertion.assertTrue(true);               // pass
		assertion.assertEquals("sanchit", "Sanchit");    // fail : s and S change 
		
		assertion.assertEquals("padwal", "padwal");     //pass
		System.out.println("successful passed!");
		assertion.assertAll();
	}
	
	
	@Test
	public void demo1()
	{
	   assertion1.assertTrue(true);
	   assertion1.assertEquals("sanchit", "sanchit");    // pass
	   assertion1.assertEquals("padwal", "padwal");     //pass
	   System.out.println("successful passed  demo1!");
	   assertion1.assertAll();
				
	}

}


// Soft assert when assertion get fail then it record the failure event and continue the execution ,
 //   it will not fails the Test

//Method of SoftAssert
//1. assertEquals
//2. assertNotEquals
//3. assertNotNull
//4. assertAll


//In soft Assert a object create SoftAssert in class suppose two method then two object separate created