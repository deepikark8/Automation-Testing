package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class CommonUtilities {

	
	public String getProperty(String key) throws IOException {
		
		
		String sPath = "/Users/rahade/eclipse-workspace/TestNGFramework/Properties/application.properties";
		FileInputStream fileinput = new FileInputStream(sPath);
		Properties property = new Properties();
		property.load(fileinput);
		String value = property.getProperty(key);
		return value;
		
	}
	
	
}
