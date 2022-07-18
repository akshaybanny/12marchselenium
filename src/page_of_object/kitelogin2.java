package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2 {
	@FindBy(xpath = "//input[@id=\"pin\"]")private	WebElement pin;
	@FindBy(xpath = "//button[@class=\"button-orange wide\"]")private	WebElement contibtn;

	public kitelogin2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterpin() {
		pin.sendKeys("706665");
	}
	public void entercontibtn() {
		contibtn.click();
	}





}



