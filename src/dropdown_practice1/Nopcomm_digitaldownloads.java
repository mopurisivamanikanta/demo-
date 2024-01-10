package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_digitaldownloads {
	
	public void digitaldownloads() throws InterruptedException {
		
		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");

		
	//Digital downloads
		driver.findElement(By.xpath("(//a[@href=\"/digital-downloads\"])[3]")).click();
		Thread.sleep(2000);
		WebElement size3=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select en=new Select(size3);
		en.selectByValue("5");
		Thread.sleep(2000);
		en.selectByValue("6");
		Thread.sleep(2000);
		en.selectByValue("10");
		Thread.sleep(2000);
		en.selectByValue("11");
		Thread.sleep(2000);
		en.selectByValue("15");
		Thread.sleep(2000);
		en.selectByValue("0");
		WebElement display=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select df=new Select(display);
		df.selectByValue("6");
		Thread.sleep(2000);
		df.selectByValue("9");
		Thread.sleep(2000);
		df.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		WebElement ref_r=driver.findElement(By.xpath("//input[@class=\"enter-price-input\"]"));
		ref_r.clear();
		ref_r.sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-35\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		Thread.sleep(2000);
		WebElement prize=driver.findElement(By.xpath("//input[@class=\"enter-price-input\"]"));
		prize.clear();
		prize.sendKeys("60");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
		
		
		

	}

}
