package com.DDT;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class RegisterUser {
	
	public static String getUserName() throws IOException {
		FileReader reader=new FileReader(".//Files//user.properties");
		 Properties prop=new Properties();
		 prop.load(reader);
		 return prop.getProperty("name");
	}
	
	public static String getEmail() throws IOException {
		FileReader reader=new FileReader(".//Files//user.properties");
		 Properties prop=new Properties();
		 prop.load(reader);
		 return prop.getProperty("email");
	}
	
	public static String getPassword() throws IOException {
		FileReader reader=new FileReader(".//Files//user.properties");
		 Properties prop=new Properties();
		 prop.load(reader);
		 return prop.getProperty("password");
	}
	
	public static String getContact() throws IOException {
		FileReader reader=new FileReader(".//Files//user.properties");
		 Properties prop=new Properties();
		 prop.load(reader);
		 return prop.getProperty("contact");
	}
	
	public static String getCity() throws IOException {
		FileReader reader=new FileReader(".//Files//user.properties");
		 Properties prop=new Properties();
		 prop.load(reader);
		 return prop.getProperty("city");
	}
	
	public static String getAddress() throws IOException {
		FileReader reader=new FileReader(".//Files//user.properties");
		 Properties prop=new Properties();
		 prop.load(reader);
		 return prop.getProperty("address");
	}
}
