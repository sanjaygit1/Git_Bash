package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) {
		
		//Approach used for HAndling DropDown/ListBox
		//* Using KeyboardStrokes--->Keys class and Robot Class
		//* Using SelectClass
		//* Using WebElements--->Locators
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		
		
		
	}

}
