package genricLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility  {
	
	public static String getproperty(String key) {
		
		//step:1 Get the representation object of the physical file using FileInputStream
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("./src/test/resources/Commondata.properties");
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//step:2 Create a object of properties class &load all the keys
		
		Properties p=new Properties();
		try {
			p.load(fis);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return p.getProperty(key);
		
	}

}
