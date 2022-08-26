package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitGenric {
	
	public static WebElement waitForElementPresent(WebDriver driver , By locator , int timeout)
	{
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		myWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\seleniumjar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		
        By elelocator = (By.xpath("//h3[text()=\"Selenium\"]"));
		waitForElementPresent(driver , elelocator , 10).click();

		
		
	}

}
