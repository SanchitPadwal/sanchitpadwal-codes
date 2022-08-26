package selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenshotDT {
	
	public static void takeScreenshot(WebDriver driver , String name) throws IOException
	{
		String d = ScrrenshotDT.date();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\screenshot\\" + name + " " + d + ".png ");
		FileHandler.copy(source, destination);
	}
	
	public static String date()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime currentTime = LocalDateTime.now();
		String d=dtf.format(currentTime);
		return d;
	}
	
   public static void main(String[] args) throws IOException {
	WebDriver driver=Browser.launchBrowser("https://www.google.com");
	ScrrenshotDT.takeScreenshot(driver, "googleDT");
}	

}
