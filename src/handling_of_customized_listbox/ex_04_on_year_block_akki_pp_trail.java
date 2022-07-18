package handling_of_customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_04_on_year_block_akki_pp_trail {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(2000);

//step 1
WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
	//step 2
Actions act=new Actions(driver);
		
//step 3
act.click(year).perform();
Thread.sleep(2000);	

//step -4=navigate to end key

act.sendKeys(Keys.END).perform();

Thread.sleep(2000);	
for(int i=1;i<=25;i++) {
act.sendKeys(Keys.ARROW_UP).perform();

}
Thread.sleep(2000);	
//last step enter the march month
act.sendKeys(Keys.ENTER).perform();

		
		
		
		
		
		
		
		
		
		
	}

}
