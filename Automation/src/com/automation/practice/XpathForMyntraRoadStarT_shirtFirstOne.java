package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForMyntraRoadStarT_shirtFirstOne {

		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/men-tshirts");
	String s=driver.findElement(By.xpath("(//h3[.='Roadster'])[1]/../div/span[1]/span[1]")).getText();

	System.out.println(s);
		}

	}
	//

