package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagNameAndAttributeName {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		String rs=driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		System.out.println("Text : "+rs); 
		rs=driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		System.out.println("Text : "+rs); 
		driver.quit();
		}
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
}
