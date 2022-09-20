package automationpractice;

import org.openqa.selenium.WebDriver;

public class Demo {
	static void testA(WebDriver driver)
	{
		driver.get("https://google.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
