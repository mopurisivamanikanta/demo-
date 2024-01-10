package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_Apparel {

	public  void Apparel() throws InterruptedException {
		

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");
	//APPAREL
	//shoes
		driver.findElement(By.xpath("(//a[@href=\"/apparel\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href=\"/shoes\"])[3]")).click();
		Thread.sleep(2000);
		WebElement moon=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select phd=new Select(moon);
		phd.selectByValue("5");
		Thread.sleep(2000);
		phd.selectByValue("6");
		Thread.sleep(2000);
		phd.selectByValue("10");
		Thread.sleep(2000);
		phd.selectByValue("11");
		Thread.sleep(2000);
		phd.selectByValue("15");
		Thread.sleep(2000);
		phd.selectByValue("0");
		WebElement win=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select rj=new Select(win);
		rj.selectByValue("6");
		Thread.sleep(2000);
		rj.selectByValue("9");
		Thread.sleep(2000);
		rj.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-14\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-15\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-16\"]")).click();
		Thread.sleep(2000);
		driver.get("https://demo.nopcommerce.com/adidas-consortium-campus-80s-running-shoes");
		Thread.sleep(2000);
		WebElement shoes=driver.findElement(By.xpath("//select[@name=\"product_attribute_9\"]"));
		Select us=new Select(shoes);
		us.selectByVisibleText("8");
		Thread.sleep(2000);
		us.selectByVisibleText("9");
		Thread.sleep(2000);
		us.selectByVisibleText("10");
		Thread.sleep(2000);
		us.selectByVisibleText("11");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"attribute-square\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-25\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		WebElement shirt=driver.findElement(By.xpath("//select[@name=\"product_attribute_11\"]"));
		Select uk=new Select(shirt);
		uk.selectByVisibleText("Small");
		Thread.sleep(2000);
		uk.selectByVisibleText("1X");
		Thread.sleep(2000);
		uk.selectByVisibleText("2X");
		Thread.sleep(2000);
		uk.selectByVisibleText("3X");
		Thread.sleep(2000);
		uk.selectByVisibleText("4X");
		Thread.sleep(2000);
		uk.selectByVisibleText("5X");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-27\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		Thread.sleep(2000);
		WebElement nike=driver.findElement(By.xpath("//select[@name=\"product_attribute_6\"]"));
		Select ru=new Select(nike);
		ru.selectByVisibleText("8");
		Thread.sleep(2000);
		ru.selectByVisibleText("9");
		Thread.sleep(2000);
		ru.selectByVisibleText("10");
		Thread.sleep(2000);
		ru.selectByVisibleText("11");
		Thread.sleep(2000);
		WebElement size=driver.findElement(By.xpath("//select[@name=\"product_attribute_7\"]"));
		Select ds=new Select(size);
		ds.selectByVisibleText("Please select");
		Thread.sleep(2000);
		ds.selectByVisibleText("White/Blue");
		Thread.sleep(2000);
		ds.selectByVisibleText("White/Black");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-24\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		
	//clothing
		driver.findElement(By.xpath("(//a[@href=\"/clothing\"])[3]")).click();
		Thread.sleep(2000);
		WebElement jeep=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select ct=new Select(jeep);
		ct.selectByValue("5");
		Thread.sleep(2000);
		ct.selectByValue("6");
		Thread.sleep(2000);
		ct.selectByValue("10");
		Thread.sleep(2000);
		ct.selectByValue("11");
		Thread.sleep(2000);
		ct.selectByValue("15");
		Thread.sleep(2000);
		ct.selectByValue("0");
		WebElement gap=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select rp=new Select(gap);
		rp.selectByValue("6");
		Thread.sleep(2000);
		rp.selectByValue("9");
		Thread.sleep(2000);
		rp.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"product_attribute_12\"]")).sendKeys("L-black");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-29\"]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		
	//ACCESSORIES
		driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[3]")).click();
		Thread.sleep(2000);
		WebElement position=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select pm=new Select(position);
		pm.selectByValue("5");
		Thread.sleep(2000);
		pm.selectByValue("6");
		Thread.sleep(2000);
		pm.selectByValue("10");
		Thread.sleep(2000);
		pm.selectByValue("11");
		Thread.sleep(2000);
		pm.selectByValue("15");
		Thread.sleep(2000);
		pm.selectByValue("0");
		WebElement sort=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select dn=new Select(sort);
		dn.selectByValue("6");
		Thread.sleep(2000);
		dn.selectByValue("9");
		Thread.sleep(2000);
		dn.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		WebElement size2=driver.findElement(By.xpath("//select[@name=\"product_attribute_13\"]"));
		Select ha=new Select(size2);
		ha.selectByVisibleText("Small");
		Thread.sleep(2000);
		ha.selectByVisibleText("Medium");
		Thread.sleep(2000);
		ha.selectByVisibleText("Large");
		Thread.sleep(2000);
		ha.selectByVisibleText("X-Large");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-31\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		Thread.sleep(2000);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
