package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumjar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//define wait
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.RETURN);
		
		 //perform use many condition method 
		
		WebElement selenium =  driver.findElement(By.xpath("//h3[text()=\"Selenium\"]"));
		selenium.click();
	}

}
