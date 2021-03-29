package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class basic6 
{

	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	
	/*WebElement firstname=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr[3]/td[3]"));;
	Actions act= new Actions(driver);
	act.moveToElement(firstname).build().perform();*/
	
	
	WebElement firstname = driver.findElement(By.xpath("//*[@id=\"task-table\"]/tbody/tr[4]/td[3]"));
	String s=firstname.getText();
	System.out.println(s);
	
	}
}
