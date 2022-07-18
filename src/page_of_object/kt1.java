package page_of_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kt1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				
				kt4 s1=new kt4(driver);
				s1.enterun();
				s1.entepwd();
				s1.login();
				
				kt3 s2=new kt3(driver);
               s2.enterpin();
               s2.condom();

                    kt2 s3=new kt2(driver);  
			        s3.Userid();
				
			        Thread.sleep(2000);
                    driver.quit();
}}
