package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginhome33 {

	@FindBy(xpath="//span[@class='user-id']")  private	WebElement Userid;



	public kiteloginhome33(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
		
		
		public void verifykitehomUserid() {
			String acttext=Userid.getText();
			String exptext="VS6640";
			if(acttext.equals(exptext)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
	
	
	}}
