package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsEx {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.cssSelector("[data-csa-c-slot-id=\"nav_cs_1\"]"));
	   System.out.println(ele.getAccessibleName());
	
	   WebElement search = driver.findElement(By.name("field-keywords"));
	  System.out.println(search.getAccessibleName());

	  
	
	  
	}

}
