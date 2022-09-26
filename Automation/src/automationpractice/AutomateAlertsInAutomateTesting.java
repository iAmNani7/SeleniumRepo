package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateAlertsInAutomateTesting extends _StaticBlockForWebdriver {
	WebDriver driver; 
	@Test
	public void automationWebsiteAlertTesting()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		try
		{
			driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			driver.switchTo().alert().dismiss();
			String text=driver.findElement(By.xpath("//p[contains(text(),'You')]")).getText();
			if(text.equals("You Pressed Cancel"))
				System.out.println("Passed");
			else
				Assert.fail();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			driver.close();
		}
		finally 
		{
			driver.close();
		}
	}
}
