package fb_pracce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoblaze_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.xpath("//a[@id=\"signin2\"]")).click();
		Thread.sleep(2000);
		
		}

}
