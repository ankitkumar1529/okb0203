package testCases;

import org.testng.annotations.Test;

import basePage.BaseClass;
import pageObject.querryPopUp_Page;

public class TC001_Close_QuerryPopUp_and_land_to_the_Homepage extends BaseClass{
	
	@Test
	public void closeQuerryPopup()
	{
		querryPopUp_Page closepopup=new querryPopUp_Page(driver);
		closepopup.closeQryPopUp();
		
	}
	

}
