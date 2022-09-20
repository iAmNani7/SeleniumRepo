package com.externalautomation.practice;
import java.io.*;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginActitimeUsingPropertyFile extends _StaticBlockForWebdriver{

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		FileInputStream fis=new FileInputStream("./data/base.property");
		Properties p=new Properties();
		p.load(fis);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
			for(int i=1;i<=4;i++)
			{	
				driver.get(p.getProperty("url"));
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(p.getProperty("un"+i));
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(p.getProperty("pw"+i));
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				WebDriverWait w=new WebDriverWait(driver, 10);
				w.until(ExpectedConditions.titleContains("Enter Time"));
				driver.findElement(By.id("logoutLink")).click();
				Thread.sleep(2000);
			}
			driver.quit();
	
	}

}
