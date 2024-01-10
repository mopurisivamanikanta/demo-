package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_login {

	public  void login() throws InterruptedException {
	

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");
	//register
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("mani");
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("reddy");
		WebElement day=driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
		Select ab=new Select(day);
		ab.selectByValue("12");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
		Select cd=new Select (month);
		cd.selectByVisibleText("August");
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
		Select ef=new Select(year);
		ef.selectByVisibleText("1997");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("mopmanikanta@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("charani PVT.LTD");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("mani@123");
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("mani@123#");
		driver.findElement(By.xpath("//button[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[3]")).click();
		
	//login
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fcomputers");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("mopmanikanta@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("mani@123#");
		driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
		
						
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
