package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import basePage.BasePage;

public class ThankYou_page extends BasePage{

	public ThankYou_page(WebDriver driver)
	{
		super(driver);
	}
	


	@FindBy(xpath="//h1[normalize-space()='Thank You For Showing Interest']")
    WebElement text_msg;

	@FindBy(xpath="//a[normalize-space()='Continue to homepage']")
	WebElement btn_continueToHomepage;


	public void IsTextExist()
	{
		try {
		text_msg.isDisplayed();
		String msg=text_msg.getText();
		Assert.assertEquals(msg, "Thank You For Showing Interest");
		} catch(Exception e)
		{
			e.getMessage();
		}
	}
	
	public void clickContinueToHomepage()
	{
		btn_continueToHomepage.click();
	}
	
}
