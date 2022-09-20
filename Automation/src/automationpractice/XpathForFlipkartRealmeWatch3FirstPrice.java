package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForFlipkartRealmeWatch3FirstPrice {

		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/search?q=realme+watch+3&sid=ajy%2Cbuh&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_10_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_10_na_na_na&as-pos=2&as-type=RECENT&suggestionId=realme+watch+3%7CSmart+Watches&requestId=159d942f-b99c-49cc-b892-479c60c93305&as-searchtext=realme%20wat");
	String s=driver.findElement(By.xpath("(//div[contains(text(),'realme Watch 3')])[1]/../../div[2]/div[1]/div[1]/div[1]")).getText();

	System.out.println(s);
		}

	}
	//

