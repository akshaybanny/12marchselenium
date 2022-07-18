package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin22 {
	
	@FindBy(xpath = "//input[@icon='lock']")	 private   WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")	     private    WebElement contbtn;
	
	public kitelogin22(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setpinkitelogin22() {
		pin.sendKeys("706665");
	}
	public void clickkitelogin22continuebutton() {
		contbtn.click();
	}
	
	
	
	

}
