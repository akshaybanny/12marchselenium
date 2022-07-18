package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_07_create_link_contains {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	
	//create new account click on link contains with text
	driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
	
	
	
	
	
	
	
	
	
}
}
