package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();

		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
	    System.out.println(price);
	}

}
