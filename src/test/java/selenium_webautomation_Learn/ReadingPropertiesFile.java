package selenium_webautomation_Learn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties propertiesObj=new Properties();
	    FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
	    propertiesObj.load(file);
	    
	  String url=  propertiesObj.getProperty("appUrl");
	  String email=  propertiesObj.getProperty("Email");
	  System.out.println(url);
	}

}
