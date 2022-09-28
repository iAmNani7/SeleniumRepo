package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeStatusForCheckBoxInLoginPage {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		boolean ans=driver.findElement(By.name("remember")).isSelected();
		if(ans)
			System.out.println("Checkbox is checked");
		else
			System.out.println("Checkbox is not checked");
		driver.close();
	}

}
