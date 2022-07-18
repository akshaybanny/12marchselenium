package popups_file;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_04_Switch_to_child_window {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	
	Set<String> allids = driver.getWindowHandles();
           ArrayList<String> al = new ArrayList<String>(allids);
	
	String childwinid = al.get(1);
	
	driver.switchTo().window(childwinid);
	
	driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
	
}
}
