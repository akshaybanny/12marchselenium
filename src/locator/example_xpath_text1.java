package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_xpath_text1 {
	
	
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			Thread.sleep(2000);
			
			driver .findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
			
			driver .findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
			
			driver .findElement(By.xpath("//button[@name='login']")).click();
}}
