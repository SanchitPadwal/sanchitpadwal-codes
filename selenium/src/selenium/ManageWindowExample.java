package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

public class ManageWindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver  =Browser.launchBrowser("https://www.google.com/");
		
		//print the page title
		String title=driver.getTitle();
		System.out.println(title);
		
		//print the current url
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//maximize
		driver.manage().window().maximize();
//		//minimize
//		driver.manage().window().minimize();
//		
		//Change the size of the browser
//        Dimension d = new Dimension(100, 200);
//		driver.manage().window().setSize(d);
//		
		//Change the position of the browser
//		Point p = new Point(500,600);
//		driver.manage().window().setPosition(p);
		
		
	}

}
