package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iftame_ex03 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();


		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		
		driver.switchTo().frame(1);
		
		
		driver.findElement(By.xpath("//button[contains(text(),'me to')]")).click();
		
		
		
		
	}

}
