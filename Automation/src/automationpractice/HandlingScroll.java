package automationpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScroll extends _StaticBlockForWebdriver{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,3000)");
		
	}
}
