package com.POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	static WebElement element=null;
	
	public static WebElement userName(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/form/div[1]/input"));
		return element;
	}
	
	public static WebElement password(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/form/div[2]/input"));
		return element;
	}
	
	public static WebElement submit(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/form/div[3]/input"));
		return element;
	}
	
	public static WebElement register(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/a"));
		return element;
	}
	

}
