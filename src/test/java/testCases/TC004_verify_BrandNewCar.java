package testCases;

import org.testng.annotations.Test;

import basePage.BaseClass;
import pageObject.Homepage;
import pageObject.MotorInsurance;
import pageObject.NewVehicleJourney;
import pageObject.querryPopUp_Page;

public class TC004_verify_BrandNewCar extends BaseClass{
	
	@Test
	public void verifyBrandNewCar() throws InterruptedException
	{
		//close the query popup
		querryPopUp_Page qpp=new querryPopUp_Page(driver);
		qpp.closeQryPopUp();
		
		//choose motor insurance from homepage
		Homepage hp=new Homepage(driver);
		hp.clickMotorInsurace();
		
		//Click on brand new vehicle link
		NewVehicleJourney nwj=new NewVehicleJourney(driver);
		nwj.clickBrandNewCarLink();
		
		//choose RTO Location as Delhi
		nwj.setRTOlocation();
		nwj.chooseRTOLocationAsDL01();
		
		//choose Brand Type as Mahindra
		nwj.setBrandType();
		nwj.chooseBrandTypeMahindra();
		
		//Choose Model as THAR
		nwj.setModel();
		nwj.chooseModelAsThar();
		
		//Choose Fuel type
		nwj.setFuelTypeAsPetrol();
		
		//Choose varient type
		nwj.chooseVarientType();
		
		//personal details name only
		nwj.setName();
		
		// Set Personal details from Homepage POM from pageObject
		MotorInsurance mi=new MotorInsurance(driver);
		mi.setMobileNumber();
		mi.setEmail();
		mi.clickViewPricesBtn();
		
		// Confirm details popup	
		mi.setExpiryDate();
		mi.setInsuranceCompany();
		mi.clickSubmitButton();
		
		// Claim Confirm popup
		mi.chooseRadioBtn();
		mi.clickSubmitButton2();
	
		
	}

}
