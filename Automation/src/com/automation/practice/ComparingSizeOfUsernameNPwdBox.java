package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingSizeOfUsernameNPwdBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement username = driver.findElement(By.id("username"));
		int	tb1w=username.getSize().getWidth();
		int	tb1h=username.getSize().getHeight();
		WebElement pwd = driver.findElement(By.name("pwd"));
		int	tb2w=pwd.getSize().getWidth();
		int	tb2h=pwd.getSize().getHeight();
		/*
		 * System.out.println("Width and height of username box is: "+tb1w+" px and "+
		 * tb1h+" px");
		 * System.out.println("Width and height of password box is: "+tb2w+" px and "+
		 * tb2h+" px");
		 */
		if(tb1w==tb2w && tb1h==tb2h)
			System.out.println("Width and Height of the boxes are equal");
		else
			System.out.println("Width and Height of the boxes are not equal");
		driver.close();
	}
}
