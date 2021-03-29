package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class basic5 
{
	public static void main(String[] args) throws Exception 
	{
	System.out.println("Welcome to selenium training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	WebElement ele=driver.findElement(By.linkText("Leave"));
	Actions act= new Actions(driver);
	act.moveToElement(ele).build().perform();
	
	WebElement ele1=driver.findElement(By.linkText("Entitlements"));
	Actions act1= new Actions(driver);
	act1.moveToElement(ele1).build().perform();
	
	WebElement ele11=driver.findElement(By.linkText("Add Entitlements"));
	Actions act11= new Actions(driver);
	act11.moveToElement(ele11).build().perform();
	
	WebElement ele111=driver.findElement(By.linkText("Employee Entitlements"));
	Actions act111= new Actions(driver);
	act111.moveToElement(ele111).build().perform();
	
	WebElement ele1111=driver.findElement(By.linkText("My Entitlements"));
	Actions act1111= new Actions(driver);
	act1111.moveToElement(ele1111).build().perform();
	}
	
}
