package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingKeysClass {

	public static void main(String[] args) {
		
		//To handle keyboard strokes we have two approach :-
//        a) By using keys class.--->Static Keys
//        b) By using robot class.--->Non Static Keys

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");

//case1:-
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		WebElement PassWOrd = driver.findElement(By.name("password"));
//		PassWOrd.sendKeys("secret_sauce",Keys.ENTER);

//case2:-
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//        driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
         
//case3:-
//		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);

		//----------------------------------------------------------------------------------------------------------------------
//Ex2:-
		WebElement USername = driver.findElement(By.name("user-name"));
		USername.sendKeys("Shobha", Keys.CONTROL + "a");
		USername.sendKeys(Keys.CONTROL + "c");
		USername.sendKeys(Keys.TAB,Keys.CONTROL +"v");
	} 

}
