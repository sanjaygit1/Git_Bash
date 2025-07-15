package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsEx {

	public static void main(String[] args) throws Throwable  {
		
		WebDriver driver=new ChromeDriver();
		//mathod:-6:-->navigate()
		//navigate().to()--->launching the application
	//	driver.navigate().to("https://www.flipkart.com");-->not recommended in real time
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		//navigate().back()--->to navigate the back page
		Thread.sleep(2000);
		driver.navigate().back();
		
		//navigate().forward()--->to navigate the forward page
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//navigate().refresh()--->use for refresing the webpage
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
