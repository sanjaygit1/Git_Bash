package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAutoSuggestionEx2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("Bluetooth");
		
		Thread.sleep(1000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']//span"));
	
		for (WebElement sugg : allSugg)
		{
			System.out.println(sugg.getText());
			if(sugg.getText().contains("helmet for bike"))
			{
				sugg.click();
				break;
			}
		}
	
	
	}

}
