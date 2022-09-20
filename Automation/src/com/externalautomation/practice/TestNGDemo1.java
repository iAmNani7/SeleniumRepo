package com.externalautomation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo1 extends _StaticBlockForWebdriver {

	@Test
	public void openBrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
