package com.externalautomation.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNGDemo2 
{
	@Test
	public static void testActiLogin() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/Excel1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count=wb.getSheet("checkinglogin").getLastRowNum();
		System.out.println(count);
		for(int i=1;i<=count;i++)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String un=wb.getSheet("checkinglogin").getRow(i).getCell(0).getStringCellValue();
			String pw=wb.getSheet("checkinglogin").getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			String title;

			try 
			{
				WebDriverWait wait=new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
				title=driver.getTitle();
			}
			catch(TimeoutException e)
			{
				title=driver.getTitle();
			}

			if(title.equals("actiTIME - Enter Time-Track"))
			{
				wb.getSheet("checkinglogin").getRow(i).getCell(2).setCellValue("Pass");
			}
			else
			{
				wb.getSheet("checkinglogin").getRow(i).getCell(2).setCellValue("Failed");
			}

			driver.close();
		}
		FileOutputStream fos=new FileOutputStream("./data/Excel1.xlsx");
		wb.write(fos);
		wb.close();
	}
}