package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

//		driver.get("https://www.saucedemo.com/v1");
//
//		WebElement USERNAME = driver.findElement(By.id("user-name"));
//		WebElement PASSWORD = driver.findElement(By.name("password"));
//		WebElement LOGIN = driver.findElement(By.id("login-button"));
//		act.sendKeys(USERNAME, "standard_user").perform();
//		act.sendKeys(PASSWORD, "secret_sauce").perform();
//		act.click(LOGIN).perform();

		// or
		
		// act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD,"secret_sauce").click(LOGIN).build().perform();
//---------------------------------------------------------------------------------------------------------------------------------------------------
//		driver.get("https://www.flipkart.com");
//		
//		WebElement link = driver.findElement(By.xpath("//span[text()='Login']"));
//		act.moveToElement(link).perform();
//		
//		WebElement ELe = driver.findElement(By.xpath("//span[text()='Mobiles']"));
//		act.contextClick(ELe).perform();
//--------------------------------------------------------------------------------------------------------------------------------------------------------
		
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");	
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		act.clickAndHold(drag).perform();
//		act.release(drop).perform();
//		
//		//or
//		
//		act.clickAndHold(drag).release(drop).build().perform();
//		
//		//or
//		
//		act.dragAndDrop(drag, drop).perform();
		
//----------------------------------------------------------------------------------------------------------------------------------------------------
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//	
//		act.doubleClick(ele).perform();
//-------------------------------------------------------------------------------------------------------------------------------------------------
		
//		driver.get("https://www.makemytrip.com");
		
//		act.moveByOffset(10, 20).click().perform();
//--------------------------------------------------------------------------------------------------------------------------------------------------------		
		driver.get("https://www.facebook.com");
		WebElement link = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));

		Thread.sleep(2000);
	
		act.scrollToElement(link).moveToElement(link).click().build().perform();
	
		
		
	}

}
