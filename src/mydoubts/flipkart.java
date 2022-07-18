package mydoubts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
        WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));		
       // WebElement sad = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));		

      WebElement menumac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));		

		//WebElement comp = driver.findElement(By.xpath("//a[text()='Components (2)']"));
		Actions act=new Actions(driver);
		act.moveToElement(desktop).moveToElement(menumac).click().perform();
		
		
		
	}

}
