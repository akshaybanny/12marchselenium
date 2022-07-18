package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_5_navigate {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			driver.navigate().to("https://www.fb.com");
			Thread.sleep(2000);
			driver.navigate().to("https://www.amazon.com");

			Thread.sleep(2000);
		     driver.navigate().back();
		     Thread.sleep(2000);
		     driver.navigate().forward();
		     Thread.sleep(2000);
		     driver.navigate().refresh();
		     
		     
		     
		     
		     
		     
		     
		     
}
}