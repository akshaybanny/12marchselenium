package Framework_original_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_02_DDF1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet5");
		
		
		
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		//un id
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		//pwd
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		//login
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//pin
	     driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
	     //continue click
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String ActUserId = driver.findElement(By.xpath("//span[@class=\"user-id\"]")).getText();
		
		String expectedId=sh.getRow(0).getCell(3).getStringCellValue();
		
		if(ActUserId.equals(expectedId)) {
			System.out.println("pass");
		}
		else {
            System.out.println("fail");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
