package handling_dynamic_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01_get_reviews_from_flipkart {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 9 pro max");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String reviewandratings = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[5]")).getText();
		
		System.out.println(reviewandratings);
		
		
		
		
	}

}
