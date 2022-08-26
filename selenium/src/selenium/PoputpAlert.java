package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PoputpAlert {
	
	public static void main(String[] args) {
		
		WebDriver driver =  Browser.launchBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
//		WebElement text =  driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
//		text.click();
//		Alert a =  driver.switchTo().alert();
//		a.accept();   // to select ok or accept the alert
//		
//		WebElement send= driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
//		send.click();
//		Alert a1 = driver.switchTo().alert();
//		String str= a1.getText();
//		a1.dismiss();
//		System.out.println(str);
//		
	
		WebElement input=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		input.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sanchit");
		alert.accept();
		
	}

}
