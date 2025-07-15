package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) {

		// SVG:- Scalable Vector Graphics
		// Normal xpath or other locators is not applicable on svg elements
		// syntax:--- //*[name()='svg']

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='A_8a-icon']")).click();
		
	}

}
