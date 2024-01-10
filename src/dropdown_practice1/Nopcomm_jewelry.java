package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_jewelry {
	
	public void jewelry() throws InterruptedException {
		
		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");

		//JEWELRY
				driver.findElement(By.xpath("(//a[@href=\"/jewelry\"])[3]")).click();
				Thread.sleep(2000);
				WebElement size6=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
				Select re=new Select(size6);
				re.selectByValue("5");
				Thread.sleep(2000);
				re.selectByValue("6");
				Thread.sleep(2000);
				re.selectByValue("10");
				Thread.sleep(2000);
				re.selectByValue("11");
				Thread.sleep(2000);
				re.selectByValue("15");
				Thread.sleep(2000);
				re.selectByValue("0");
				WebElement size7=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
				Select cv=new Select(size7);
				cv.selectByValue("6");
				Thread.sleep(2000);
				cv.selectByValue("9");
				Thread.sleep(2000);
				cv.selectByValue("3");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id=\"rental_start_date_40\"]")).sendKeys("1-1-2024");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id=\"rental_end_date_40\"]")).sendKeys("1-2-2024");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-40\"]")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
				Thread.sleep(2000);

	}

}
