package com.POM;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
	static WebElement element;
	public static WebElement signUp(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[1]/a"));
		return element;
	}
	public static WebElement logIn(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a"));
		return element;
	}
	
}
