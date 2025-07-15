package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSwitchToMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// method7:-switchTo()----->used to switch driver from one window to another window or
		// switching to popups
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		driver.switchTo().alert().accept();
	}

}
