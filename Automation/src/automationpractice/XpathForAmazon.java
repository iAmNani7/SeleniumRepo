package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForAmazon {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//span[contains(text(),'Redmi Note 10 Pro Max')])[9]/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[1]")).click();
	}
}
