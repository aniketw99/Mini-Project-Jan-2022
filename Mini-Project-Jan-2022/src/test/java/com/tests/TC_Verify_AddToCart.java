package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
import com.POM.SignUpPage;
import com.logging.LoggerClass;

public class TC_Verify_AddToCart {
	WebDriver driver, driver1;

	@Test
	public void f() throws IOException {

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
			ProductsPage.prod_Canon_EOS(driver).click();
			LoggerClass.printDebug("Added item to cart");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Looad Products");
		}
		try {
			ProductsPage.prod_Sony_DSLR(driver).click();
			LoggerClass.printDebug("Added item to cart");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Products");
		}
		try {
			ProductsPage.cartButton(driver).click();
			LoggerClass.printDebug("Cart opened");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Products");
		}
		try {
			CartPage.confirmOrder(driver).click();
			LoggerClass.printDebug("order confirmed");
		} catch (IOException e) {
			LoggerClass.printError("Failed to confirm Products");
		}
		
		LoggerClass.printDebug("Test Case Passed");
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		Date date = Calendar.getInstance().getTime();
		DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String name = dateformat.format(date);
		name = name.replace(":", "");
		name = name.replace("-", "");
		File dest = new File(name + ".png");
		FileUtils.copyFile(src, dest);
	
		

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
