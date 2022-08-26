package selenium;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupChildBrowser {

	public static void main(String[] args) {
		
		WebDriver driver =  Browser.launchBrowser("https://demo.guru99.com/popup.php");
		WebElement input=driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
		
		//getWindowHandle()
		input.click();
	String mainAddress=driver.getWindowHandle();
		System.out.println(mainAddress);
//		
		//getWindowHandles()
		Set<String> handels =driver.getWindowHandles();
		Iterator<String> i= handels.iterator();
		
		while(i.hasNext())
		{
			String childAddress =  i.next();
			System.out.println(childAddress);
			if(!mainAddress.equalsIgnoreCase(childAddress))
			{
				driver.switchTo().window(childAddress);
    			driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
    	
    			
    			driver.findElement(By.name("btnLogin")).click();;
    			

				driver.close();
			}
		}
		driver.switchTo().window(mainAddress);
	}
}
