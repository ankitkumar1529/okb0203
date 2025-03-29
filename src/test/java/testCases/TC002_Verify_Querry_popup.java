package testCases;

import org.testng.annotations.Test;

import basePage.BaseClass;
import pageObject.OTP_page;
import pageObject.ThankYou_page;
import pageObject.querryPopUp_Page;

public class TC002_Verify_Querry_popup extends BaseClass {
	
	@Test()
	public void verifyQuerryPopUp()
	{
		//methods of querry Popup before OTP
		querryPopUp_Page closepopup =new querryPopUp_Page(driver);
		closepopup.setYourQueryDropDown();
		closepopup.setDate();
		closepopup.setTime();
		closepopup.clickConfirmSchedule();
		closepopup.setName();
		closepopup.setPhoneNumber();
		closepopup.setEmail();
		closepopup.clickScheduleEventBtn();
		
		//OTP verify
		OTP_page otp=new OTP_page(driver);
		otp.setCodeBox1();
		otp.setCodeBox2();
		otp.setCodeBox3();
		otp.setCodeBox4();
		otp.clickValidateBtn();
		
		//Verify landed to Thankyou page successfully
		ThankYou_page typ=new ThankYou_page(driver);
		typ.IsTextExist();
		typ.clickContinueToHomepage();
		
	}

}
