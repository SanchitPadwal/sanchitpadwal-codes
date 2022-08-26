package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrame {

	public static void main(String[] args) {
		
		//======================================================
	//	WebDriver driver= Browser.launchBrowser("https://demo.automationtesting.in/Frames.html");
	//	driver.switchTo().frame("singleframe");   // by id
	//	driver.switchTo().frame(0);   //by index
//	    WebElement iframe=  driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));   // by WebElement
//		driver.switchTo().frame(iframe);
//		WebElement input=driver.findElement(By.xpath("//input[@type=\"text\"]"));
//		
//		input.sendKeys("sanchit");
//		driver.switchTo().defaultContent();
//		
		//=======================================================
		//iframe1
//		WebDriver driver = Browser.launchBrowser("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//		WebElement iframe=driver.findElement(By.xpath("//iframe[@name=\"packageListFrame\"]"));
//		driver.switchTo().frame(iframe);
//	    WebElement input=	driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.log']"));
//		input.click();
//		driver.switchTo().defaultContent();
		
		//iframe2
//        WebElement iframe= driver.findElement(By.xpath("//iframe[@name=\"packageFrame\"]"));		
//		driver.switchTo().frame(iframe);
//		WebElement input = driver.findElement(By.xpath("//a[text()=\"Actions\"]"));
//		input.click();
//		driver.switchTo().defaultContent();
		
		//iframe3
//		driver.switchTo().frame("classFrame");
//		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
//		
		
		//========================================================
		//parentFrame()
      	WebDriver driver =	Browser.launchBrowser("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");   //switch to outer iframe
		//driver.switchTo().frame("//iframe[@title=\"Iframe Example\"]");  //switch to inner iframe 
		
		driver.switchTo().frame(0);  // same swith to inner iframe bcz representing first frame
		//print text inner iframe
		String innerText = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
       System.out.println("Print text innerframe : " + innerText);
       
       //print the text outer iframe
       // before capture these text go back to parent iframe
       driver.switchTo().parentFrame();  // go back to immediate parent iframe

       WebElement parentText = driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
       System.out.println("Outer iframe text : " + parentText);
	}
}
