package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex_02_firefox_103_verion_test {
	
	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("8411905476");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Akshay@123");	
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	}
	
	
	
	
	

}
