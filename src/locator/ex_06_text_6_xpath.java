package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_06_text_6_xpath {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
			//click on forgotten button pwd links contians with text
			driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
			
			
}}
