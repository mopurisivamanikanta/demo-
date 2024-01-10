package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
			
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.findElement(By.cssSelector("input[id=\"gparent_1\"]")).sendKeys("subbareddy");
		driver.findElement(By.cssSelector("input[id=\"parent_1\"]")).sendKeys("krishnareddy");
		driver.findElement(By.cssSelector("input[id=\"child_1\"]")).sendKeys("srinivasreddy");
		driver.findElement(By.cssSelector("input[id=\"gparent_2\"]")).sendKeys("ashokreddy");
		driver.findElement(By.cssSelector("input[id=\"parent_2\"]")).sendKeys("kotireddy");
		driver.findElement(By.cssSelector("input[id=\"child_2\"]")).sendKeys("ravindrareddy");
		driver.findElement(By.cssSelector("input[id=\"tooltip-1\"]")).sendKeys("mani");
		driver.findElement(By.cssSelector("input[id=\"sname\"]")).sendKeys("mopuri");
		driver.findElement(By.cssSelector("input[id=\"yaddress\"]")).sendKeys("ap");
		driver.findElement(By.cssSelector("input[name=\"Town\"]")).sendKeys("ongole");
		driver.findElement(By.cssSelector("input[name=\"Country\"]")).sendKeys("india");

	}

}
