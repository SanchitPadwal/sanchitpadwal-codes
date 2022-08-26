package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumjar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Implicit Wait 
		WebElement search = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
        search.sendKeys("Selenium waits");
        search.sendKeys(Keys.RETURN);
        
        WebElement selenium = driver.findElement(By.xpath("//h3[text()='Waits - Selenium']"));
        selenium.click();
  	}

}
