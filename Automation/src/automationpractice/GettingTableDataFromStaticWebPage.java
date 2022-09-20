package automationpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTableDataFromStaticWebPage {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tessolve1/Desktop/Mydocs/%23qsp/html%20sel%20static%20webpages/New%20Text%20Document1.html");
		List<WebElement> l1 = driver.findElements(By.xpath("//td"));
		for(WebElement i:l1)
		{
			System.out.print(i.getText()+" ");
		}
		driver.quit();
	}

}
