package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelog11 {
	
             @FindBy(xpath="//input[@type='text']")  private	WebElement Unid;
             @FindBy(xpath="//input[@placeholder='Password']")     private WebElement Pwd;
             @FindBy(xpath="//button[@type='submit']")  private	WebElement logibutt;
	
	public kitelog11(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUnid() {
		Unid.sendKeys("VS6640");
	}
	
public void enterPwd() {
		Pwd.sendKeys("7066650010");
	}
public void logibuttenetr() {
logibutt.click();
}
	
	
	
	

}
