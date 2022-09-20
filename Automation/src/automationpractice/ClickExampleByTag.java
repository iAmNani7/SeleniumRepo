package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickExampleByTag {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		int i=1;
		driver.navigate().to("https://tallycounterstore.com/online-counter");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		while(true) {
			
			driver.findElement(By.id("addBtn rightElement")).click();
			if(i==1000) {
				driver.quit();
			}
			i++;
		}
		
	}

}
