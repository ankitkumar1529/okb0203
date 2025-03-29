package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class OTP_page extends BasePage {
	
	public OTP_page(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//input[@id='codeBox1']")
WebElement txt_box1;

@FindBy(xpath="//input[@id='codeBox2']")
WebElement txt_box2;

@FindBy(xpath="//input[@id='codeBox3']")
WebElement txt_box3;

@FindBy(xpath="//input[@id='codeBox4']")
WebElement txt_box4;

@FindBy(xpath="//button[@class='btn btn-danger px-4 validate']")
WebElement btn_validate;

public void setCodeBox1()
{
	txt_box1.sendKeys("0");
}

public void setCodeBox2()
{
	txt_box2.sendKeys("0");
}

public void setCodeBox3()
{
	txt_box3.sendKeys("0");
}

public void setCodeBox4()
{
	txt_box4.sendKeys("0");
}

public void clickValidateBtn()
{
	btn_validate.click();
}

}
