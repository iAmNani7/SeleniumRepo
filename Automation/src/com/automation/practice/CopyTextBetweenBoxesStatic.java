package com.automation.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyTextBetweenBoxesStatic {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:\\C:\\Users\\Tessolve1\\Desktop\\New Text Document.html");
		driver.findElement(By.xpath("(//input[@value='A'])[1]")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.xpath("(//input[@value='B'])[1]")).sendKeys(Keys.CONTROL+"av");
	}

}
