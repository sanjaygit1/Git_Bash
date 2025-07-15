package AdvanceScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBarEx {

	public static void main(String[] args) throws Throwable {
		

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
}
}
