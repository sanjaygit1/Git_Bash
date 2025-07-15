package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		// Basic Relative Types of Xpath:-supports all the Attribute name,Attribute
		// Value ,visible text and all the html tags
		// types:-
		// xpath by Attribute
		// xpath by visible text
		// xpath by contains Attribute
		// xpath by contains visible text
		// symbols:- //--->Traversing from parent to any child/entire html doc
		// [ ]---->Back ends
		// @---->Attribute Symbol--->which supports only Attribute
		// text()-->visible Text--->which supports only visible text
		// contains()--->remove the space,special charaters and numbers from the path

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		// syntax1: //htmltag[@AttributeName='AttributeValue']
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nike");
//		driver.findElement(By.xpath("//input[@value='Go']")).click();

//		driver.findElement(By.xpath("//a[@href='/minitv?ref_=nav_avod_desktop_topnav']")).click();

		// syntax2:- //htmltag[text()='AttributeValue']
//		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();

//		driver.findElement(By.xpath("//a[text()='MX Player']")).click();

		// synatx3:- //htmltag[contains(@AttributeName,'AttributeValue')]
//		driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("puma");
//        driver.findElement(By.xpath("//input[contains(@id,'ton')]")).click();
		
		
		// synatx4:- //htmltag[contains(text(),'AttributeValue')]
		driver.findElement(By.xpath("//a[contains(text(),\"Today\")]")).click();
	}
	

}
