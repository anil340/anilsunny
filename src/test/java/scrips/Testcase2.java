package scrips;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genriclibiary.StepGroup;
import pompages.SkillaryLogin;
import pompages.Skillarydemologin;
import pompages.Testing;

public class Testcase2 extends StepGroup {

	@Test
	public void tc2() throws Exception {
		
		SkillaryLogin s = new SkillaryLogin(driver);
		s.gearbutton();
		s.demoApp();
				
		
		
		Skillarydemologin sd = new	Skillarydemologin(driver);
		
		driverutiles.SwitchTab(driver);
		driverutiles.dropdown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		
		Testing t = new Testing(driver);
		driverutiles.draganddrop(driver, t.getSelenuim(), t.getMycart());
		Point location = t.getFacebook().getLocation();
		
		int x = location.getX();
		int y= location.getY();
		
		driverutiles.scrollbar(driver, x, y);
		 t.facebookicon();
         
         
         
		
	}
	
}
