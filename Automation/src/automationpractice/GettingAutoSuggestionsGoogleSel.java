package automationpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingAutoSuggestionsGoogleSel{
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> listSel = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(listSel.size());
		for(WebElement i:listSel)
		{
			System.out.println(i.getText());
		}
		listSel.get(listSel.size()-1).click();
	}
}
