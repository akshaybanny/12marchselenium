package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement clickdouble = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act =new Actions(driver);
		
	//	act.doubleClick(clickdouble).perform();
		
	//act.moveToElement(clickdouble).doubleClick().build().perform();	
		
	act.moveToElement(clickdouble).perform();
	act.doubleClick().perform();
		
		
	}

}
