package LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX_1_SELECTTABLE_SINGLE_LISTBOX {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.fb.com");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(5000);
	WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	
	Select s= new Select(year);
	
	s.selectByValue("1943");
	
	//s.selectByVisibleText("Dec");
	
	//s.selectByIndex(7);
	

	
	
	

}}
