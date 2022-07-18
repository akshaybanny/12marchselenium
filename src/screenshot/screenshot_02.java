package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot_02 {
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com/");
		String rs = RandomString.make(2);
		File akii = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(akii);
		
		File baby= new File("C:\\\\Users\\\\Akshay\\\\Desktop\\\\Desktop\\\\screenshot\\\\priyanka"+rs+".jpg");
		
		FileHandler.copy(akii, baby);
		
		
		
		
		
		
	}

}
