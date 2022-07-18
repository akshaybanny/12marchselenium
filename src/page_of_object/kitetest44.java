package page_of_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetest44 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				
				kitelog11 p1=new kitelog11(driver);
			
                    p1.enterUnid();
                    p1.enterPwd();
                   p1.logibuttenetr();

               kitelog22 a1=new kitelog22(driver);
                        a1.enterpin();
				a1.entercontibtn();


		      kiteloghome33 home=new kiteloghome33(driver);
		      home.Userid();

		
		        Thread.sleep(2000);
				driver.quit();
				
				
				
				
				
				
				
				
				
				
				
			}

		}

	
	
	
	
	
	
	
	
	
	
	
	
	


