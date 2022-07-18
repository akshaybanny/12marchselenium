package handling_of_drop_down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ex_1_handling_drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
			
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
			WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
				Actions act=new Actions(driver);

				act.moveToElement(login).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[@class=\"_2kxeIr _1pY_1Z\"])[6]")).click();
}}
