package handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_01_print_all_data_Links_of_page_ps_01 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com/");
	
	
//	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
//	
//	   System.out.println(alllinks.size());
//	
//	for(WebElement s1:alllinks) {
//		System.out.println(s1.getText());
//	}
	
	
	int size = driver.findElements(By.xpath("//a")).size();
	System.out.println(size);
	
	
	
	
	
	
}
}
