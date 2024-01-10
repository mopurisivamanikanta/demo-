package fb_pracce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class calender_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devi\\Downloads\\chromedriver_win32 (1) 113.0\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
				
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2025");

		String year="2025";
		String month="April";
		String Day="22";
		
driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			
			String mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			if(yr.equals(year) && mnth.equals(month));
			{
				
				break;
			}
		}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(Day)) {
				dt.click();
				break;
			}
			
		}
	
	
	
	}
}
			
			
			
			
			
		
	


