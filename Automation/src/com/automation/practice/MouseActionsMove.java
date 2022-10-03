package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.externalautomation.practice._StaticBlockForWebdriver;

public class MouseActionsMove extends _StaticBlockForWebdriver{
	@Test
	public void movingToDropDown()
	{
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement women = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		Actions a=new Actions(driver);
		a.moveToElement(women).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Sarees')]")).click();
	}
}
