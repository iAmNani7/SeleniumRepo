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
			String atext=driver.findElement(By.xpath("//p[contains(text(),'You')]")).getText();
			String etext="You Pressed Cancel";
			Assert.assertEquals(atext, etext);
			driver.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			Assert.fail();
			driver.close();
		}

	}
}
