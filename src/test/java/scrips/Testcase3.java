package scrips;

import org.testng.annotations.Test;

import genriclibiary.StepGroup;
import pompages.Core_java;
import pompages.SkillaryLogin;
import pompages.Wishlistpage;

public class Testcase3 extends StepGroup{
	@Test
	public void tc3() throws Exception {
		SkillaryLogin s = new SkillaryLogin(driver);
      s.serachtext(pdata.getPropertydata("coursename"));
     s.searchbt();
      Core_java cj = new Core_java(driver);   
      cj.corejavaselenium();

       Wishlistpage wp = new Wishlistpage (driver);
       wp.close();
       Thread.sleep(1000);
       driverutiles.Switchtoframe(driver);;
       
        wp.playbtn();
        Thread.sleep(1000);
        wp.pausebtn();
        Thread.sleep(1000);
        driverutiles.Switchbackframe(driver);
        wp.wishtb();
      
     
     
     
	}

	
	
}
