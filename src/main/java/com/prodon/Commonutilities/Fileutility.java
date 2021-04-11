package com.prodon.Commonutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * 
 * @author Praveen
 *
 */
public class Fileutility {
	/**
	 * used to get the data from property file based on key
	 * @param key
	 * @return
	 * @throws Throwable
	 */
public String getPropertykeyvalue(String key) throws Throwable
{
	FileInputStream fis = new FileInputStream(Pathconstants.filepath);
	Properties pobj = new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;  
}
}
          