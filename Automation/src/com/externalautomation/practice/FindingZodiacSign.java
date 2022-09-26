package com.externalautomation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class FindingZodiacSign extends _StaticBlockForWebdriver{

	@Test
	public void zodiacFinder()
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.astroica.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try
		{
			/*List<WebElement> li = driver.findElements(By.xpath("//ul[@id='nav-main']/li[2]/ul//a"));
	//Select s=new Select(l);
	//java.util.List<WebElement> li = s.getOptions();	

	for(WebElement e:li)
		System.out.println(e.getText()+"1");
	}*/
			driver.findElement(By.linkText("Western Astrology")).click();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			/*
			 * finally { driver.close(); }
			 */

		}

	}
