package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAutoSuggestionEx1Test {

	@Test
	public void HandlingAutoSuggestionEx1() throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Nike");
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));

		for (WebElement Ele : allSugg) {
			System.out.println(Ele.getText());

			if (Ele.getText().contains("in Men's Footwear")) {
				Ele.click();
				break;
			}
		}

	}

}
