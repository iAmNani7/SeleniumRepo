package com.externalautomation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleAssertion {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	@Test
	public static void runOne()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String ac=driver.getTitle(),et="youTube";
		SoftAssert s=new SoftAssert();
		s.assertEquals(ac, et);s.assertAll();
		driver.quit();
		
	}

	
	
}
