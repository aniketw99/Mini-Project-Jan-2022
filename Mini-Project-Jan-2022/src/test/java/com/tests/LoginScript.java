package com.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.DDT.UserDetails;
import com.POM.FirstPage;
import com.POM.LoginPage;

public class LoginScript {
	
	//static WebDriver driver;
	
	public static WebDriver loginCall(WebDriver driver) throws IOException {

		//driver = WebDriverProperties.setChromeDriverProperty();
		FirstPage.logIn(driver).click();
		LoginPage.userName(driver).sendKeys(UserDetails.getUserName());
		LoginPage.password(driver).sendKeys(UserDetails.getPassword());
		LoginPage.submit(driver).click();
		return driver;

	}
	

}
