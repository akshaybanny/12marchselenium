package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01_switch_to_frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		//driver.switchTo().frame("iframeResult");
	//driver.switchTo().frame("iframeResult");
		 
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));	
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//button[contains(text(),'me to')]")).click();
		
		
		
		
		
		
		
		
		
	}

}
