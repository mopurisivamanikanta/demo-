package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		int row1 = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println(row1);
		int column = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//td")).size();
		System.out.println(column);
		String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[2]//td[3]")).getText();
		System.out.println(value);

	}

}
