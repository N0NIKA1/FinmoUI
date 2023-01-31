package utils;

import baseClass.TestBaseClass;
public class ReadProperties extends TestBaseClass 
{
	/*
	 * This method used for uploading assets file from different platform like QA, Staging , Prod etc
	 */
	public static String readPropertiesUpload(String propertiesValue) throws Exception {
		
		try {
			return System.getProperty("user.dir")+objectreader1.getProperty(propertiesValue);
		} catch (Exception e) {
		
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	/*
	 * This method used to read static string values from (from different platform like QA, Staging , Prod etc)
	 *  Environment related properties file
	 */
	public static String readValue(String value) throws Exception {
	
	try {
		return objectreader1.getProperty(value);
	} catch (Exception e) {
		
		e.printStackTrace();
		throw new Exception(e.getMessage());
	}
	}
	/*
	 * This method used to read static string values from  common  properties file either for LOR.Properties or FROST.Properties.
	 */
	public static String readConstantValue(String value) throws Exception {
	
	try {
		return commonObjectReader.getProperty(value);
	} catch (Exception e) {
		
		e.printStackTrace();
		throw new Exception(e.getMessage());
	}
	}
	/*
	 * This method used to get constant path for uploading assets , image  file either for Lor  
	 */
	public static String readConstantPathForUpload(String propertiesValue) throws Exception {
		
		try {
			return System.getProperty("user.dir")+commonObjectReader.getProperty(propertiesValue);
		} catch (Exception e) {
		
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}


	


}
