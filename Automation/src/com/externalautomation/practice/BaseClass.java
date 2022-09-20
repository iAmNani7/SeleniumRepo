package com.externalautomation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass  
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();	
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void logout() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("logoutLink")).click();
	}
}
