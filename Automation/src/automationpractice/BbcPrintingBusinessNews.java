package automationpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BbcPrintingBusinessNews {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	WebDriver driver;
	@Test
	public void printBbcBusinessNews()
	{
		driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> li = driver.findElements(By.xpath("//h2[contains(text(),'Latest Business News')]/../ul//h3"));
		for(WebElement i:li)
		{
//			Reporter.log(i.getText());
			System.out.println(i.getText());
		}
		driver.close();
	}
}
