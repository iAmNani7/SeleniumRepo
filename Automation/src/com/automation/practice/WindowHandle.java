package com.automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle extends BaseClass
{
	@Test
	public void windowHandle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String s=driver.getWindowHandle();
		System.out.println(s);
		driver.close();
	}
}
