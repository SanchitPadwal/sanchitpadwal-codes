package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
       public static void main(String[] args) {
		WebDriver driver=  Browser.launchBrowser("https://demo.guru99.com/test/newtours/register.php");
		WebElement country=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		
		Select s = new Select(country);
		//Method of Select Class : 
		
	//	s.selectByIndex(3);        //select with help of index
	//	s.selectByValue("AMERICAN SAMOA");  //select with help of value
		s.selectByVisibleText("ANGOLA");  // select with the help of visible text
		

		
	}
}
