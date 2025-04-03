package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class NewVehicleJourney extends BasePage{

	public NewVehicleJourney(WebDriver driver)
	{
		super(driver);
	}
//locators	
//Click on Brand new Car	
	@FindBy(xpath="//a[normalize-space()='Click Here']")
	WebElement link_brandNewCar;
	
//Choose RTO location
	@FindBy(xpath="//input[@id='rtaInput']")
	WebElement txt_RTOlocation;

	//RTO location DL01
	@FindBy(xpath="//label[@class='city_location select_rto']")
	WebElement dl01_RTOlocation;
	
//Choose brand name 
	@FindBy(xpath="//input[@id='new_brand']")
	WebElement txt_BrandType;
	
	//Brand type Mahindra
	@FindBy(xpath="//p[normalize-space()='MAHINDRA']")
	WebElement mahindra_BrandType;
	
	
//Choose car model 
	@FindBy(xpath="//input[@id='car-model']")
	WebElement txt_Model;
	
	//Model is THAR
	@FindBy(xpath="//label[normalize-space()='THAR']")
	WebElement model_THAR;
	
//Choose Fuel type
	@FindBy(xpath="//label[normalize-space()='PETROL']")
	WebElement btn_Petrol;
	
//Choose Varient Type
	@FindBy(xpath="//input[@id='car-model-variant']")
	WebElement txt_varientType;
	
	//choose varient type
	@FindBy(xpath="//label[normalize-space()='LX 4-STR CONVERTIBLE PETROL AT']")
	WebElement select_varientType;
	
//Personal details
	@FindBy(xpath="//input[@id='owner_name']")
	WebElement txt_name ;

	
//Methods
//Click on Brand new Car
	public void clickBrandNewCarLink()
	{
		link_brandNewCar.click();
	}

	//choose RTO Location as Delhi	
	public void setRTOlocation()
	{
		txt_RTOlocation.sendKeys("dl01");
	}
	
	
	public void chooseRTOLocationAsDL01() throws InterruptedException
	{
		Thread.sleep(1000);
		dl01_RTOlocation.click();
	}
	
	//choose Brand Type as Mahindra
	public void setBrandType()
	{
		txt_BrandType.sendKeys("mahindra");
	}
	
	public void chooseBrandTypeMahindra() throws InterruptedException
	{
		Thread.sleep(1000);
		mahindra_BrandType.click();
	}
	
	//Choose Model as THAR
	public void setModel()
	{
		txt_Model.sendKeys("thar");
	}
	
	public void chooseModelAsThar() throws InterruptedException
	{
		Thread.sleep(1000);
		model_THAR.click();
	}
	
	//Choose Fuel type
	public void setFuelTypeAsPetrol()
	{
		btn_Petrol.click();
	}
	
	//choose varient type
	public void chooseVarientType()
	{
		select_varientType.click();
	}
	
	//personal details name only, other details taken from MoterInsurance page
	public void setName()
	{
		txt_name.sendKeys("test okbima");
	}
	
	
	
	
}
