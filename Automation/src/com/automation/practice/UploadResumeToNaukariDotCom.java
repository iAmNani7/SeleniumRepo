package com.automation.practice;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadResumeToNaukariDotCom extends BaseClass{
	WebDriver driver;
	@Test
	public void uploadResume()
	{
		Scanner s=new Scanner(System.in);
		driver=new ChromeDriver();
		System.out.println("Enter your email");
		String mailid=s.nextLine();
		System.out.println("Enter your password");
		String pwd=s.nextLine();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys(mailid);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
		File f=new File("./data/NaveenkumarPodili_UpdatedResume.pdf");
		String path=f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(path);
		driver.close();
	}
}
