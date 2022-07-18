package page_of_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelog22 {


       @FindBy(xpath = "//input[@minlength='6']")               private          WebElement Pin;
       @FindBy(xpath = "//button[@type='submit']")               private          WebElement conti;
       
                 


       public kitelog22(WebDriver driver) {
    	   PageFactory.initElements(driver, this);
       }

       public void enterpin() {
    	   Pin.sendKeys("706665");
       }

       public void entercontibtn() {
   		conti.click();
   	}









}
                      
                      
                      
                      
                     









