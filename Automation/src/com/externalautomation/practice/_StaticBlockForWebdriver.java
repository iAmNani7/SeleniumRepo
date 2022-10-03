package com.externalautomation.practice;

import org.openqa.selenium.WebDriver;


public class _StaticBlockForWebdriver 
{
	public static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
}
