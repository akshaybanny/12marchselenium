package popups_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_02_alert_poUp1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1233");
	
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	
	//driver.switchTo().alert().dismiss();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().accept();
}
}
