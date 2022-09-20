package com.externalautomation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvalidEmailAddressError extends _StaticBlockForWebdriver{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("naveenkumar.podilli@gmail.com");
		driver.findElement(By.xpath("//span[text()='Retrieve Password']")).click();
		String text=driver.findElement(By.xpath("//li[contains(.,'There is no account')]")).getText();
		if(text.contains("There is no account"))
			System.out.println("Error displayed");
		else
			System.out.println("Error not displayed");
		
		driver.quit();
	}
}
