package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kt3 {
              
	@FindBy(xpath = "//input[@minlength=\"6\"]")  private WebElement pin;
	@FindBy(xpath = "//button[@class=\"button-orange wide\"]")  private   WebElement con;
	
	
	public kt3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin() {
		pin.sendKeys("706665");
	}
	
	public void condom() {
		con.click();
	}
	
	
	
	
	
	
	


}
