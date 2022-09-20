package automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
			System.out.println("URL is successfully navigating and pass");
		else
			System.out.println("URL is not successfully navigating and pass");
		driver.quit();
	}

}
