package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameEX {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		List<WebElement> allTags = driver.findElements(By.tagName("img"));
		System.out.println(allTags.size());

	}

}
