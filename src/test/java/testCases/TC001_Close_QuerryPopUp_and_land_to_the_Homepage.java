package testCases;

import org.testng.annotations.Test;

import basePage.BaseClass;
import pageObject.Okb_Homepage;

public class TC001_Close_QuerryPopUp_and_land_to_the_Homepage extends BaseClass{
	
	@Test
	public void closeQuerryPopup()
	{
		Okb_Homepage closepopup=new Okb_Homepage(driver);
		closepopup.closeQryPopUp();
		
	}
	

}
