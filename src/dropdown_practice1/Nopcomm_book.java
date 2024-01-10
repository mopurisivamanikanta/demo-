package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_book {

	public  void book ()throws InterruptedException {
	

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");
		
	//BOOKS
		driver.findElement(By.xpath("(//a[@href=\"/books\"])[3]")).click();
		Thread.sleep(2000);
		WebElement edge=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select pk=new Select(edge);
		pk.selectByValue("5");
		Thread.sleep(2000);
		pk.selectByValue("6");
		Thread.sleep(2000);
		pk.selectByValue("10");
		Thread.sleep(2000);
		pk.selectByValue("11");
		Thread.sleep(2000);
		pk.selectByValue("15");
		Thread.sleep(2000);
		pk.selectByValue("0");
		WebElement size4=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select rp=new Select(size4);
		rp.selectByValue("6");
		Thread.sleep(2000);
		rp.selectByValue("9");
		Thread.sleep(2000);
		rp.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		Thread.sleep(2000);		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

	}

}

