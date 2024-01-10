import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrivers.chrome.Drivers","C:\\\\Users\\\\devi\\\\Downloads\\\\chromedriver_win32 114\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
			
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		Alert ref=driver.switchTo().alert();
		String drop_p=ref.getText();
		System.out.print(drop_p);
		ref.sendKeys("hello");
		ref.accept();
		
		
	
		
			}

}
