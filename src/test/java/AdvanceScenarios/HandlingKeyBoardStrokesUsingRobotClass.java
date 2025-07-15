package AdvanceScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingRobotClass {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.name("q")).sendKeys("Nike");
//		
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
		// -----------------------------------------------------------------------------

		driver.get("https://www.saucedemo.com/v1");
		driver.findElement(By.name("user-name")).sendKeys("Happy");

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);

		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);

		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);

		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);

	}

}
