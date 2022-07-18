package handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_selectable_deselect_and_select {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Akshay/Documents/checkbox.html");
			List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("akshay");
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshay@123");
			
			for(WebElement s1:check) {
				s1.click();
				Thread.sleep(100);
			}
			for(int i=9;i>=0;i--) {
				check.get(i).click();
				Thread.sleep(100);
			}
			
			
			
			
}}
