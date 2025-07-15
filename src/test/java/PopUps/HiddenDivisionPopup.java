package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
	}

}
