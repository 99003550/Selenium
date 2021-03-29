package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basic3 
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
	
	driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	
	driver.findElement(By.id("calFromDate")).clear();;
	driver.findElement(By.id("calFromDate")).sendKeys("2021-03-29");
	driver.findElement(By.id("calToDate")).clear();
	driver.findElement(By.id("calToDate")).sendKeys("2021-03-30");
	driver.findElement(By.id("applyleave_txtComment")).sendKeys("abcd");
	
	driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
	driver.findElement(By.name("leaveList[txtEmployee][empName]")).sendKeys("abcd");
	driver.findElement(By.id("leaveList_cmbSubunit")).click();
	
	
	/*driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
	driver.findElement(By.id("confirm_password")).sendKeys("admin123");*/
	Thread.sleep(5000);
	}
}
