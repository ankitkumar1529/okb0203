package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class querryPopUp_Page extends BasePage{

	public querryPopUp_Page(WebDriver driver)
	{
		super(driver);
	}

	//to close the query popup after land to the okbima page
	@FindBy(xpath="//div[@id='call_scheduleModal']//button[@aria-label='Close']")
	WebElement btn_close;
	
	//first step of query popup
	@FindBy(xpath="//select[@id='type']")
	WebElement yourQuerryDropDown ;
	
	@FindBy(xpath="//input[@id='date_id_2025-04-11']")
	WebElement input_date;
	
	@FindBy(xpath="//div[@id='time_slots_wrapper']//div[1]")
	WebElement input_time;
	
	@FindBy(xpath="//button[@id='confirm_schedule']")
	WebElement btn_confirmSchedule;
	

	//first step of query popup
	@FindBy(xpath="//input[@id='name']")
	WebElement txt_name;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement txt_phone;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_email;
	
	@FindBy(xpath="//button[normalize-space()='Schedule Event']")
	WebElement btn_scheduleEvent ;
	
	
	public void closeQryPopUp()
	{
		btn_close.click();
	}
	
	public void setYourQueryDropDown()
	{
		yourQuerryDropDown.click();
	}
	
	public void setDate()
	{
		input_date.click();
	}
	
	public void setTime()
	{
		input_time.click();
	}
	
	public void clickConfirmSchedule()
	{
		btn_confirmSchedule.click();
	}
	
	
	public void setName()
	{
		txt_name.sendKeys("Test okbima");
	}

	public void setPhoneNumber()
	{
		txt_phone.sendKeys("9876543218");
	}
	
	public void setEmail()
	{
		txt_email.sendKeys("test@okbima.com");
	}
	
	public void clickScheduleEventBtn()
	{
		btn_scheduleEvent.click();
	}
	
	
}
