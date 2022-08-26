package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	//create generic method and use other concept
   public static WebDriver launchBrowser(String url) {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\seleniumjar\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get(url);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  return driver;
   }
}