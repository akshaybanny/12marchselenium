package page_of_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetestlogin {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		kiteloginpage1 p1=new kiteloginpage1(driver);
	
         p1.enterUn();
         p1.enterPwd();
        p1.enterlogin();
		
	kitelogin2 p2=new kitelogin2(driver);
		p2.enterpin();
		p2.entercontibtn();


		
	kitehomepage home=new kitehomepage(driver);
	home.verifyUserid();

//		
		Thread.sleep(2000);
		driver.quit();
//		
		
		
		
		
		
		
		
		
		
		
	}

}
