package com.automation.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiList1 extends BaseClass{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tessolve1/Desktop/Mydocs/%23qsp/html%20sel%20static%20webpages/MultiList.html");
		Select s=new Select(driver.findElement(By.id("cp")));
		List<WebElement> li = s.getAllSelectedOptions();
		for(WebElement i:li)
			System.out.println(i.getText());
		driver.quit();
	}
}
