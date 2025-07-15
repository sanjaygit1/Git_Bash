package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingWebElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Create new account']")).click();

		driver.findElement(By.xpath("//option[@value='25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Oct']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='2021']")).click();
	}

}
