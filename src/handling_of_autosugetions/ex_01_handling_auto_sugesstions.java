package handling_of_autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01_handling_auto_sugesstions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		
		Thread.sleep(2000);
		String exp= "redmi note 10 pro";
		List<WebElement> alloptions = driver.findElements(By.xpath("(((//ul[@class=\"G43f7e\"])[1])/li)[4]"));
		
		for(WebElement s1:alloptions) {
			String actres = s1.getText();
			if(actres.equals(exp)) {
				s1.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
