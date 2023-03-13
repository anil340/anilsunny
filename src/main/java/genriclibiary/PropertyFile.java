package genriclibiary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {
	
public String getPropertydata(String key) throws Exception
{
	Properties p = new Properties();
	FileInputStream fis = new FileInputStream(AutoConstant.propertyfilepath);
	 p.load(fis);
	  return p.getProperty (key);
	
	
}
}
