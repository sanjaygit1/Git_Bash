package Pratice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();

		WebElement searchBar = driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]"));
		searchBar.sendKeys("Mangoes",Keys.ENTER);
//		searchBar.submit();

	Thread.sleep(3000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for (int i = 0; i <1; i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
//	driver.findElement(By.xpath("//li[@class='PaginateItems___StyledLi-sc-1yrbjdr-0 dDBqny' and contains(.,'Alphonso Mango - Badami')]/descendant::button[.='Add']")).click();
driver.findElement(By.xpath("(//li[@class='PaginateItems___StyledLi-sc-1yrbjdr-0 dDBqny']/descendant::button[.='Add'])[1]")).click();
	
	}

}
