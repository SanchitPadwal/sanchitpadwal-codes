package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrollUpDown {

	public static void main(String[] args) {
	WebDriver driver=Browser.launchBrowser("https://demo.nopcommerce.com/");
		
		WebElement vote=driver.findElement(By.xpath("//button[text()='Vote']"));
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",vote);
		//js.executeScript("window.scrollBy(100,200)");
		

	}

}
