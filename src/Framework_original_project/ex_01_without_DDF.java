package Framework_original_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01_without_DDF {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		//un id
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("VS6640");
		
		//pwd
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("7066650010");
		//login
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//pin
	     driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("706665");
	     //continue click
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String ActUserId = driver.findElement(By.xpath("//span[@class=\"user-id\"]")).getText();
		
		String expectedId="VS6640";
		
		if(ActUserId.equals(expectedId)) {
			System.out.println("pass");
		}
		else {
            System.out.println("fail");
		}
		
	Thread.sleep(2000);
	driver.quit();
		
	}

}
