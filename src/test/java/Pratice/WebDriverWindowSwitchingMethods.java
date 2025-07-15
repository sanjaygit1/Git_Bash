package Pratice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWindowSwitchingMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

		// method8:-->getWindowHandle()
		// use to fetch the single window id where driver is currently in focus
		String window = driver.getWindowHandle();
		System.out.println(window);

		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();

		// method9:-getWindowHandles()--->use to fetch all the windows id's present in
		// Application
		Set<String> allWins = driver.getWindowHandles();
		System.out.println(allWins);

		//method10:-close()--->closes a single window, where driver is currently in focus
	//	driver.close();
		
		//method11:-quit()--->closes all the windows/tabs including browser
		driver.quit();
	}

}
