package automationpractice;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListPrintDuplicatesOnly extends _StaticBlockForWebdriver
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tessolve1/Desktop/Mydocs/%23qsp/html%20sel%20static%20webpages/MultiList.html");
		Select s=new Select(driver.findElement(By.id("mtr")));
		List<WebElement> li = s.getOptions();
		HashSet<String> al=new HashSet<>();
		for(WebElement w:li) 
		{
			if(al.add(w.getText())==false) 
			{
				System.out.println(w.getText());
			}
		}
		driver.close();
	}
}
