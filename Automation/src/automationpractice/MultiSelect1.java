package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect1 extends _StaticBlockForWebdriver{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/Tessolve1/Desktop/Mydocs/%23qsp/html%20sel%20static%20webpages/MultiList.html");
		Select s=new Select(driver.findElement(By.id("mtr")));
		s.selectByIndex(0);
		Thread.sleep(1500);
		s.selectByValue("d");
		Thread.sleep(1500);
		s.selectByVisibleText("Vada");
		Thread.sleep(1500);
		if(s.isMultiple()) 
		{
			s.deselectByIndex(0);
			s.deselectByValue("d");
			s.deselectByVisibleText("Vada");
		}
	}
}
