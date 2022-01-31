package com.POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	static WebElement element;
	public static WebElement nameRegister(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[1]/input"));
		return element;
	}
	
	public static WebElement emailregister(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[2]/input"));
		return element;
	}
	
	public static WebElement passwordRegister(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[3]/input"));
		return element;
	}
	
	public static WebElement contactRegister(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[4]/input"));
		return element;
	}
	
	public static WebElement CityRegister(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[5]/input"));
		return element;
	}
	
	public static WebElement addressRegister(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[6]/input"));
		return element;
	}
	
	public static WebElement submitButtonSignUp(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[7]/input"));
		return element;
	}
	
}
