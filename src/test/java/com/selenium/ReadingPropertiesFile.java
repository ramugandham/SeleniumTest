package com.selenium;
import java.io.FileInputStream; import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
public class ReadingPropertiesFile {
	public static void main(String[] args) throws IOException {
		//location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		//Loading properties file
		Properties propertiesobj=new Properties();
		propertiesobj.load(file);
		//Reading data from properties file
		String url=propertiesobj.getProperty("appurl");
		String
		email=propertiesobj.getProperty("email");
		String pwd=propertiesobj.getProperty("password"); 
		String orid=propertiesobj.getProperty("orderid");
		String custid=propertiesobj.getProperty("customerid");
		System.out.println(url+" "+email+" "+pwd+" "+orid+" "+custid);
		//reading  all the keys from properties file
		Set<String> keys = propertiesobj.stringPropertyNames();
		System.out.println(keys);
		Set<Object> keys1 = propertiesobj.keySet();
		System.out.println(keys1);
		//reading all the values from properties file
		Collection<Object> values = propertiesobj.values();
		System.out.println(values);
		file.close();
		
		
		}

}
