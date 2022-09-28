package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFontSizeAndFontTypeForForgotPwdLinkFb {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String fsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String ftype = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		System.out.println(fsize + " "+ ftype);
		
	}

}
