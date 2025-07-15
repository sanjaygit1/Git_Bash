package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWebElements {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
        for (WebElement link : allLinks) 
        {
		//	System.out.println(link.getText());//---->Fetching the visible
        	System.out.println(link.getAttribute("href"));//----->Fetching the href AttributeValue
		}
	}

}
