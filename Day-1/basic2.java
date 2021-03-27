package com.ltts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basic2
{
	public static void main(String[] args) throws Exception 
	{
	System.out.println("Welcome to Selenium Training");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	//maximize window
	driver.manage().window().maximize();

	Select dd= new Select(driver.findElement(By.id("select-demo")));
	dd.selectByVisibleText("Sunday");
	Thread.sleep(5000);
	dd.selectByVisibleText("Friday");
	Thread.sleep(5000);
	dd.selectByIndex(4);
	Thread.sleep(5000);
	
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(5000);
	
	Select place= new Select(driver.findElement(By.id("multi-select")));
	Thread.sleep(5000);
	place.selectByIndex(4);
	Thread.sleep(5000);
	driver.findElement(By.className("btn-primary")).click();
	}

}
