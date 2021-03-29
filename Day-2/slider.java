package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class slider 
{
	public static void main(String[] args) throws Exception 
	{
	System.out.println("Welcome to selenium training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://emicalculator.net/");

	WebElement ele=driver.findElement(By.id("loanamountslider"));
	Actions act= new Actions(driver);
	act.dragAndDropBy(ele,23, 0).build().perform();
	
	WebElement ele1=driver.findElement(By.id("loaninterestslider"));
	Actions act1= new Actions(driver);
	act1.dragAndDropBy(ele1,23, 0).build().perform();
	}
}
