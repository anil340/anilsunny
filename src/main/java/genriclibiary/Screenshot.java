package genriclibiary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public void getscreenshot(WebDriver driver, String name) throws IOException {
		
		
		Date d = new Date();
		 String currentdate = d.toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dert = new File(AutoConstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src, dert);
		
		
		
	}
	

}
