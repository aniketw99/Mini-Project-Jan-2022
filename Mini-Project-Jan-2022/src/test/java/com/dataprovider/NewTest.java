package com.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import com.DDT.WebDriverProperties;
import com.DDT.XLUtility;

public class NewTest {
	WebDriver driver;
	
  @Test(dataProvider = "LoginData")
  public void f(String user, String pwd, String exp) {
	  
	  driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
	  
	  WebElement txtEmail=driver.findElement(By.name("email"));
	  txtEmail.clear();
	  txtEmail.sendKeys(user);
	  
	  
	 WebElement txtPassword=driver.findElement(By.name("password"));
	 txtPassword.clear();
	 txtPassword.sendKeys(pwd);
	 
	 driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[3]/input")).click();//login button
	 
	 try {
		 Alert alert= driver.switchTo().alert();
		 alert.accept();
		 
		 
	 }catch(Exception e) {
		 System.out.println(e);
	 }
	 
	 
	 String exp_title="Lifestyle Store";
	 String act_title=driver.getTitle();
	 
	 if(exp.equals("valid")) 
		{
		  if(exp_title.equals(act_title))
		  {
			  driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();//logout button
			  Assert.assertTrue(true);
		  }
		  else 
		  {
			  Assert.assertTrue(false); 
		  }
		  
		}
		else if(exp.equals("invalid"))
		{
			if(exp_title.equals(act_title))
			  {
				driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();//logout button
				  Assert.assertTrue(false);
			  }
			else
			{
				 Assert.assertTrue(true);
			}
		}  
  }
  

  @DataProvider(name="LoginData")
  public String [][] dp() throws IOException {
	  

	  
	  String path=".\\Files\\logindata.xlsx";
		
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("sheet1");
        int totalcols=xlutil.getCellCount("sheet1", 1);
      
        String loginData[][]= new String[totalrows][totalcols];
for(int i=1;i<=totalrows;i++) 
{
	 for(int j=0;j<totalcols;j++) 
	 {
		 loginData[i-1][j]=xlutil.getCellData("sheet1", i, j);
	 }
}	
   return loginData;
  }
  
  
  @BeforeClass
  public void beforeClass() throws IOException {
	  driver = WebDriverProperties.setChromeDriverProperty();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
