package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingActiLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();	
	}
}
