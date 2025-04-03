package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basePage.BasePage;

public class MotorInsurance extends BasePage {

	WebDriver driver;
	public MotorInsurance(WebDriver driver)
	{
		super(driver);
	}

//Vehicle number registration page	
	@FindBy(xpath="//input[@id='vehicle_registration_no']")
	WebElement txt_vehicleNumber;
	

	@FindBy(xpath="//input[@id='viewPlan']")
	WebElement btn_viewPlan;
	
// Vechile type popup like Two wheeler or four wheeler	
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement alrt_popup;
	
// personal details popup	
	@FindBy(xpath="//input[@id='owner_name']")
	WebElement txt_ownerName;
	
	@FindBy(xpath="//input[@id='owner_mobile']")
	WebElement txt_mobile;
	
	@FindBy(xpath="//input[@id='owner_email']")
	WebElement txt_email;
	
	@FindBy(xpath="//button[normalize-space()='View Prices']")
	WebElement btn_viewPrices;

// Confirm details popup
	@FindBy(xpath="//input[@id='insurance_upto_byPaysprintModel']")
	WebElement txt_expireDate;
	
	@FindBy(xpath="//select[@id='insuranceCompanySelect']")
	WebElement drop_InsuranceCompany;
	
	@FindBy(xpath="//button[@id='insurerSubmit']")
	WebElement btn_insurerSubmit ;
	
// Claim Confirm popup
	@FindBy(xpath="//div[@class='form-check form-check-inline clm_cnfrm'][normalize-space()='Yes']")
	WebElement radioBtn_yes ;
	
	@FindBy(xpath="//button[@id='ncbSubmit']")
	WebElement btn_submitBtn2 ;


		
//Vehicle number registration page methods		
	public void setVehicleNumber()
	{
		txt_vehicleNumber.sendKeys("UP12AP4941");
	}
	
	public void clickViewPlanBtn()
	{
		btn_viewPlan.click();
	}

// Vechile type popup like Two wheeler or four wheeler	
	public void acceptAlert()
	{
		alrt_popup.click();
	
	}
	
// personal details popup		
	public void checkOwnerDetails()
	{
	try {
	String inputText=txt_ownerName.getAttribute("value");
	if(inputText !=null && !inputText.isEmpty())
	{
		Assert.assertNotNull(inputText);
		System.out.println("Assert is pass and i'm getting value"+" "+inputText);
		
	} 
	}catch (Exception e)
	{
		System.out.println(e.getMessage());
		
	}
	
	}
	
	public void setMobileNumber() throws InterruptedException
	{
		Thread.sleep(2000);
		txt_mobile.sendKeys("8974561230");
	}
	
	public void setEmail()
	{
		txt_email.sendKeys("test@okbima.com");
	}
	
	public void clickViewPricesBtn()
	{
		btn_viewPrices.click();
	}
	
// Confirm details popup	
	public void setExpiryDate()
	{
		txt_expireDate.sendKeys("02/02/2020");
	}
	
	public void setInsuranceCompany()
	{
		drop_InsuranceCompany.click();
		Select select =new Select(drop_InsuranceCompany);
		select.selectByVisibleText("Care Health Insurance");
		
	}
	
	public void clickSubmitButton()
	{
		btn_insurerSubmit.click();
	}
	
// Claim Confirm popup
	public void chooseRadioBtn()
	{
		radioBtn_yes.click();
	}
	
	public void clickSubmitButton2()
	{
		btn_submitBtn2.click();
	}
	
}
