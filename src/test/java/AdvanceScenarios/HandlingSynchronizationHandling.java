package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingSynchronizationHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");

		//syntax:-implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
	
	//Explicit wait
		WebElement login = driver.findElement(By.id("login-button"));
		
		//Explicit wait()
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(login));
//		login.click();
		
//		WebElement ele = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
//		wait.until(ExpectedConditions.titleContains("Swag Labs"));//--->No Execption
//		ele.click();
		
//		WebElement ele = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
//		wait.until(ExpectedConditions.titleContains("Hello"));//--->TimeOutExecption
//		ele.click();
		
		
	FluentWait wait = new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(10));
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.until(ExpectedConditions.elementToBeClickable(login));
	login.click();
	
	
		
	}

}
