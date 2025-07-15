package AdvanceScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DropDownHandlingExTest {


	public void dropDownHandlingExTest() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();
//		dateList.sendKeys(Keys.ARROW_UP);
//		dateList.sendKeys(Keys.ARROW_UP);
//		dateList.sendKeys(Keys.ARROW_UP);
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		
	}
	
	public void m2()
	{
		System.out.println("m2 pass");
	}

}
