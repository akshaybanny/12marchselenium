package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_08_contains_combo_08 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	
	
	//UN
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")).sendKeys("abc");
	
	
	//password
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]")).sendKeys("xyz");
	
	//login click
	driver.findElement(By.xpath("//button[contains(@data-testid,'royal')]")).click();
}
}