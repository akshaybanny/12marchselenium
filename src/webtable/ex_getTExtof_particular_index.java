package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_getTExtof_particular_index {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Akshay/Documents/webtableakkii.html");
		
		
//		String data = driver.findElement(By.xpath("//table[@border='1']//tr[4]/td[2]")).getText();
//		
//		
//		System.out.println(data);
	
	System.out.println(driver.findElement(By.xpath("//table[@border='1']//tr[4]/td[2]")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//table[@border='1']//tr[2]/td[1]")).getText());
	
		
	System.out.println(driver.findElement(By.xpath("//table[@border='1']//tr[4]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@border='1']//tr[2]/td[2]")).getText());

	}

}
