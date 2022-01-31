package com.POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	static WebElement element;
	
	public static WebElement cartButton(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement settings(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement logout(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a"));
		return element;
	}
	
	public static WebElement prod_Canon_EOS(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/center/div/a"));
		return element;
	}
	
	public static WebElement prod_Sony_DSLR(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/center/div/a"));
		return element;
	}
	
	public static WebElement prod_Olympus(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/div/center/div/a"));
		return element;
	}
	
	public static WebElement raymondShitr(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/div/center/div/a"));
		return element;
	}
	
	public static WebElement XHRshirt(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[3]/div/center/div/a"));
		return element;
	}
	
	public static WebElement charlesShirt(WebDriver driver) throws IOException
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/center/div/a"));
		return element;
	}

}
