package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementMethod {

	public static void main(String[] args) {
		
	//	WebDriver driver=Browser.launchBrowser("http://demo.guru99.com/test/radio.html");

		//isSelected() : return type boolean true / false
//		WebElement option=driver.findElement(By.xpath("//input[@value=\"Option 1\"]"));
//		boolean b =option.isSelected();
//		System.out.println(b);  // false because not select option
//		
//		option.click();  // click operation perform
//		boolean b1= option.isSelected();
//		System.out.println(b1);   // true because option is selected
//		
		//isEnabled()  : return type boolean true/false
		WebDriver driver=Browser.launchBrowser("https://omayo.blogspot.com/");
//		WebElement button1=driver.findElement(By.xpath("//button[@id=\"but1\"]"));
//        boolean btn1=button1.isEnabled();
//		System.out.println(btn1);  // false because button2 is disable on web page
//		
//		WebElement button2= driver.findElement(By.xpath("//button[@id=\"but2\"]"));
//		boolean btn2 = button2.isEnabled();
//		System.out.println(btn2);   // true because button1 is enable 
//		
		//isDisplayed() ; return a boolean value 
		WebElement hiddenButton= driver.findElement(By.id("hbutton"));
		boolean hidbtn= hiddenButton.isDisplayed();
	    System.out.println(hidbtn);    //false because button is hidden
	    
	    WebElement showButton=driver.findElement(By.xpath("//input[@type='submit']"));
	    boolean shbtn=showButton.isDisplayed();
	    System.out.println(shbtn);   //true because button is show
	}
}
