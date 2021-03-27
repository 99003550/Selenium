package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{

	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	
	//maximize window
	driver.manage().window().maximize();
		
	driver.findElement(By.name("firstname")).sendKeys("Midhun");;
	driver.findElement(By.name("lastname")).sendKeys("Menon");;
	driver.findElement(By.name("reg_email__")).sendKeys("mmm123@gmail.com");;
	driver.findElement(By.name("reg_passwd__")).sendKeys("mmm1234");;
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mmm123@gmail.com");;
	
	Select dd= new Select(driver.findElement(By.id("day")));
	dd.selectByValue("25");
	Thread.sleep(5000);
	
	Select mn= new Select(driver.findElement(By.id("month")));
	mn.selectByValue("2");
	Thread.sleep(5000);
	
	Select yy= new Select(driver.findElement(By.id("year")));
	yy.selectByValue("1998");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.name("websubmit")).click();;
	}
}
