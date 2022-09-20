package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingRadioButtonsPositionIsSameOrNot extends _StaticBlockForWebdriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(20000);
		int y1=driver.findElement(By.xpath("//label[contains(text(),'Female')]")).getLocation().getY();
		int y2=driver.findElement(By.xpath("//label[contains(text(),'Male')]")).getLocation().getY();
		int y3=driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).getLocation().getY();
		if(y1==y2 && y2==y3 && y1==y3)
			System.out.print("All radio buttons are properly aligned");
		else
			System.out.print("All radio buttons are not properly aligned");
		driver.close();

	}
}
