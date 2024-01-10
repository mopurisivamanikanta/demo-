package dropdown_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//setProperty("webdrivers.chrome.Drivers","F:\\backdoor resumes\\chromedriver-win64\\chromedriver-win64"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://cosmocode.io/automation-practice-webtable/");
		int row =driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
		System.out.println(row);
		int col=driver.findElements(By.xpath("//table[@id=\"countries\"]//td")).size();
		System.out.println(col);
				
		
		for(int r=2;r<=row; r++) {
						
			String lang=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[5]")).getText();
			if(lang.equals("English")) {
				
				driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[1]//input")).click();
				String country=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[2]")).getText();
				System.out.println(lang+ " :" +country);
			}
		}
	}

}
