package handling_of_customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_02_select_option_using_homeKey {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(2000);

//step 1
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
	//step 2
Actions act=new Actions(driver);
		
//step 3
act.click(month).perform();
Thread.sleep(2000);	
	
	
	//step-4 switch it to homekey
	act.sendKeys(Keys.HOME).perform();
	
	//navigate to july option
	for(int i=1;i<=6;i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
	}
	
	//last step enter the option
	act.sendKeys(Keys.ENTER).perform();
	}
   }
