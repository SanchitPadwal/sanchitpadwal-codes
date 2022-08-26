package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementAndFindElements {
	
	public static void main(String[] args) {
		
		WebDriver driver =  Browser.launchBrowser("https://demo.nopcommerce.com/");

		//findElement() --> Return the single webelement 
		
		//1 scenario
//      WebElement input = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
//		input.sendKeys("abcd");
		
		//2 scenario locator point to multiple webelement then still findElement method return single webelement
       // which is first element
//		WebElement element =  driver.findElement(By.xpath("//div[@class='footer-upper']"));
//      String str = element.getText();
//		System.out.println(str);
//		
		//3  scenario 3 suppose in webpage nnot present element then throws NoSuchElementException 
	
	 //=================================================================
		
	// findElements() --> Returns multple webelemnt depends upon the locator which we pass
   
	     List<WebElement> links = driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
	     System.out.println(" Num of element capture :  " + links.size());
	     for(WebElement ele:links)
	     {
	    	 System.out.println(ele.getText());
	     }
	     
	     
	     
	   //2 scenario
		 // return single webelement and return multiple webelement then still return type is List<WebElement>
		
       
	 	//3  scenario :  suppose in webpage nnot present element then  no argument not exception throws 
	}

}
