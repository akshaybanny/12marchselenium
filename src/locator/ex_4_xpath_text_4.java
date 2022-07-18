package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_4_xpath_text_4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		
		
//		driver .findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
//Thread.sleep(2000);
		
driver .findElement(By.xpath("(//a[contains(@role,'button')])[2]")).click();
Thread.sleep(2000);
		
driver .findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshay");
		
driver .findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("bansod");


driver .findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("bansod.akshay@gmail.com");

driver .findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("bansod.akshay@gamil.com");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("akshay@123");

	}

}
