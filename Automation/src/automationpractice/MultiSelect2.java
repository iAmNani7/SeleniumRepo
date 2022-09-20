package automationpractice;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect2 extends _StaticBlockForWebdriver
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tessolve1/Desktop/Mydocs/%23qsp/html%20sel%20static%20webpages/MultiList.html");
		Select s=new Select(driver.findElement(By.id("mtr")));
		List<WebElement> list = s.getOptions();
		TreeSet<String> listSet=new TreeSet<>();
		for(WebElement e:list)
			listSet.add(e.getText());
		for(String e:listSet) 
			System.out.println(e);
		driver.close();
	}
}
