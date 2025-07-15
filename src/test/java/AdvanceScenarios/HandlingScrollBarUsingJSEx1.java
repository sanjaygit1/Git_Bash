package AdvanceScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingScrollBarUsingJSEx1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		for (int i = 0; i < 5; i++)
		{
			js.executeScript("window.scrollTo(0,1000)");
			Thread.sleep(1000);
		}

		for (int i = 0; i < 5; i++)
		{
			js.executeScript("window.scrollTo(0,-800)");
			Thread.sleep(1000);
		}
	}

}
