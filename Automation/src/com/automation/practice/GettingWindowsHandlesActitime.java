package com.automation.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettingWindowsHandlesActitime extends BaseClass{

	@Test
	public void countingTabs()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> all = driver.getWindowHandles();
		for (String string : all) {
			String s=driver.switchTo().window(string).getTitle();
			System.out.println(s);
		}
	}
}
