package com.DDT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.logging.LoggerClass;

public class WebDriverProperties {
	public static WebDriver setChromeDriverProperty() throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		LoggerClass.printInfo("Chrome Was opened successfully");
		
		FileReader reader=new FileReader(".//Files//data.properties");
		 Properties prop=new Properties();
		 prop.load(reader);
		 String url=prop.getProperty("url");
		 driver.get(url);
		 driver.manage().window().maximize();
		 return driver;
	}
}
