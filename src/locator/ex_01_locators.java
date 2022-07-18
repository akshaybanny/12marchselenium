package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01_locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\akki\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akshay");
		
		
//		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("aksha@123");
	
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
//		
	}

}
