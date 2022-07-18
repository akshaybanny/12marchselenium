package webdriver;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			Thread.sleep(4000);
		     driver.manage().window().maximize();
			
			
//	Options s1=driver.manage();
//			Window s2=s1.window();
//			s2.maximize();
}}
