package Pratice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsEx {

	public static void main(String[] args) {

		// Launching the Browser
		WebDriver driver = new ChromeDriver();

		// method1:-get()---->lunching the Web Application
		driver.get("https://www.flipkart.com");

		// method2:-getTitle()---->fetches the title of the current webpage
		String title = driver.getTitle();
		System.out.println(title);

		// method3:-getCurrentUrl()--->Fetches the url of the current webpage
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// method4:-getPageSource()---->Fetches the source code of the webpage
		String source = driver.getPageSource();
		// System.out.println(source);

		// method5:-manage()---->performs actions on the browser like(maximize,minimize,fullScreen etc)
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();

		// or
//		driver.manage().window().maximize();

		// driver.manage().window().minimize();

		// driver.manage().window().fullscreen();

//		Dimension value = driver.manage().window().getSize();
//		System.out.println(value.getHeight());
//		System.out.println(value.getWidth());

//736
//1382
		
//		Dimension size = new Dimension(200, 800);
//		driver.manage().window().setSize(size);

//		Point position = driver.manage().window().getPosition();
//		System.out.println(position.getX());
//		System.out.println(position.getY());
//		
//		Point pos = new Point(200, 250);
//		driver.manage().window().setPosition(pos);
		
}

}
