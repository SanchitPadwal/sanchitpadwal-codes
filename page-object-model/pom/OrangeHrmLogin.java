package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLogin {
 
	@FindBy (xpath = "//input[@name=\"username\"]") private WebElement userName;
	@FindBy (xpath = "//input[@name=\"password\"]") private WebElement password;
	@FindBy (xpath="//button[@type=\"submit\"]") private WebElement submit;
	@FindBy (xpath="//p[text()=\"Forgot your password? \"]") private WebElement forgot;
	
	public OrangeHrmLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String user)
	{
		userName.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void submitClick()
	{
		submit.click();
	}
	
	public void forgotClick()
	{
		forgot.click();
	}
	
}
