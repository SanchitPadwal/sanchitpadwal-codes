package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
//		
		//contextClick() :- RightClick
		
//		WebDriver driver = Browser.launchBrowser("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		
//		Actions action = new Actions(driver);
//		action.contextClick(rightClick);  //used to right click on webpage
//
//		action.perform();  // use to perform action
//		
//		
		//=======================================================
//		
		//moveToElement : mouse move to element 
		
//		WebDriver driver = Browser.launchBrowser("https://demoqa.com/menu/");
//
//        Actions action = new Actions(driver); 
//		WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']")); 
	//  WebElement subList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")); 
//		WebElement SubsubList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")); 
//		WebElement SubsubItem = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")); 
//		
//		
//		
//		
//		action.moveToElement(mainItem2).build().perform();  //mouseover to mainItem tab
//		action.moveToElement(SubsubList).build().perform();   //mouseover to subsublist tab
//		action.moveToElement(SubsubItem).click().build().perform();  //mouseover to subsubitem tab
//		
		
		// ===========================================================
		
		//Drag And Drop
		WebDriver driver = Browser.launchBrowser("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//source
		WebElement source = driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		//target
		WebElement target = driver.findElement(By.xpath("//div[@id=\"box104\"]"));
 		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);
		action.clickAndHold(source).moveToElement(target).release().build().perform();
 		action.build().perform();
	}

}


//===================================
//Action Class : in selenium built in feature provided by selenium for handling keyboard and mouse 
                                                                    