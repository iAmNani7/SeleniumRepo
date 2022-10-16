package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.externalautomation.practice._StaticBlockForWebdriver;

public class MouseActions extends _StaticBlockForWebdriver
{
	public static WebDriver driver;
	@Test
	public void vitigerDoubleClick() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement target=driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(target).perform();
		//WebDriverWait wait=new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.)
		driver.findElement(By.partialLinkText("Customer")).click();
		target=driver.findElement(By.linkText("READ FULL STORY"));
		a.click(target).build().perform();
		 WebElement he = driver.findElement(By.xpath("//h1[contains(text(),'HackerEarth ')]"));
		if(!he.isDisplayed())
			Assert.fail();
		
		
	}
	@AfterMethod
	public void closebrow() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
