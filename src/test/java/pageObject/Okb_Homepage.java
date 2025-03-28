package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class Okb_Homepage extends BasePage{

	public Okb_Homepage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='call_scheduleModal']//button[@aria-label='Close']")
	WebElement btn_close;
	
	public void closeQryPopUp()
	{
		btn_close.click();
	}
}
