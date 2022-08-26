package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsExample {
	         
	public static void main(String[] args) {
		WebDriver driver= Browser.launchBrowser("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        
		// Locators : TagName , ID , Name ,ClassName , cssSelectors , LinkText , PartailLinkText 
		
		//By TagName
	//	WebElement tagname= driver.findElement(By.tagName("span"));
	//	tagname.click();
	//===============================================
		
		//By Id
	//	WebElement id= driver.findElement(By.id("gh-p-1"));
	//	id.click();
   //================================================
		
		//By Name
	//	WebElement name= driver.findElement(By.name("_sacat"));
	//	name.click();
	//================================================
		
		//By ClassName
	//	WebElement classname=driver.findElement(By.className("gh-spr"));
	//	classname.click();
	//===============================================
		
		//By LinkText
	//	WebElement linktext=driver.findElement(By.linkText("Electronics"));
	//	linktext.click();
		
		//By Partial LinkText
	//	 WebElement partialText=driver.findElement(By.partialLinkText("Industrial"));
	//   partialText.click();
	}
}
