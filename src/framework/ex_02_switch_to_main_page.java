package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_02_switch_to_main_page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame(1);   //switch frame id by string frame id


		
		//click me to button 
		driver.findElement(By.xpath("//button[contains(text(),'me to')]")).click();
		
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
//driver.switchTo().defaultContent()
		
		
		
		
		
		
		//click on home icon

		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
		
		
		
		
		
	}

}


