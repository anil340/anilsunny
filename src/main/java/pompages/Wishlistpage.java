package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement play;
	 @FindBy(xpath="//button[@aria-label='Pause']")
      private WebElement pause;
	 
	 @FindBy(xpath="//span[text()='Add To Wishlist']")
	 private WebElement wishlist;
	 
	 @FindBy(xpath="// button[text()='Accept']")
	 private WebElement closebt;
	 
	 public Wishlistpage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 
	 public void wishtb() {
		  wishlist.click();
	  }
	 public void playbtn()
	 
	 {
		 play.click();
	 }
	 public void pausebtn()
	 {
		 pause.click();
		 
	 }
	  
	  
	 public void close() {
		 closebt.click();
	 }
	 
	 
	 
	 
}
