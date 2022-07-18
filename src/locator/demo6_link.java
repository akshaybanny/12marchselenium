package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6_link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		driver .findElement(By.xpath("(//a[contains(@role,'button')])[2]")).click();
		Thread.sleep(2000);
				
//		driver .findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshay");
//				
//		driver .findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("bansod");
//
//
//		driver .findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("bansod.akshay@gmail.com");

	
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("akshay@123");
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
	}

}
