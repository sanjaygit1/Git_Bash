package Pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign5Colors {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		Thread.sleep(1000);
//		List<WebElement> allClrs = driver.findElements(By.xpath("(//span[contains(text(),'iPhone 16 128 GB: 5G Mobile Phone')])[1]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
	
		List<WebElement> allClrs = driver.findElements(By.xpath("(//span[contains(text(),'iPhone 16 128 GB: 5G Mobile Phone')])[3]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//div[@class=\"a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view\"]//a"));
		
		Thread.sleep(1000);
	
	for (WebElement clrs : allClrs) 
	{
		System.out.println(clrs.getAttribute("aria-label"));
	}
	}

}
