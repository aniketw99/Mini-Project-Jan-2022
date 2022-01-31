package com.POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
		static WebElement element;
		public static WebElement settings(WebDriver driver) throws IOException
		{
			element=driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a"));
			return element;
		}
		
		public static WebElement Logout(WebDriver driver) throws IOException
		{
			element=driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a"));
			return element;
		}
		
		public static WebElement confirmOrder(WebDriver driver) throws IOException
		{
			element=driver.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[4]/th[4]/a"));
			return element;
		}
		
		public static WebElement Store(WebDriver driver) throws IOException
		{
			element=driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[1]/a"));
			return element;
		}
}
