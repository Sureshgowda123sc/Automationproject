package generic_Utility;

import java.io.FileInputStream;

import java.util.Properties;

public class Properties_Utility {
	
	public  String getDataFromProperties(String data) throws Exception {
		
		FileInputStream fir=new FileInputStream(IConstantUtility.propertiesPath);
		Properties pobj =new Properties();
		pobj.load(fir);
		
		String value =pobj.getProperty(data);
		return value;
		
	}
	
}
