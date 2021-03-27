package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic 
{

	public static void main(String[] args) throws Exception 
	{
	System.out.println("Welcome to selenium training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	driver.findElement(By.className("form-control")).sendKeys("abcd");
	Thread.sleep(5000);
	driver.findElement(By.id("at-cv-lightbox-close")).click();
	driver.findElement(By.className("btn-default")).click();
//	driver.findElement(By.className("at4-close")).click();
	/*driver.findElement(By.className("at-cv-button at-cv-lightbox-yesno at-cm-no-button")).click();*/
	} 
}
