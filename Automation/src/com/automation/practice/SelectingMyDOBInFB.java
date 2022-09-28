package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingMyDOBInFB extends _StaticBlockForWebdriver{

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.findElement(By.linkText("Create New Account")).click();
 Thread.sleep(3000);
 WebElement bd = driver.findElement(By.id("day"));
 Select s=new Select(bd);
 s.selectByValue("16");
 WebElement bm = driver.findElement(By.id("month"));
 Select s1=new Select(bm);
 s1.selectByVisibleText("Jul");
 WebElement by = driver.findElement(By.id("year"));
 Select s2=new Select(by);
 s2.selectByValue("1998");
	}

}
