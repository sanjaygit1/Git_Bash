package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsEx2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		//id()
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth");

		//name()
		// driver.findElement(By.name("field-keywords")).sendKeys("Nike");

		// locator4:- linkText()
		// >visibleText<
		// driver.findElement(By.linkText("MX Player")).click();

		// locator5:- partialLinkText()
		// driver.findElement(By.partialLinkText("Customer ")).click();
		driver.findElement(By.partialLinkText("s Deals")).click();

	}

}
