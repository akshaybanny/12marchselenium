package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage1 {
	
	
	@FindBy(xpath= "//input[@type=\"text\"]") private WebElement UN;
	@FindBy(xpath= "//input[@type=\"password\"]") private WebElement Pwd;
	@FindBy(xpath= "//button[@class=\"button-orange wide\"]") private WebElement loginbtn;
	
	
	public kiteloginpage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUn() {
		UN.sendKeys("VS6640");
	}
	
public void enterPwd() {
		Pwd.sendKeys("7066650010");
	}
	
public void enterlogin() {
	loginbtn.click();
}
	
}	
	


