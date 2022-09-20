package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleExampleForLocators {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.actitime.com/");
		Thread.sleep(9999);
		int i=1;
		while(true) {
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
			
			i++;
			if(i==4) 
				driver.close();
				
		}
		
		
	}

}
