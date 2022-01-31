package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.DDT.RegisterUser;
import com.DDT.WebDriverProperties;
import com.POM.FirstPage;
import com.POM.SignUpPage;
import com.logging.LoggerClass;


public class TC_Verify_SignUp {
	WebDriver driver,driver1;
	
  @Test
  public void f() {
	  try {
		FirstPage.signUp(driver).click();
		LoggerClass.printInfo("SignUP clicked Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to signup click");
	}
	  try {
		SignUpPage.nameRegister(driver).sendKeys(RegisterUser.getUserName());
		LoggerClass.printDebug("username entered Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to enter user name");
	}
	  try {
		SignUpPage.emailregister(driver).sendKeys(RegisterUser.getEmail());
		LoggerClass.printDebug("useremail entered Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to enter user email");
	}
	  try {
		SignUpPage.passwordRegister(driver).sendKeys(RegisterUser.getPassword());
		LoggerClass.printDebug("password entered Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to enter user passwd");
	}
	  try {
		SignUpPage.contactRegister(driver).sendKeys(RegisterUser.getContact());
		LoggerClass.printDebug("user comtact entered Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to enter user contact");
	}
	  try {
		SignUpPage.CityRegister(driver).sendKeys(RegisterUser.getCity());
		LoggerClass.printDebug("user city entered Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to enter user city");
	}
	  try {
		SignUpPage.addressRegister(driver).sendKeys(RegisterUser.getAddress());
		LoggerClass.printDebug("user address entered Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to enter user address");
	}
	  try {
		SignUpPage.submitButtonSignUp(driver).click();
		LoggerClass.printInfo("User created Successfully");
	} catch (IOException e) {
		LoggerClass.printError("Failed to create user registration");
	}
	  
	  
	  if(driver.getPageSource().contains("Logout"))
	  {
	      Assert.assertTrue(true);
	  }

	  else
	  {
	      Assert.assertTrue(false);
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
