package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScroll1 extends _StaticBlockForWebdriver{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		int y=driver.findElement(By.xpath("//span[text()='Featured video']")).getRect().getY();
		js.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(5000);
	}
}