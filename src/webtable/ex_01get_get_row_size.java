package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_01get_get_row_size {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Akshay/Documents/webtableakkii.html");
		
		
//		List<WebElement> allrows = driver.findElements(By.xpath("//table[@border=\"1\"]/tbody/tr"));
//		
//		int rowsize = allrows.size();
//		System.out.println(rowsize);
		
		System.out.println(driver.findElements(By.xpath("//table[@border='1']//tr")).size());
		
		
		
		
		
		
	}

}
