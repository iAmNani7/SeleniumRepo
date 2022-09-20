package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForAmazonRedmiMobile {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		s.sendKeys("Redmi note 10 pro max");
		Thread.sleep(2000);
		s.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Redmi Note 10 Pro Max')])[9]/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[1]")).click();
		Thread.sleep(2000);
		
	}

}
//

