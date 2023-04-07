package com.autamation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandling {
	Properties properties;
	public PropertiesHandling() {
	
		try {
			String filePath=System.getProperty("user.dir")+"//target/config.properties";
			FileInputStream input=new FileInputStream(filePath);
			properties=new Properties();
			properties.load(input);
	
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	public String getProperty(String key) {
		String value=properties.getProperty(key);
		System.out.println(value);
		return value;
	}
	
}
