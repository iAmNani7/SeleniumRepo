package com.automation.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends _StaticBlockForWebdriver{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		WebElement listMonthBox=driver.findElement(By.id("month"));
		Select s=new Select(listMonthBox);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("11");
		Thread.sleep(2000);
		s.selectByVisibleText("Jan");
		Thread.sleep(2000);
	
		
		
		
	}

}
