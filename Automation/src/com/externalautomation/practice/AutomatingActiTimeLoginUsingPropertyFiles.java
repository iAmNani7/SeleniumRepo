package com.externalautomation.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class AutomatingActiTimeLoginUsingPropertyFiles extends _StaticBlockForWebdriver
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		FileLib f=new FileLib();
		driver.get(f.getPropertyData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyData("un"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("pw"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
