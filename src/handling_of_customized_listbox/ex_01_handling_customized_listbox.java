package handling_of_customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_01_handling_customized_listbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(2000);

//step 1
WebElement monthqw = driver.findElement(By.xpath("//select[@id='month']"));
		
	//step 2
Actions act=new Actions(driver);
		
//step 3
act.click(monthqw).perform();
Thread.sleep(2000);	
		
	//step 4=arrow down key
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ARROW_UP).perform();

act.sendKeys(Keys.ARROW_UP).perform();

Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();





		
		
		
		
		
		
	}

}
