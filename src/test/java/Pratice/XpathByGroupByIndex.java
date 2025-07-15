package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupByIndex {

	public static void main(String[] args) {
	
//		Even after using sibling function ,xpath by traversing,xpath by multiple attributes the count is not reduced to 1, in this case we use group by index.
//
//		Synatx: (xpath)[index]
//		           |
//		       xpath expression
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[5]")).click();
	}

}
