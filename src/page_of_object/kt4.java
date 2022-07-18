package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kt4 {
	
 @FindBy(xpath = "//input[@type='text']")         private WebElement un;
 @FindBy(xpath = "//input[@placeholder='Password']") private WebElement pwd;
 @FindBy(xpath = "//button[@type='submit']") private WebElement logi;
	  public kt4(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	   
	   public void enterun() {
		   un.sendKeys("VS6640");
	   }
	   public void entepwd() {
		   pwd.sendKeys("7066650010");
	   }
	   public void login() {
		   logi.click();
	   }
	   
	   
	   
	   
	   
	   
}
