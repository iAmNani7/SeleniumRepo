package automationpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBillingClearingDefaultEmailAdress {
	



	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.id("email")).clear();
	}
}

