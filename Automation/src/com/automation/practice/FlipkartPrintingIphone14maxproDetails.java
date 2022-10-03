package com.automation.practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartPrintingIphone14maxproDetails extends BaseClass {

	WebDriver driver;
	@Test
	public void flipkartIphone14MaxProDetailsPrinting()
	{
		try
		{

			driver=new ChromeDriver();

			driver.get("https://www.flipkart.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14 pro max");
			driver.findElement(By.xpath("//input[@name='q']")).submit();
			List<WebElement> name = driver.findElements(By.xpath("(//div[contains(text(),'APPLE')])[2]/../../../../../../../..//div[contains(text(),'APPLE')]"));
			List<WebElement> rates = driver.findElements(By.xpath("(//div[contains(text(),'APPLE')])[2]/../../../../../../../..//div[contains(text(),'APPLE')]/../../div[2]/div[1]/div[1]/div[1]"));
			for(int i=0;i<name.size();i++)
			{
				System.out.print(name.get(i).getText()+"------------>"+rates.get(i).getText()+"\n");
			}
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			driver.close();
		}


	}
}
