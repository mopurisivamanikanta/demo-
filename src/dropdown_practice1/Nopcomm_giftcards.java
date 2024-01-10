package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_giftcards {
	
	public void giftcards() throws InterruptedException {
		
		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");

		//GIFTCARDS
				driver.findElement(By.xpath("(//a[@href=\"/gift-cards\"])[3]")).click();
				Thread.sleep(2000);
				WebElement size9=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
				Select kl=new Select(size9);
				kl.selectByValue("5");
				Thread.sleep(2000);
				kl.selectByValue("6");
				Thread.sleep(2000);
				kl.selectByValue("10");
				Thread.sleep(2000);
				kl.selectByValue("11");
				Thread.sleep(2000);
				kl.selectByValue("15");
				Thread.sleep(2000);
				kl.selectByValue("0");
				WebElement size8=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
				Select mn=new Select(size8);
				mn.selectByValue("6");
				Thread.sleep(2000);
				mn.selectByValue("9");
				Thread.sleep(2000);
				mn.selectByValue("3");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("mani");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"recipient-email\"]")).sendKeys("mani@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("msmani");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"sender-email\"]")).sendKeys("msmani@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//textarea[@class=\"message\"]")).sendKeys("giftcards");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-43\"]")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("ravi");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("ravindra");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//textarea[@class=\"message\"]")).sendKeys("giftcard2");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("indra");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("prasad");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//textarea[@class=\"message\"]")).sendKeys("giftcard3");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-45\"]")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				
				
				
				
				
				
				
	}

}
