package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonEx {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("bluetooth");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
