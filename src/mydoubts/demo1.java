package mydoubts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		
		WebElement comp = driver.findElement(By.xpath("(//a[text()='Components'])[1]"));

      

		WebElement moni = driver.findElement(By.xpath("(//a[text()='Monitors (2)'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(comp).moveToElement(moni).click().perform();
		
		
		
		
		
		
		
		
		
	}

}
