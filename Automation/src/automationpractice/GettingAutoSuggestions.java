package automationpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingAutoSuggestions //extends $StaticBlockForWebdriver
{
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> listA = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		System.out.println(listA.size());
		for(WebElement i:listA)
		{
			System.out.println(i.getText());
		}
		driver.close();
		
	}

}
