package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();

		// syntax1:- [AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");

		// synatx2:- htmltag[AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");

		// syntax3:- Supports only id Locator/AttributeName
		// #--->is the shortcut for id in cssSelector
		//syntax:- #AttributeValue
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

		// syntax4:- Supports only id Locator/AttributeName
		// #--->is the shortcut for id in cssSelector
		//syntax:- htmltag#AttributeValue
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

		// syntax5:- supports only className loctor/AttributeName
		// .--->is the shortcut for className in cssSelector
		// syntax:-.AttributeValue
		// driver.findElement(By.cssSelector(".btn_action")).click();

		// syntax6:- supports only className loctor/AttributeName
		// .--->is the shortcut for className in cssSelector
		//syntax:- htmltag.AttributeValue
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

}
