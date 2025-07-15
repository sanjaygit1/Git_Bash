package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		
//	WebElementMethods:- methods are used to perform action on the webelements inside a Webpage.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://www.saucedemo.com/v1");
	 * 
//method1:-sendKeys()
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
        WebElement PASSWORD = driver.findElement(By.name("password"));
        PASSWORD.sendKeys("secret_sauce");

//method2:- clear()      
        Thread.sleep(1000);
        PASSWORD.clear();
        
        Thread.sleep(1000);
        PASSWORD.sendKeys("secret_sauce");
        
 //method3:-  click()     
     //   driver.findElement(By.id("login-button")).click();
        PASSWORD.submit();*/
        
	/*	driver.get("https://www.flipkart.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("puma");
		
//method4:-	submit()	
		search.submit();*/

//---------------------------------------------------------------------------------------------------------------------------------------
/*		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
//method5:-		isDisplayed()
		if(ele.isDisplayed())
		{
			System.out.println("Element is dispalyed");
		}
		else
		{
			System.out.println("Element not displayed");
		}
		
		WebElement Element = driver.findElement(By.xpath("//a[text()='Create new account']"));
//method6:-	isEnabled()
	if(Element.isEnabled())
	{
		Element.click();
	}
	else
	{
		System.out.println("Element not Enabled");
		
	}
	
	
	WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
	radio.click();
//method7:-isSelected()
	if(radio.isSelected())
	{
		System.out.println("radiobutton is selected");
	}
	else
	{
		System.out.println("radiobutton not selected");
	}
	*/
//---------------------------------------------------------------------------------------------------------------------------------------	
	
//		driver.get("https://www.facebook.com");
		
/*		WebElement ele = driver.findElement(By.linkText("ಕನ್ನಡ"));
//method8:-	getLocation()
		System.out.println(ele.getLocation().getX());	
		System.out.println(ele.getLocation().getY());
	
//method9:-	getSize()	
	    System.out.println(ele.getSize().getHeight());
	    System.out.println(ele.getSize().getWidth());

//method10:-getRect()
	    System.out.println(ele.getRect().getX());
	    System.out.println(ele.getRect().getY());
	    System.out.println(ele.getRect().getHeight());
	    System.out.println(ele.getRect().getWidth());  */
		
	
	driver.get("https://www.flipkart.com");

//method11:-getTagName()
  //	WebElement SearchBar = driver.findElement(By.name("q"));
  //	System.out.println(SearchBar.getTagName());
	
  //	WebElement link = driver.findElement(By.xpath("//span[text()='Mobiles']"));
  //	System.out.println(link.getTagName());
	
//method12:-getAttribute()	
	WebElement SearchBar = driver.findElement(By.name("q"));
//	System.out.println(SearchBar.getAttribute("title"));
	
	WebElement searchIcon = driver.findElement(By.cssSelector("[type=\"submit\"]"));
//	System.out.println(searchIcon.getAttribute("aria-label"));

//method13:-getDomAttribute()
//	System.out.println(searchIcon.getDomAttribute("aria-label"));

//method14:-getDomProperty()	
//	System.out.println(searchIcon.getDomProperty("autocapitalize"));

//method15:-getCssValue()
	WebElement ele = driver.findElement(By.xpath("//span[text()='Kilos']"));
//	System.out.println(ele.getCssValue("font-size"));
//	System.out.println(SearchBar.getCssValue("font-size"));
	
	//BackGround Color
//	System.out.println(ele.getCssValue("color"));
	
//method16:-getAccessibleName()	
	WebElement SearchBar1 = driver.findElement(By.name("q"));
//	System.out.println(SearchBar1.getAccessibleName());
	
    WebElement data = driver.findElement(By.linkText("Mobiles"));
//	System.out.println(data.getAccessibleName());
	
//method17:- getAriaRole()  
//	System.out.println(SearchBar1.getAriaRole());
//	System.out.println(data.getAriaRole());
	

 //method18:-getText()
    driver.findElement(By.name("q")).sendKeys("puma");
    driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
    WebElement item = driver.findElement(By.xpath("(//div[@class='Nx9bqj'])[1]"));
    System.out.println(item.getText());
    
 
	}
}
