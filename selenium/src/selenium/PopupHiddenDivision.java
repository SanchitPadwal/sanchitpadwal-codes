package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupHiddenDivision {
	
	public static void main(String[] args) {
		
		WebDriver driver=Browser.launchBrowser("https://www.facebook.com/");
		WebElement create =  driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		create.click();
		
		WebElement firstName= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstName.sendKeys("Sanchit Padwal");
	}

}
