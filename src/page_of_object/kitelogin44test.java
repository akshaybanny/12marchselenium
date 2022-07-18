package page_of_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitelogin44test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		kitelogin11 p1=new kitelogin11(driver);
		p1.setkitelogin11username();
		p1.setkitelogin11password();
		p1.clickkitelogin11();
		
		kitelogin22 p2=new kitelogin22(driver);
		p2.setpinkitelogin22();
		p2.clickkitelogin22continuebutton();
		
		kiteloginhome33 p3=new kiteloginhome33(driver);
		p3.verifykitehomUserid();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
