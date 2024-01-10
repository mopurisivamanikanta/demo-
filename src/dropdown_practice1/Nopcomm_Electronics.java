package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nopcomm_Electronics {

	public  void Electronics() throws InterruptedException {
		

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/computers");
	//camera&photo
		driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[3]")).click();
		Thread.sleep(2000);
		driver.get("https://demo.nopcommerce.com/camera-photo");
		WebElement sun=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select xy=new Select(sun);
		xy.selectByValue("5");
		Thread.sleep(2000);
		xy.selectByValue("6");
		Thread.sleep(2000);
		xy.selectByValue("10");
		Thread.sleep(2000);
		xy.selectByValue("11");
		Thread.sleep(2000);
		xy.selectByValue("15");
		Thread.sleep(2000);
		xy.selectByValue("0");
		WebElement pro=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select st=new Select(pro);
		st.selectByValue("6");
		Thread.sleep(2000);
		st.selectByValue("9");
		Thread.sleep(2000);
		st.selectByValue("3");
		driver.get("https://demo.nopcommerce.com/nikon-d5500-dslr");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-14\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-15\"]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		
	//Cell phones
		driver.findElement(By.xpath("(//a[@href=\"/cell-phones\"])[3]")).click();
		WebElement tought=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select ms=new Select(tought);
		ms.selectByValue("5");
		Thread.sleep(2000);
		ms.selectByValue("6");
		Thread.sleep(2000);
		ms.selectByValue("10");
		Thread.sleep(2000);
		ms.selectByValue("11");
		Thread.sleep(2000);
		ms.selectByValue("15");
		Thread.sleep(2000);
		ms.selectByValue("0");
		WebElement display=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select fb=new Select(display);
		fb.selectByValue("6");
		Thread.sleep(2000);
		fb.selectByValue("9");
		Thread.sleep(2000);
		fb.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();
		
	//Others
		driver.findElement(By.xpath("(//a[@href=\"/others\"])[3]")).click();
		WebElement pappa=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select bn=new Select(pappa);
		bn.selectByValue("5");
		Thread.sleep(2000);
		bn.selectByValue("6");
		Thread.sleep(2000);
		bn.selectByValue("10");
		Thread.sleep(2000);
		bn.selectByValue("11");
		Thread.sleep(2000);
		bn.selectByValue("15");
		Thread.sleep(2000);
		bn.selectByValue("0");
		WebElement gop=driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select lg=new Select(gop);
		lg.selectByValue("6");
		Thread.sleep(2000);
		lg.selectByValue("9");
		Thread.sleep(2000);
		lg.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
