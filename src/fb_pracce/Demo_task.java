package fb_pracce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_task {
	public static void main(String[] args) {
		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.cssSelector("input[id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		
	}

}
