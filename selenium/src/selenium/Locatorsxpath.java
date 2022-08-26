package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locatorsxpath {
	
	public static void main(String[] args) {
		
		WebDriver driver= Browser.launchBrowser("https://www.ebay.com/");
		
		//Xpath By attribute
		//Xpath By text
		//Xpath By contains
		//Xpath By index
		//Absolute Xpath
		//Relative Xpath
		
		//Xpath By attribute
	//	WebElement attribute= driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	//	attribute.click();
		
		//Xpath By text
	//    WebElement text = driver.findElement(By.xpath("//a[text()='Home & Garden']"));
	//    text.click();
		
		//Xpath By contains
	//	WebElement contains = driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-')]"));
	//	contains.sendKeys("Mobile");
		
		//Xpath By index
	//	WebElement index=driver.findElement(By.xpath("//li[@class=\"hl-cat-nav__js-tab\"][1]"));
	//	index.click();
	
		//Absolute Xpath
	//   WebElement absolute=	driver.findElement(By.xpath("//header/table/tbody/tr/td/h1/a"));
    //   absolute.click();
	}

}
