package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		//Normal xpath Approach
	//	driver.findElement(By.xpath("//div[text()='July 2025']/ancestor::div[@class='DayPicker-Month']//p[text()='10']")).click();
	
		//Dynamic Xpath
		String monthName = "June 2025";
		String date = "18";
		driver.findElement(By.xpath("//div[text()='"+monthName+"']/ancestor::div[@class='DayPicker-Month']//p[text()='"+date+"']")).click();
		
		
	}

}
