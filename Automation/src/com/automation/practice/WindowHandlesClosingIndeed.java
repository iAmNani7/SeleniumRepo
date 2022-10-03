package com.automation.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlesClosingIndeed extends BaseClass {
	@Test
	public void windowHandle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com");
		driver.findElement(By.xpath("//span[contains(text(),'Continue with Apple')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Continue with Facebook')]")).click();
		Set<String> s=driver.getWindowHandles();
		for (String i : s)
		{
			String s1=driver.switchTo().window(i).getTitle();
			if(s1.contains("Indeed Accounts")) {
				continue;
			}
			driver.close();
		}
	}
}
