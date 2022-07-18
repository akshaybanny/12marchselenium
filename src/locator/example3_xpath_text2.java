package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_xpath_text2 {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			
			
			driver .findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	
	

}}
