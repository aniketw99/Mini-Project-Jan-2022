package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.DDT.UserDetails;
import com.DDT.WebDriverProperties;
import com.POM.FirstPage;
import com.POM.LoginPage;
import com.logging.LoggerClass;

public class TC_Verify_Login {
	WebDriver driver, driver1;

	@Test
	public void f() {
		try {
			FirstPage.logIn(driver).click();
			LoggerClass.printDebug("Opened First Page");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			LoginPage.userName(driver).sendKeys(UserDetails.getUserName());
			LoggerClass.printDebug("Getting Username...");
		} catch (IOException e) {
			LoggerClass.printError("Username not found");
		}
		try {
			LoginPage.password(driver).sendKeys(UserDetails.getPassword());
			LoggerClass.printDebug("Getting Password...");
		} catch (IOException e) {
			LoggerClass.printError("Password not found");
		}
		try {
			LoginPage.submit(driver).click();
			LoggerClass.printDebug("Logged in Successfully");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Login");
		}

		String exp_str = "Lifestyle Store";
		String act_str = driver.getTitle();
		LoggerClass.printDebug("TestCase Passed");
		Assert.assertEquals(act_str, exp_str);
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		driver = WebDriverProperties.setChromeDriverProperty();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
