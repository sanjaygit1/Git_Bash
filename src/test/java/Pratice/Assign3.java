package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		List<WebElement> names = driver.findElements(By.cssSelector("[class='KzDlHZ']"));
        List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
        
        for (int i = 0; i <names.size(); i++)
        {
			System.out.println(names.get(i).getText()+"---------->"+price.get(i).getText());
		}
	}

}
