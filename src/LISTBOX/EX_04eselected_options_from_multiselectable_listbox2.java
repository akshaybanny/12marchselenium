package LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX_04eselected_options_from_multiselectable_listbox2 {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
	
driver.get("file:///C:/Users/Akshay/Documents/sample66.html");
	
     WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));	
	
	
	Select s=new Select(selectcountry);
	

	s.selectByIndex(0);
	s.selectByIndex(2);
	s.selectByIndex(3);
	s.selectByIndex(1);
	
	Thread.sleep(2000);
	


	
	s.deselectAll();
	
	
	
	
	
}}

