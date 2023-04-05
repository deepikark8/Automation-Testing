package com.Feb8.WriteIntoPropertyFile;
import java.io.FileOutputStream;
import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String userDir = System.getProperty("user.dir");
		String fileSeparator = System.getProperty("file.separator");
		String sPath = userDir+fileSeparator+"Files"+fileSeparator+"WriteInFile.properties";
		
		FileOutputStream fileOutput = new FileOutputStream(sPath);
		Properties property = new Properties();
		
		property.setProperty("username", "Deepika");
		property.setProperty("password", "XYZ@");
		property.setProperty("email", "abc@g.com");
		property.store(fileOutput, "Feb 8 Assignment");
		
		fileOutput.close();

	}

}
