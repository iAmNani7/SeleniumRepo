package com.externalautomation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleForAssertion {
static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
@Test
public static void runOne()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	String ac=driver.getTitle(),et="YouTube";
	Assert.assertEquals(ac, et);
	driver.quit();
}

}
