package popups_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01_popups_hiddenDivisionpopup {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com");
			
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
	
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
	
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akki");
	
}
}
