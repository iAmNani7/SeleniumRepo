package automationpractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadResumeToNaukariDotCom extends _StaticBlockForWebdriver{
	WebDriver driver;
	@Test
	public void uploadResume()
	{
			driver=new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("login_Layer")).click();
			driver.findElement(By.xpath("(//input)[1]")).sendKeys("naveenkumar.podilli@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Nani@#$");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
			File f=new File("./data/NaveenkumarPodili_UpdatedResume.pdf");
			String path=f.getAbsolutePath();
			driver.findElement(By.id("attachCV")).sendKeys(path);
			driver.close();
	}
}
