package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		List<WebElement> allNames = driver.findElements(By.cssSelector("[class='KzDlHZ']"));

		for (WebElement name : allNames) 
		{
			System.out.println(name.getText());
		}
	}

}
