package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basic4 
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
	/*driver.findElement(By.id("menu_dashboard_index")).click();*/
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/img")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/select")).click();
	Thread.sleep(5000);
	
	Select rs= new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
	rs.selectByValue("9");
	Thread.sleep(5000);
	
	driver.findElement(By.id("applyleave_txtFromDate")).clear();;
	driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2021-03-29");
	driver.findElement(By.id("applyleave_txtToDate")).clear();
	driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2021-03-30");
	driver.findElement(By.id("applyleave_txtComment")).sendKeys("abcd");
	driver.findElement(By.id("applyBtn")).click();
	}
}
