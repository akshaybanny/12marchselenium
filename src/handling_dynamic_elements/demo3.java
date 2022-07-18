package handling_dynamic_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo3 {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		 WebElement loginmenu = driver.findElement(By.xpath("//a[text()='Login']"));
		
	   WebElement menuorders = driver.findElement(By.xpath("(//div[@class=\"_3vhnxf\"])[6]"));
		
		Actions act=new Actions(driver);
		act.click(loginmenu).perform();
		Thread.sleep(1000);
		act.click(menuorders).perform();
		
		
	}

}
