package popups_file;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_03_alertpopup_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1233");
		
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		
            alt.accept();
            
		  alt.accept();
		
		
		
	
		
		
		
		
	}

}
