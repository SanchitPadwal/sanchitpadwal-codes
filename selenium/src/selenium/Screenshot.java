package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver= Browser.launchBrowser("https://www.google.com/");
	    
		
		//simple screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourse=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\screenshot\\google.com");
		FileHandler.copy(sourse, destination);
		
		
	}

}
