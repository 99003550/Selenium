package com.ltts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic1 
{

	public static void main(String[] args) throws Exception 
	{
	System.out.println("Welcome to selenium training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	//maximize window
	driver.manage().window().maximize();
	
	driver.findElement(By.className("btn-default")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(5000);
	driver.findElement(By.className("btn-lg")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(5000);
	/*driver.findElement(By.id("at-cv-lightbox-close")).click();
	driver.findElement(By.className("btn-default")).click();*/
	}
}
