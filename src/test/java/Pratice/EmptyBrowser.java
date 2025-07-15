package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {

//case1:- WebDriver version:-3.141.59 and Browser Server:-chromeDriver.exe		

//		String key="webdriver.chrome.driver";
//		String Value="./src/main/resources/chromedriver.exe";
//		System.setProperty(key, Value);
//	    WebDriver driver=new ChromeDriver();

//case2:- webdriver version:-3.141.59 , webdrivermanager:-6.1.0		
		// webdrivermanage:- Act as a browser server, which supports all the browsers.

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();

//        WebDriverManager.edgedriver().setup();
//        WebDriver driver=new EdgeDriver();

//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		
		//case3:-webdriver version:-4.32.0 , webdrivermanager:-6.1.0	
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		

		//case4:-webdriver version:-4.32.0 
	//	WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new EdgeDriver();
		
	}

}
