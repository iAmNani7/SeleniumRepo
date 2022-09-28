package com.naukari.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="(//input)[1]")
	private WebDriver unbox;
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	private WebDriver pwdbox;
	@FindBy(xpath="//button[@type='submit']")
	private WebDriver lgbtn;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pwd)
	{
		
	}
}
