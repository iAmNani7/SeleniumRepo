package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonEnabledOrNotFB {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean ans=driver.findElement(By.name("login")).isEnabled();
		if(ans)
			System.out.println("Login button is enabled");
		else
			System.out.println("Login  button is not enabled");
		driver.close();
	}

}
