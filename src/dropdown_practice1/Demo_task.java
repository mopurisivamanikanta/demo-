package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("mani@gmail.com");
		driver.findElement(By.id("lastname")).sendKeys("mani@1234#");
		
		driver.findElement(By.id("email_address")).sendKeys("mani@gmail.com");
		driver.findElement(By.id("password")).sendKeys("mani@1234#");
		driver.findElement(By.id("password-confirmation")).sendKeys("mani@1234#");
		driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
		

	}

}
