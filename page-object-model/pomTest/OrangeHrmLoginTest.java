package pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.grid.Main;

import pom.OrangeHrmLogin;

public class OrangeHrmLoginTest {
	
	public void OrangeHrmLoginValidCredintials() 
	{
	   WebDriver driver =  Browser.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	   OrangeHrmLogin orangehrmllogin = new OrangeHrmLogin(driver);
	   orangehrmllogin.enterUserId("Admin");
	   orangehrmllogin.enterPassword("admin123");
	   orangehrmllogin.submitClick();
	}
	
//	public void OrangeHrmLoginWithOnlyUserID() 
//	{
//		WebDriver driver =  Browser.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
//		OrangeHrmLogin orangehrmllogin = new OrangeHrmLogin(driver);
//		orangehrmllogin.enterUserId("Admin");
//	    orangehrmllogin.submitClick();
//	}
	
//	public void OrangeHrmLoginWithOnlyPassword()
//	{
//	  WebDriver driver =  Browser.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
//	  OrangeHrmLogin orangehrmllogin = new OrangeHrmLogin(driver);
//    orangehrmllogin.enterPassword("admin123");
//    orangehrmllogin.submitClick();	
//	
//	}

	
	
	public static void main(String[] args) {
		OrangeHrmLoginTest  orangehrmlogintest = new OrangeHrmLoginTest ();
		orangehrmlogintest.OrangeHrmLoginValidCredintials();
   //   orangehrmlogintest.OrangeHrmLoginWithOnlyUserID();
  //    orangehrmlogintest.OrangeHrmLoginWithOnlyPassword();
	}
	

}


// Test 
// 1. OrangeHrmLoginValidCredintials
// 2. OrangeHrmLoginWithOnlyUserID
// 3. OrangeHrmLoginWithOnlyPassword

