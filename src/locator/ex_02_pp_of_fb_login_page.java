package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_02_pp_of_fb_login_page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akshay");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bansod");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("akkii");
		
	}

}
