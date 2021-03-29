package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ICICI 
{

	public static void main(String[] args) throws Exception 
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		/*System.setProperty("webdriver.chrome.driver\",\"C:\\\\Users\\\\Training\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		Actions act = new Actions(driver);
		
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		
		driver.findElement(By.xpath("//*[@id=\"carRelspan\"]")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"relDropDown\"]/li[2]/a"))).click().perform();
		
		
		driver.findElement(By.id("MOBILENUM")).sendKeys("8547213743");
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Midhun");
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("MENON");
		WebElement d=driver.findElement(By.id("CUSTCOMMUCITY"));
		d.sendKeys("Mumba");
		Thread.sleep(500);
		d.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		d.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		

		
		driver.findElement(By.id("residancespan")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"checkDiv\"]/div/div/div[6]/div[2]/div/div/div/ul/li[4]/a"))).click().perform();
		
		driver.findElement(By.id("yrspan_mvce")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"Cur_Res\"]/div[1]/div/div[2]/div/div/ul/li[6]/a/span[1]"))).click().perform();
		
		
		driver.findElement(By.id("mnthspan")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"month-div_mvce\"]/div/div/ul/li[3]/a/span[1]"))).click().perform();
		
		
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("25/02/1998");
		
		driver.findElement(By.xpath("//*[@id=\"DLR\"]/div/div[1]/label/span")).click();
		
		
		WebElement d2=driver.findElement(By.id("DEALERNAME"));
		d2.sendKeys("Hon");
		Thread.sleep(500);
		d2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		d2.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		
		
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("Honda City");
		WebElement d1=driver.findElement(By.id("CITY_NAME"));
		d1.sendKeys("Delhi");
		/*Thread.sleep(500);
		d1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		d1.sendKeys(Keys.ENTER);
		Thread.sleep(500);*/
		
		//driver.findElement(By.id("CITY_NAME")).sendKeys("Mumbai");
		
		
		
		driver.findElement(By.id("selSalspan")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"checkDiv\"]/div/div/div[17]/div/div/div/div/ul/li[3]/a/span[1]"))).click().perform();
		driver.findElement(By.id("NAME_OF_BUSSINESS")).sendKeys("ltts");
		driver.findElement(By.id("Nobspan")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"NOB\"]/div[2]/div/div/div/ul/li[5]/a"))).click().perform();
		driver.findElement(By.id("yrspan_sdb")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"SelfEMP\"]/div[1]/div/div[2]/div/div/ul/li[7]/a/span[1]"))).click().perform();
		//driver.findElement(By.id("mnthspan_1")).click();
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"month-div_sdb\"]/div/div/ul/li[3]/a"))).click().perform();
		driver.findElement(By.xpath("//div[@id='SelfEMP']/div[@class='col-xs-12 col-sm-6']/div/div/button")).click();
		driver.findElement(By.linkText("3")).click();
		driver.findElement(By.xpath("//*[@id=\"LATEST_Y_GROSS_T_INC\"]")).sendKeys("5000000");
		driver.findElement(By.id("eligibility-btn")).click();
		
		
	}
}