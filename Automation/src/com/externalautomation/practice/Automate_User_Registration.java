package com.externalautomation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_User_Registration extends _StaticBlockForWebdriver{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.partialLinkText("Sign in")).click();
	driver.findElement(By.id("email_create")).sendKeys("nani3jade@gmail.com");
	driver.findElement(By.xpath("//span[contains(.,'Create an account')]")).click();
	driver.findElement(By.id("id_gender1")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys("Naveenkumar");//first name
	driver.findElement(By.id("customer_lastname")).sendKeys("Podili");//lastname
	driver.findElement(By.id("passwd")).sendKeys("8686056085");//pwd
	Select day=new Select(driver.findElement(By.id("days")));
	day.selectByValue("16");
	Select mon=new Select(driver.findElement(By.id("months")));
	mon.selectByValue("7");
	Select year=new Select(driver.findElement(By.id("years")));
	year.selectByValue("1998");
	driver.findElement(By.id("address1")).sendKeys("Snow Street");
	driver.findElement(By.id("city")).sendKeys("North Pole");
	Select state=new Select(driver.findElement(By.id("id_state")));
	state.selectByVisibleText("Alaska");
	Select country=new Select(driver.findElement(By.id("id_country")));
	country.selectByVisibleText("United States");
	driver.findElement(By.id("phone_mobile")).sendKeys("8889997771");
	driver.findElement(By.id("alias")).clear();
	driver.findElement(By.id("alias")).sendKeys("Home");
	driver.findElement(By.id("submitAccount")).click();
	
}
}

