package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			String t=driver.getTitle();
			System.out.println(t);
			
			//System.out.println(driver.getTitle());
}
}