package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_5_tagname_locator {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
			driver.get("file:///C:/Users/Akshay/Documents/tagname.html");
			
	//FN
	driver.findElement(By.tagName("input")).sendKeys("abc");
	
	
	//LN
	driver.findElement(By.tagName("(//input[@type='text'])[2]")).sendKeys("xyz");
	
	
	
	
	
}}
