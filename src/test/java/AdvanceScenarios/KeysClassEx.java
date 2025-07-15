package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClassEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();

		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	}

}
