package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_02_col_size {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Akshay/Documents/webtableakkii.html");
		
	//	System.out.println(driver.findElements(By.xpath("//table[@border='1']//tr[1]/th")).size());
		
		
	//	System.out.println(driver.findElements(By.xpath("//table[@border='1']//tr[2]/td")).size());
		
		
		//System.out.println(driver.findElements(By.xpath("//table[@border='1']//tr[3]/td")).size());
		
		
		System.out.println(driver.findElements(By.xpath("//table[@border='1']//tr[4]/td")).size());
		
		
		
		
		
		
	}

}
