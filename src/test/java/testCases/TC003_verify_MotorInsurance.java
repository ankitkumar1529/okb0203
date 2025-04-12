package testCases;

import org.testng.annotations.Test;

import basePage.BaseClass;
import pageObject.Homepage;
import pageObject.MotorInsurance;
import pageObject.querryPopUp_Page;

public class TC003_verify_MotorInsurance extends BaseClass{
	
	
	@Test
	public void verify_motorInsurance_Functionality() throws InterruptedException
	{
		//close the query popup
		querryPopUp_Page qpp=new querryPopUp_Page(driver);
		qpp.closeQryPopUp();
		
		//choose Motor insurance from homepage
		Homepage hp=new Homepage(driver);
		hp.clickMotorInsurace();
		
		//set vehicle number
		MotorInsurance mi=new MotorInsurance(driver);
		mi.setVehicleNumber();
		mi.clickViewPlanBtn();
		mi.acceptAlert();
		//set Personal details
		mi.checkOwnerDetails();
		mi.setMobileNumber();
		mi.setEmail();
		mi.clickViewPricesBtn();
		// Confirm details popup	
//		mi.setExpiryDate();
		mi.setInsuranceCompany();
		mi.clickSubmitButton();
		// Claim Confirm popup
		mi.chooseRadioBtn();
		mi.clickSubmitButton2();
		
	}

}
