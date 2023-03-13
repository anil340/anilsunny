package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	@FindBy(id="add")
	   private WebElement plusbutton;
	@FindBy(xpath="(// button[@type='submit'])[2]")
	   private WebElement cartbut;

public Addtocart(WebDriver driver) {
	 PageFactory.initElements( driver, this);
 }

public WebElement getPlusbutton() {
	return plusbutton;
}
 public void cartbutton() {
	 cartbut.click();
 }

}

 
 
 

