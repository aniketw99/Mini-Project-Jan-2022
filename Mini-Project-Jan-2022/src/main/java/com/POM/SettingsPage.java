package com.POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
	static WebElement element;
	
	public static WebElement oldPassword(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input"));
		return element;
	}
	
	public static WebElement newPassword(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/input"));
		return element;
	}
	
	public static WebElement confirmNewPasssword(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[3]/input"));
		return element;
	}
	
	public static WebElement submitPasswordChange(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[4]/input"));
		return element;
	}

}
