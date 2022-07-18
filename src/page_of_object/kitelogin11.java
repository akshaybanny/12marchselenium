package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin11 {
	
	
@FindBy(xpath = "//input[@type='text']")	 private    WebElement un;
@FindBy(xpath = "//input[@placeholder='Password']")	 private   WebElement pwd;
@FindBy(xpath = "//button[@type='submit']")	 private    WebElement login;
	
	
	public kitelogin11(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void setkitelogin11username() {
		un.sendKeys("VS6640");
	}
	public void setkitelogin11password() {
		pwd.sendKeys("7066650010");
	}
	public void clickkitelogin11() {
		login.click();
	}
	
	
	
	
	
	
	

}
