package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames extends _StaticBlockForWebdriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tessolve1/Desktop/Mydocs/%23qsp/html%20sel%20static%20webpages/pageIframe.html");
		Thread.sleep(500);
		driver.findElement(By.id("t1")).sendKeys("Hi Bruh! ");
		driver.switchTo().frame(0);
		Thread.sleep(500);
		driver.findElement(By.id("t2")).sendKeys("Really Bruh! ");
		driver.switchTo().parentFrame();
		Thread.sleep(500);
		driver.findElement(By.id("t1")).sendKeys("Hi Bruh! 2 ");
		driver.switchTo().frame("f1");
		Thread.sleep(500);
		driver.findElement(By.id("t2")).sendKeys("Really Bruh! 2");
		Thread.sleep(500);
	}
	
}
