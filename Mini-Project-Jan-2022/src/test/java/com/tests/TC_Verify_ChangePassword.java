package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.DDT.RegisterUser;
import com.DDT.UserDetails;
import com.DDT.WebDriverProperties;
import com.POM.CartPage;
import com.POM.FirstPage;
import com.POM.LoginPage;
import com.POM.ProductsPage;
import com.POM.SettingsPage;
import com.POM.SignUpPage;
import com.logging.LoggerClass;

public class TC_Verify_ChangePassword {
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
		try {
			ProductsPage.settings(driver).click();
			LoggerClass.printInfo("Settings opened Successfully");
		} catch (IOException e) {
			LoggerClass.printError("Cannot open Settings");
		}
		try {
			SettingsPage.oldPassword(driver).sendKeys(UserDetails.getPassword());
			LoggerClass.printDebug("Entered old password");
		} catch (IOException e) {
			LoggerClass.printError("Old password wrong");
		}
		try {
			SettingsPage.newPassword(driver).sendKeys(UserDetails.getNewPassword());
			LoggerClass.printDebug("new password entered");
		} catch (IOException e) {
			LoggerClass.printError("Incorrect new password");
		}
		try {
			SettingsPage.confirmNewPasssword(driver).sendKeys(UserDetails.getNewPassword());
			LoggerClass.printDebug("new password confirmed");
		} catch (IOException e) {
			LoggerClass.printError("Failed to confirm new password");
		}
		try {
			SettingsPage.submitPasswordChange(driver).click();
			LoggerClass.printDebug("password changed Successfully");
		} catch (IOException e) {
			LoggerClass.printError("Failed to change password");
		}
		

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		driver = WebDriverProperties.setChromeDriverProperty();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
