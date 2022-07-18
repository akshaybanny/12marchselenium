package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			Thread.sleep(4000);
		     driver.close();
}}
