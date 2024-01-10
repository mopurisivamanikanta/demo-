package fb_pracce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Swag_T {

	public static void main(String[] args) {
		
		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://practice.automationtesting.in/");


		driver.findElement(By.linkText("My Account")).click();

		driver.findElement(By.id("reg_email")).sendKeys("msivamanikantareddy@gmail.com");

		driver.findElement(By.id("reg_password")).sendKeys("mani@123#");

		driver.findElement(By.name("register")).click();

		driver.findElement(By.id("username")).sendKeys("msivamanikantareddy@gmail.com");

		driver.findElement(By.id("password")).sendKeys("mani@123#");

		driver.findElement(By.name("login")).click();

		WebElement Sappa = driver.findElement(By.xpath("//strong[text()=\"Sappaaishu485\"]"));

		if (Sappa.isDisplayed()) 
		{
			System.out.println("Login successfull");
		} else {
			System.out.println("Login failed");
		}
		System.out.println(Sappa.getText());

		



	}
}
		
	
		