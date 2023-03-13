package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLogin {
	@FindBy(xpath="//a[text()=' GEARS ']")
			private WebElement geartab;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	         private WebElement demoapp;
	@FindBy(name="q")
	private WebElement searchtb;
	 @FindBy(xpath="//input[@type='submit']")
	 private WebElement goit;
	
	
 public SkillaryLogin(WebDriver driver) {
	 PageFactory.initElements( driver, this);
 }
 
 public void  gearbutton()
 {
	 geartab.click();
 }
 public void demoApp()
 {
	 demoapp.click();
 }
 public void serachtext(String course) {
	 searchtb.sendKeys(course);
	 
 }
 public void searchbt() {
	 goit.click();;
 }
 
 
 
 
 
 
 
 
 
}
