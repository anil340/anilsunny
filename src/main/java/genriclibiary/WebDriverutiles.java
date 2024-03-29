package genriclibiary;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverutiles {
	
	public void dropdown(WebElement ele, String text) {
	Select  s = new  Select(ele);
       s.selectByVisibleText(text);
       
      
}
	public void mouseover(WebDriver driver, WebElement ele) {
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	 public void doubleclick(WebDriver driver, WebElement ele)
	 {
		 Actions a = new Actions(driver);
		 a.doubleClick().perform();
	 }
	 public void rightclick(WebDriver driver, WebElement ele)
	 {
		 Actions a = new Actions(driver);
		 a.contextClick().perform();
	 }
	 public void draganddrop(WebDriver driver, WebElement src, WebElement dest)
	 {
		 Actions a= new Actions(driver);
		 a.dragAndDrop(src, dest).perform();
	 }
			 
	public void alertpopup(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	public void Switchtoframe(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void  Switchbackframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void scrollbar(WebDriver driver,int x , int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	public void SwitchTab(WebDriver driver)
	{     Set<String> child = driver .getWindowHandles();
	   for(String b:child)
	   {
		   driver.switchTo().window(b);
	   }
		
	}
	
	
	
	
	
	
	
	
}
