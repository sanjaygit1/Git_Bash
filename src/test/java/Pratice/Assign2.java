package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("Bluetooth");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		

		 List<WebElement> names = driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));

		 List<WebElement> price = driver.findElements(By.cssSelector("[class='a-section a-spacing-none a-spacing-top-micro puis-price-instructions-style']"));
	
		 for (int i = 0; i <names.size() ; i++) 
		 {
			System.out.println(names.get(i).getText()+"-------------->"+ price.get(i).getText());
		}
	
	}

}
