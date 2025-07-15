package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleELementExceptionEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		driver.navigate().refresh();

		login.click();

		
	//@findBy:- used to find path/location of the single webElement by using one condition/locator
	//@findBys:-used to find the path for single Element by using multiple conditions/locators	(Internally acts like AND)
	//@findAll:-used to find the path for single Element by using multiple conditions/locators (Internally acts like OR)	
	}

}
