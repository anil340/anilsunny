package scrips;



import org.testng.annotations.Test;

import genriclibiary.StepGroup;
import pompages.Addtocart;
import pompages.SkillaryLogin;
import pompages.Skillarydemologin;

public class Testcase1 extends StepGroup{
    
	@Test
	public void tc1() throws Exception
	{  
		SkillaryLogin l = new SkillaryLogin(driver);
		l.gearbutton();
		l.demoApp();
		
		Skillarydemologin dl =new Skillarydemologin (driver);
		 driverutiles.SwitchTab(driver);
		 driverutiles.mouseover(driver, dl.getCoursetab());
		 dl.seleniumtraing();
		 
		 Addtocart ac = new Addtocart(driver);
		 driverutiles.doubleclick(driver, ac.getPlusbutton());
		 
		 ac.cartbutton();
		
	   
	   //driverutiles.alertpopup(driver);
		
		 
		 
		 

		
		
		
		
		
	}
	
}
