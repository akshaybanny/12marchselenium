package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1_is_displayed {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
	
			boolean result = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
			System.out.println(result);


			
			if(result==true) {
				System.out.println("element found");
			}
			else {
				System.out.println("element not found");
			}
			

}}
