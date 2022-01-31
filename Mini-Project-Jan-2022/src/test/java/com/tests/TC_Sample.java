package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import com.DDT.RegisterUser;
import com.DDT.WebDriverProperties;
import com.POM.FirstPage;
import com.POM.SignUpPage;


public class TC_Sample {
	WebDriver driver,driver1;
	
  @Test
  public void f() throws IOException {
	  FirstPage.signUp(driver).click();
	  SignUpPage.nameRegister(driver).sendKeys(RegisterUser.getUserName());
	  SignUpPage.emailregister(driver).sendKeys(RegisterUser.getEmail());
	  SignUpPage.passwordRegister(driver).sendKeys(RegisterUser.getPassword());
	  SignUpPage.contactRegister(driver).sendKeys(RegisterUser.getContact());
	  SignUpPage.CityRegister(driver).sendKeys(RegisterUser.getCity());
	  SignUpPage.addressRegister(driver).sendKeys(RegisterUser.getAddress());
	  SignUpPage.submitButtonSignUp(driver).click();
	  System.out.println("Done");
	  
	  
	  
  
  
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/LifestyleStore/index.php");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
