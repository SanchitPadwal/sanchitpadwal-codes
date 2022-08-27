package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert {
	
	@Test
	public void demoTest()
	{

		Assert.assertTrue(true);  // passed
		Assert.assertEquals("sanchit", "Sanchit"); 
		//fails the rest of the statement stoped not continue
		Assert.assertEquals("padwal", "padwal");   //pass
		System.out.println("Successfully passed");
		


	}

}

// Hard Assert when assertions get fail immediate exceptions will be thrown for current @Test