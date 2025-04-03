package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class Homepage extends BasePage{
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}


	@FindBy(xpath="//div[contains(text(),'Motor Insurance')]")
	WebElement lnk_motor;
	
	public void clickMotorInsurace()
	{
		lnk_motor.click();
	}
}
