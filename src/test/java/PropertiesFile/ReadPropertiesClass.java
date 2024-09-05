package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesClass {

	public static void main(String[] args) throws IOException {
		
		//Location properties
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
		
		Properties proObj = new Properties();
		proObj.load(file);
		
		//Read properties
		String url =proObj.getProperty("appurl");
		String email =proObj.getProperty("email");
		String password =proObj.getProperty("password");
		String orderId =proObj.getProperty("orderId");
		String Cid =proObj.getProperty("Cid");
		
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
		System.out.println(orderId);
		System.out.println(Cid);
		
		file.close();
		//Read only keys
		 //Set<String> keys = proObj.stringPropertyNames();

	}

}
