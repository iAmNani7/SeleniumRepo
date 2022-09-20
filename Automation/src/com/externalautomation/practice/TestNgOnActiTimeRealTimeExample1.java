package com.externalautomation.practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generic.ListenersImplementation.class)

public class TestNgOnActiTimeRealTimeExample1 extends BaseClass
{
	
	@Test
	public void clickingOnViewTimeTrack() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();
		Thread.sleep(2000);
		Assert.fail();
	}
	@Test
	public void clickingOnLockTimeTrack() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Lock Time-Track']")).click();
		Thread.sleep(2000);Assert.fail();
	}
	@Test
	public void clickingOnApproveTimeTrack() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Approve Time-Track']")).click();
		Thread.sleep(2000);Assert.fail();
	}
}
