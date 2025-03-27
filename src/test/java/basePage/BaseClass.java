package basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}
