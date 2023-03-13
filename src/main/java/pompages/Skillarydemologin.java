package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillarydemologin {
	@FindBy(xpath="//a[text()='COURSE']")
	       private WebElement coursetab;
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	       private WebElement seleniumtraingtab;
	@FindBy(name="addresstype")
    private WebElement coursedd;
	
	public Skillarydemologin (WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	 public void seleniumtraing()
	 {
		 seleniumtraingtab.click();
	 }

	public WebElement getCoursedd() {
		return coursedd;
	}
	

}
