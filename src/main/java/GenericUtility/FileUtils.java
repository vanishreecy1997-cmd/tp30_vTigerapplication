package GenericUtility;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtils 
{
	//hi
	/**
	 * This method is used to read data from propertyfile
	 * @author Vanishree
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromPropertyFile(String key) throws IOException
{
	
	FileInputStream f = new FileInputStream(Ipathconstants.filepath);
	Properties pObj = new Properties();
	pObj.load(f);
    String value = pObj.getProperty(key);
    return value;
}
}
