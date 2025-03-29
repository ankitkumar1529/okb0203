package basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--headless=new");
//		driver =new ChromeDriver(opt);
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://development.okbima.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass()
	public void teardown()
	{
		driver.close();
	}
	
	

}
