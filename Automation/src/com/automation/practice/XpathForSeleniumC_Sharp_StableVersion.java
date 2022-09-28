package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForSeleniumC_Sharp_StableVersion {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.selenium.dev/downloads/");
driver.findElement(By.xpath("//p[text()='C#']/../p[2]/a")).click();
driver.navigate().back();
	}

}
//https://www.myntra.com/men-tshirts
