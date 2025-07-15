package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	//	syntax1:- //htmltag[@AttributeName='AttributeValue' and @AttributeName='AttributeValue']
	//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']")).sendKeys("Puma");
		
    //	syntax2:- //htmltag[@AttributeName='AttributeValue' or @AttributeName='AttributeValue']
	//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @dir='aut']")).sendKeys("Bluetooth");
	
	//	synatx3:- //htmltag[contains(@AttributeName,'AttributeValue') and @AttributeName='AttributeValue']
    //	driver.findElement(By.xpath("//input[contains(@class,\"nav-input nav\") and @type=\"submit\"]")).click();
	
	//	syntax4:- //htmltag[@AttributeName='AttributeValue' and text()='AttributeValue']
	//  driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_newreleases\" and text()='New Releases']")).click();
	
    //	synatx5:- //htmltag[contains(@AttributeName,'AttributeValue') and contains(text(),'AttributeValue')]
	    driver.findElement(By.xpath("//a[@class=\"nav-a  \" and contains(text(),'Customer')]")).click();
	}

}
