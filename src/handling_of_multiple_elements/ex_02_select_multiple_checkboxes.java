package handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_02_select_multiple_checkboxes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Akshay/Documents/checkbox.html");
		
		
		List<WebElement> alllinkscheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(WebElement s1:alllinkscheck) {
			s1.click();
			Thread.sleep(100);
		}
		for(int i=9;i>=0;i--) {
			alllinkscheck.get(i).click();     //deselect the checkbox for loop method
			Thread.sleep(100);
		}
		
		
		
		
		
		
		
	}
 }
