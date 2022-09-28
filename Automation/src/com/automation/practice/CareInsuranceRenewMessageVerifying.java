package com.automation.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CareInsuranceRenewMessageVerifying {

	WebDriver driver;
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyCareInsuranceRenewMessage()
	{
		driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement mon = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(mon);
		s.selectByIndex(7);
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(year);
		s1.selectByValue("1998");
		driver.findElement(By.xpath("//td/a[text()='16']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		String exp="Please enter valid Policy No.";
		String act=driver.findElement(By.xpath("//span[@id='policynumberError']")).getText();
		Assert.assertEquals(exp,act);
		driver.close();
	}
}

