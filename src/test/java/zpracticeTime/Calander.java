package zpracticeTime;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calander {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://development.okbima.com/life-insurance/term-insurance-plans");
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
/*		WebElement selectYear=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select sel=new Select(selectYear);
		sel.selectByVisibleText("1998");
		
		WebElement selectMonth=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select sel1=new Select(selectMonth);
		sel1.selectByVisibleText("Mar");
		
		//a[@class='ui-state-default ui-state-hover']
		driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
*/
	
//		List<WebElement> nextBtn=driver.findElements(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
//		System.out.println(nextBtn.size());
		List<WebElement> nextBtn1=driver.findElements(By.tagName("a"));
//		System.out.println("Linke"+" "+nextBtn1.size());
		
	    
		for(int i=0; i<nextBtn1.size(); i++)
		{
			WebElement	ele=nextBtn1.get(i);
//			System.out.println(ele.getText());
//			System.out.println(ele.getAttribute("href"));
			String inputText=ele.getText();
			String URL=ele.getAttribute("href");
			if(URL!=null)
			{
				System.out.println(inputText+" "+URL);
			}
			
		}
		System.out.println("noumber of link i present :"+" "+nextBtn1.size());
	}

}
