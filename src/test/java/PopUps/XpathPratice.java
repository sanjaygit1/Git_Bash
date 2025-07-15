package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class XpathPratice {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
//----------------------------------------------------------------------------------------------------------------------------	
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		// starts-with
		// WebElement errorMsg = driver.findElement(By.xpath("//span[starts-with(text(),
		// 'Login was')]"));
		// System.out.println(errorMsg.getText());

		// Ends-with
//	 WebElement errorMsg= driver.findElement(By.xpath("//span[ends-with(text(),'try again.')]"));
//	 System.out.println(errorMsg.getText());
//--------------------------------------------------------------------------------------------------------------------------------
		// Relative Locator
//		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
//		WebElement searchBtn = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(searchTF));
//		searchBtn.click();
//		driver.findElement(RelativeLocator.with(By.tagName("a")).above(searchTF)).click();

//	WebElement searchBar = driver.findElement(By.xpath("//input[@value='Search']"));
//	WebElement searchBar1 = driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(searchBar));
//	searchBar1.sendKeys("book");

		WebElement ref = driver.findElement(By.xpath("//a[.='Register']"));
//		driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref)).sendKeys("book");
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(ref)).sendKeys("Hello");
	}

}
