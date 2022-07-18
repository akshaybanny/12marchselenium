package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_text_contains_text2 {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			
			
			driver .findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshay");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("bansod");
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8411905476");
	        
	     
	
}}
