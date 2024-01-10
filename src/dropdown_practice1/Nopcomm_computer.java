package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_computer {

	public  void  computer ()throws InterruptedException {
	

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");
	//COMPUTERS
	//desktop
		driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href=\"/desktops\"])[3]")).click();
		WebElement sort=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select xz=new Select(sort);
		xz.selectByValue("5");
		Thread.sleep(2000);
		xz.selectByValue("6");
		Thread.sleep(2000);
		xz.selectByValue("10");
		Thread.sleep(2000);
		xz.selectByValue("11");
		Thread.sleep(2000);
		xz.selectByValue("15");
		Thread.sleep(2000);
		xz.selectByValue("0");
		WebElement page=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select sa=new Select(page);
		sa.selectByValue("6");
		Thread.sleep(2000);
		sa.selectByValue("9");
		Thread.sleep(2000);
		sa.selectByValue("3");
		
		driver.get("https://demo.nopcommerce.com/build-your-own-computer");
		WebElement processor=driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));
		Select sp=new Select(processor);
		sp.selectByValue("0");
		Thread.sleep(2000);
		sp.selectByValue("1");
		Thread.sleep(2000);
		sp.selectByValue("2");
		WebElement ram=driver.findElement(By.xpath("//select[@id=\"product_attribute_2\"]"));
		Select si=new Select(ram);
		si.selectByValue("0");
		Thread.sleep(2000);
		si.selectByValue("3");
		Thread.sleep(2000);
		si.selectByValue("4");
		Thread.sleep(2000);
		si.selectByValue("5");
		driver.findElement(By.xpath("//input[@id=\"product_attribute_3_6\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"product_attribute_3_7\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"product_attribute_4_8\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"product_attribute_4_9\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"product_attribute_5_10\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"product_attribute_5_11\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"product_attribute_5_12\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		driver.navigate().back();
		
	//NOTEBOOK
		driver.findElement(By.xpath("(//a[@href=\"/notebooks\"])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-6\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-7\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-8\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-9\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"attribute-option-10\"]")).click();
		Thread.sleep(1000);
		WebElement done=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select by=new Select(done);
		by.selectByVisibleText("Name: A to Z");
		Thread.sleep(1000);
		by.selectByVisibleText("Name: Z to A");
		Thread.sleep(1000);
		by.selectByVisibleText("Price: Low to High");
		Thread.sleep(1000);
		by.selectByVisibleText("Price: High to Low");
		Thread.sleep(1000);
		by.selectByVisibleText("Created on");
		Thread.sleep(1000);
		by.selectByVisibleText("Position");
		WebElement son=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select jk=new Select(son);
		jk.selectByValue("6");
		Thread.sleep(1000);
		jk.selectByValue("9");
		Thread.sleep(1000);
		jk.selectByValue("3");
		Thread.sleep(2000);
		driver.get("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
		Thread.sleep(2000);
		WebElement rupee=driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]"));
		Select qa=new Select (rupee);
		qa.selectByVisibleText("US Dollar");
		Thread.sleep(2000);
		qa.selectByVisibleText("Euro");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-4\"]")).click();
		driver.get("https://demo.nopcommerce.com/notebooks?viewmode=grid&orderby=0&pagesize=3&specs=6%2C7%2C8%2C9%2C10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.get("https://demo.nopcommerce.com/desktops?viewmode=grid&orderby=0&pagesize=3");
		
	//software
		driver.findElement(By.xpath("(//a[@href=\"/software\"])[3]")).click();
		WebElement done1=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select bus=new Select(done1);
		bus.selectByVisibleText("Name: A to Z");
		Thread.sleep(1000);
		bus.selectByVisibleText("Name: Z to A");
		Thread.sleep(1000);
		bus.selectByVisibleText("Price: Low to High");
		Thread.sleep(1000);
		bus.selectByVisibleText("Price: High to Low");
		Thread.sleep(1000);
		bus.selectByVisibleText("Created on");
		Thread.sleep(1000);
		bus.selectByVisibleText("Position");
		WebElement son1=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select jok=new Select(son1);
		jok.selectByValue("6");
		Thread.sleep(1000);
		jok.selectByValue("9");
		Thread.sleep(1000);
		jok.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();

		
		
		
		
	}

}
